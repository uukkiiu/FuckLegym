package legym.fuck.ui.run.logic


/**
 * @author ldh
 * 时间: 2022/3/17 14:55
 *
 */
sealed class RunningType {

    /**
     * 储存在Preference的值
     */
    val prefValue = javaClass.simpleName

    /**
     * 给用户显示的文字，同时也是json传的文字
     */
    open val title: String = ""

    /**
     * 自由跑
     */
    object Free : RunningType() {
        override val title = "自由跑"
    }

    /**
     * 定点跑
     */
    object Point : RunningType() {
        override val title = "定点跑"
    }


    /**
     * 范围跑
     */
    object Range : RunningType() {
        override val title = "范围跑"
    }


    companion object {
        /**
         * 通过Preference储存的值来找到对应的类型。与上边[prefValue]相对应。
         */
        fun getRunningTypeByPrefValue(value: String) =
            when (value) {
                Range.prefValue -> Range
                Point.prefValue -> Point
                else -> Free
            }

        val allTypes: List<RunningType>
            get() = listOf(Free, Point, Range)

    }

}
