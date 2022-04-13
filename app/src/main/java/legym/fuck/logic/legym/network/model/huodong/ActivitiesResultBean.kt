package legym.fuck.logic.legym.network.model.huodong

data class ActivitiesResultBean(
    val items: List<HuodongItem>,
    val pageNum: Int?,
    val pageSize: Int?,
    val total: Int?
)

data class HuodongItem(
    //体育场
    val address: String,
    val bgUrl: String?,
    val departureStartTime: Any?,
    val endRegisterTime: String,
    val endTime: String,
    val id: String,
    val isRegister: Boolean,
    val isSign: Boolean?,
    val limitPeopleNumber: Int,
    //第三空间周六清水河校区体育场
    val name: String,
    val openSignTimes: Int?,
    /**
     * 签到类型
     * 2: 二维码
     */
    val performSignType: Int?,
    val performTime: Int?,
    val registerPeople: Int,
    val signTime: Int?,
    val signType: Int?,
    val startRegisterTime: String,
    val startTime: String,
    /**
     * - 0 报名还未开始
     * - 1 报名进行中
     * - 2 报名已结束但活动还未开始
     * - 4 活动进行中
     * - 5 活动已结束
     */
    val state: Int,
    val stateName: String,
)

/**
 * 该活动是否还可以报名
 *
 * 可以报名条件：
 * - 剩余有名额
 * - 还未报名该活动
 * - （状态为 0 或 1） 或 （状态为 2 且目前还没有结束报名）
 */
val HuodongItem.isRegisterAble: Boolean
    get() = (limitPeopleNumber - registerPeople > 0) && !isRegister && state < 2 && isTimeRegisterAble

/**
 * 当前的时间在活动的报名时间范围内
 */
val HuodongItem.isTimeRegisterAble: Boolean
    get() = (LongRange(
        startRegisterTime.toLongOrNull() ?: 0L,
        endRegisterTime.toLongOrNull() ?: Long.MAX_VALUE
    ).contains(System.currentTimeMillis()))

/*

W: │ Body:
W: │ {
W: │    "code": 0,
W: │    "message": null,
W: │    "data": {
W: │       "pageNum": 0,
W: │       "pageSize": 999,
W: │       "total": 4,
W: │       "items": [
W: │          {
W: │             "id": "8a9781d17fe5a00e017fe8d8d2fa10e8",
W: │             "name": "第三空间周天沙河校区体育场",
W: │             "state": 4,
W: │             "stateName": "活动进行中",
W: │             "startRegisterTime": "1649520000000",
W: │             "endRegisterTime": "1649595600000",
W: │             "startTime": "1649548800000",
W: │             "endTime": "1649599200000",
W: │             "address": "体育场",
W: │             "bgUrl": "https:\/\/static.college.legym.cn\/images\/2022\/03\/10\/dd243245bc6444fdac030cba4016636
W: │ e.png",
W: │             "limitPeopleNumber": 5000,
W: │             "registerPeople": 893,
W: │             "departureStartTime": null,
W: │             "isRegister": false,
W: │             "isSign": null,
W: │             "signType": null,
W: │             "signTime": null,
W: │             "performSignType": null,
W: │             "openSignTimes": null,
W: │             "performTime": null
W: │          },
W: │          {
W: │             "id": "8a9781d17fe5a00e017fe8d8d2f510b8",
W: │             "name": "第三空间周天清水河校区体育场",
W: │             "state": 4,
W: │             "stateName": "活动进行中",
W: │             "startRegisterTime": "1649520000000",
W: │             "endRegisterTime": "1649595600000",
W: │             "startTime": "1649548800000",
W: │             "endTime": "1649599200000",
W: │             "address": "体育场",
W: │             "bgUrl": "https:\/\/static.college.legym.cn\/images\/2022\/03\/10\/dd243245bc6444fdac030cba4016636
W: │ e.png",
W: │             "limitPeopleNumber": 5000,
W: │             "registerPeople": 967,
W: │             "departureStartTime": null,
W: │             "isRegister": false,
W: │             "isSign": null,
W: │             "signType": null,
W: │             "signTime": null,
W: │             "performSignType": null,
W: │             "openSignTimes": null,
W: │             "performTime": null
W: │          },
W: │          {
W: │             "id": "8a9781d17fe5a00e017fe8d8d2ef1088",
W: │             "name": "第三空间周天清水河校区综训馆",
W: │             "state": 4,
W: │             "stateName": "活动进行中",
W: │             "startRegisterTime": "1649520000000",
W: │             "endRegisterTime": "1649595600000",
W: │             "startTime": "1649548800000",
W: │             "endTime": "1649599200000",
W: │             "address": "综训馆",
W: │             "bgUrl": "https:\/\/static.college.legym.cn\/images\/2022\/03\/10\/dd243245bc6444fdac030cba4016636
W: │ e.png",
W: │             "limitPeopleNumber": 5000,
W: │             "registerPeople": 3041,
W: │             "departureStartTime": null,
W: │             "isRegister": false,
W: │             "isSign": null,
W: │             "signType": null,
W: │             "signTime": null,
W: │             "performSignType": null,
W: │             "openSignTimes": null,
W: │             "performTime": null
W: │          },
W: │          {
W: │             "id": "8a9781d17fe5a00e017fe8d8d3061150",
W: │             "name": "第三空间周天海南校区运动场",
W: │             "state": 4,
W: │             "stateName": "活动进行中",
W: │             "startRegisterTime": "1649520000000",
W: │             "endRegisterTime": "1649595600000",
W: │             "startTime": "1649545200000",
W: │             "endTime": "1649599200000",
W: │             "address": "运动场",
W: │             "bgUrl": "https:\/\/static.college.legym.cn\/images\/2022\/03\/10\/dd243245bc6444fdac030cba4016636
W: │ e.png",
W: │             "limitPeopleNumber": 5000,
W: │             "registerPeople": 164,
W: │             "departureStartTime": null,
W: │             "isRegister": false,
W: │             "isSign": null,
W: │             "signType": null,
W: │             "signTime": null,
W: │             "performSignType": null,
W: │             "openSignTimes": null,
W: │             "performTime": null
W: │          }
W: │       ]
W: │    }
W: │ }
W: └───────────────────────────────────────────────────────────────────────────────────────


 */


/*
我的活动

W: │ Body:
W: │ {
W: │    "code": 0,
W: │    "message": null,
W: │    "data": {
W: │       "pageNum": 1,
W: │       "pageSize": 999,
W: │       "total": 1,
W: │       "items": [
W: │          {
W: │             "id": "8a9781d17fe5a00e017fe968c88c2038",
W: │             "name": "2022年室内体测",
W: │             "state": 4,
W: │             "stateName": "活动进行中",
W: │             "startRegisterTime": "1649178000000",
W: │             "endRegisterTime": "1649655000000",
W: │             "startTime": "1649658600000",
W: │             "endTime": "1649664000000",
W: │             "address": "后勤大楼体测中心",
W: │             "bgUrl": "https:\/\/static.college.legym.cn\/images\/2022\/03\/10\/c6091560a19a40ad873aca9977d285bd.png",
W: │             "limitPeopleNumber": 167,
W: │             "registerPeople": 43,
W: │             "departureStartTime": null,
W: │             "isRegister": true,
W: │             "isSign": false,
W: │             "signType": null,
W: │             "signTime": null,
W: │             "performSignType": null,
W: │             "openSignTimes": null,
W: │             "performTime": null
W: │          }
W: │       ]
W: │    }
W: │ }
W: └───────────────────────────────────────────────────────────────────────────────────────

 */
