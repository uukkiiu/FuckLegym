package legym.fuck.utils

import com.liangguo.androidkit.string.ChineseStringMatcher
import legym.fuck.logic.clouds.model.RunningMap


/**
 * @author ldh
 * 时间: 2022/3/24 17:52
 *
 */
object MatchUtils {

    /**
     * 通过学校的名称对获取到的地图的匹配度进行排序。
     */
    fun List<RunningMap>.sortBySchoolName(schoolName: String) = sortedWith { map1, map2 ->
        (ChineseStringMatcher(
            map2.name,
            schoolName
        ).matchingRate - ChineseStringMatcher(map1.name, schoolName).matchingRate).toInt()
    }


}