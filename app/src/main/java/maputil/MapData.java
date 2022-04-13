package maputil;

import android.content.Context;
import android.content.SharedPreferences;

import com.alibaba.fastjson.JSONObject;
import com.liangguo.easyingcontext.EasyingContext;

import java.util.List;

import legym.fuck.R;

/**
 * @author ForeverDdB   
 * @ClassName MapData
 * @Description
 * @createTime 2022年 03月24日 19:26
 **/
public class MapData {
    /**
     * 保存地图
     *
     * @param name      地图名称
     * @param latitude  纬度List
     * @param longitude 经度List
     * @return boolean 是否保存成功
     */
    public static boolean saveMap(String name, List<Double> latitude, List<Double> longitude) {
        SharedPreferences sharedPreferences = EasyingContext.INSTANCE.getContext().getSharedPreferences(EasyingContext.INSTANCE.getContext().getString(R.string.local_maps_path), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        JSONObject data = new JSONObject();
        data.put("latitude", latitude);
        data.put("longitude", longitude);
        try {
            editor.putString(name, data.toJSONString());
            editor.apply();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 检查是否已经保存过自定义路线
     *
     * @return 保存过则为true，反正为false
     */
    public static boolean hasDIYPath() {
        SharedPreferences sharedPreferences = EasyingContext.INSTANCE.getContext().getSharedPreferences(EasyingContext.INSTANCE.getContext().getString(R.string.local_maps_path), Context.MODE_PRIVATE);
        try {
            String map = sharedPreferences.getString(EasyingContext.INSTANCE.getContext().getString(R.string.diy_path), "none");
            return !map.equals("none");
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

}
