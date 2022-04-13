package legym.fuck.widget.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


/**
 * @author ldh
 * 时间: 2022/3/7 10:54
 *
 *
 * 在ViewPager2中适配几个页面的Fragment，继承于官方接口[FragmentStateAdapter]。
 *
 * 为了提高代码的复用性以及解决内存泄漏的问题，写了这么一个工具类。仅需要传入几个页面的Fragment的Class，就可以自动生成Fragment对象。
 */
class PagerFragmentAdapter(
    fragmentActivity: FragmentActivity,
    private vararg val classes: Class<out Fragment>
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = classes.size

    /**
     * 写Fragment一定要加入空构造函数。
     */
    override fun createFragment(position: Int): Fragment = classes[position].newInstance()

}

/**
 * 通过懒加载的方式提供一个[FragmentStateAdapter]。
 *
 * 简便用法：
 *
 * 在FragmentActivity中
 *
 * ```kotlin
 * val adapter by pagerFragmentAdapter(AFragment::class.java, BFragment::class.java)
 * ```
 */
fun FragmentActivity.pagerFragmentAdapter(vararg classes: Class<out Fragment>) = lazy {
    PagerFragmentAdapter(this, *classes)
}
