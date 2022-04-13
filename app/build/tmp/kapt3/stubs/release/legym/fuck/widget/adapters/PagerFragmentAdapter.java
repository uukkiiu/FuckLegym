package legym.fuck.widget.adapters;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/7 10:54
 *
 *
 * 在ViewPager2中适配几个页面的Fragment，继承于官方接口[FragmentStateAdapter]。
 *
 * 为了提高代码的复用性以及解决内存泄漏的问题，写了这么一个工具类。仅需要传入几个页面的Fragment的Class，就可以自动生成Fragment对象。
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R \u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u000e"}, d2 = {"Llegym/fuck/widget/adapters/PagerFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "classes", "", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/Class;)V", "[Ljava/lang/Class;", "createFragment", "position", "", "getItemCount", "app_release"})
public final class PagerFragmentAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.lang.Class<? extends androidx.fragment.app.Fragment>[] classes = null;
    
    public PagerFragmentAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends androidx.fragment.app.Fragment>... classes) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * 写Fragment一定要加入空构造函数。
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}