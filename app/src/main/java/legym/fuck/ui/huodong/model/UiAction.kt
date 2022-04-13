package legym.fuck.ui.huodong.model

import legym.fuck.logic.legym.network.model.huodong.HuodongItem


/**
 * @author ldh
 * 时间: 2022/3/28 11:05
 *
 */
 sealed class UiAction {

    /**
     * 去报名
     */
     class GoSignUp(val activity: HuodongItem) : UiAction()

    /**
     * 取消报名
     */
    class CancelSignUp(val id: String) : UiAction()

    /**
     * 活动签到
     */
    class ActivitySignIn(val activityId: String) : UiAction()

    /**
     * 点击活动项之后
     */
    class OnActivityClick(val activity: HuodongItem, val index: Int) : UiAction()

 }