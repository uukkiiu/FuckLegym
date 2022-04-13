package fucklegym.top.entropy;

import android.util.Log;

import com.alibaba.fastjson.*;
import com.liangguo.androidkit.app.SystemUtil;

import javax.net.ssl.HttpsURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

import legym.fuck.logic.legym.network.Encrypter;

public class NetworkSupport {
    public enum UploadStatus {
        SUCCESS, FAIL, WARNING, NOTLOGIN;
    }

    private static final String URL_UPLOAD_RUNNINGDETAIL = "https://cpes.legym.cn/running/app/uploadRunningDetails";

    private static final double CALORIE_PER_MILEAGE = 58.3;

    public static JSONObject postForReturn(String url, Map<String, String> header, String content) throws IOException {
        URL serverUrl = new URL(url);
        HttpsURLConnection conn = (HttpsURLConnection) serverUrl.openConnection();
        conn.setRequestMethod("POST");
//        conn.setDoOutput(true);
//        conn.setDoInput(true);
        for (Map.Entry<String, String> entry : header.entrySet()) {
            conn.setRequestProperty(entry.getKey(), entry.getValue());
        }
        OutputStream out = conn.getOutputStream();
        out.write(content.getBytes(StandardCharsets.UTF_8));
        conn.connect();
        StringBuilder stringBuffer = new StringBuilder();
        ;
        InputStreamReader reader = new InputStreamReader(conn.getInputStream());
        BufferedReader buffer = new BufferedReader(reader);
        String tmp;
        while ((tmp = buffer.readLine()) != null) {
            stringBuffer.append(tmp);
        }
        return JSON.parseObject(stringBuffer.toString());
    }


    public static UploadStatus uploadRunningDetail(String accessToken, String limitationsGoalsSexInfoId, String semesterId, double totMileage, double validMileage, Date startTime, Date endTime, String map, String type) throws IOException {

        HashMap<String, String> header = new HashMap<>();
        header.put("Content-type", "application/json");
        header.put("Authorization", "Bearer " + accessToken);
        Random random = new Random(System.currentTimeMillis());
        //随机便宜不在这里写，在调用方逻辑就写好
        //随机偏移一定的跑步路程避免整数
//        double offset = random.nextDouble() / 100;
//        if (totMileage >= 3.5) {
//            totMileage -= offset;
//            validMileage -= offset;
//        } else {
//            totMileage += offset;
//            validMileage += offset;
//        }
        JSONObject content = new JSONObject();

        //新加了这两个参数, json里有，之前没加过
        content.put("systemVersion", SystemUtil.INSTANCE.getSystemVersion());
        content.put("deviceType", SystemUtil.INSTANCE.getSystemModel());

        double pace = 0.5 + random.nextInt(6) / 10.0;
        content.put("paceRange", pace);
        content.put("totalMileage", totMileage);
        content.put("limitationsGoalsSexInfoId", limitationsGoalsSexInfoId);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        content.put("endTime", formatter.format(endTime));
        content.put("startTime", formatter.format(startTime));
        content.put("effectiveMileage", validMileage);
        content.put("semesterId", semesterId);
        content.put("scoringType", 1);
        content.put("signPoint", new JSONArray());
        content.put("totalPart", 1);
        int calorie = (int) (totMileage * CALORIE_PER_MILEAGE);
        content.put("calorie", calorie);
        ArrayList<HashMap<String, String>> runPoints = new ArrayList<>();
        try {
            ArrayList<Pair<Double, Double>> genPoints = PathGenerator.genRegularRoutine(map, totMileage);
            for (Pair<Double, Double> point : genPoints) {
                HashMap<String, String> tmp = new HashMap<>();
                tmp.put("latitude", point.getKey().toString());
                tmp.put("longitude", point.getValue().toString());
                runPoints.add(tmp);
            }
        }catch (Exception e){
            e.printStackTrace();
            return UploadStatus.FAIL;
        }
        int keeptime = (int) (endTime.getTime() - startTime.getTime()) / 1000;
        content.put("keepTime", keeptime);
        content.put("routineLine", runPoints);
        content.put("type", type);
        int paceNumber = (int) (totMileage * 1000 / pace / 2);
        content.put("paceNumber", paceNumber);
        content.put("effectivePart", 1);
        content.put("gpsMileage", totMileage);
        content.put("uneffectiveReason", "");
        int avePace = ((int) ((endTime.getTime() - startTime.getTime()) / 1000 / totMileage)) * 1000;
        content.put("avePace", avePace);
        //生成关于本次跑步数据的SHA1签名
        content.put("signDigital", Encrypter.getSha1(validMileage
                + "1"
                + formatter.format(startTime)
                + calorie
                + avePace
                + keeptime
                + paceNumber
                + totMileage
                + "1" + Encrypter.run_salt));


        //System.out.println(content.toString());return UploadStatus.NOTLOGIN;
        JSONObject res = postForReturn(URL_UPLOAD_RUNNINGDETAIL, header, content.toString());
        Log.d("runRes", "uploadRunningDetail: " + res.toString());
        //System.out.println(res.toString());
        //{"code":0,"data":true}
        if (res.getBoolean("data")) return UploadStatus.SUCCESS;
        else return UploadStatus.FAIL;
    }

}
