package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRunningBindingImpl extends ActivityRunningBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_day_progress, 1);
        sViewsWithIds.put(R.id.progress_day, 2);
        sViewsWithIds.put(R.id.text_progress_day, 3);
        sViewsWithIds.put(R.id.check_progress_day, 4);
        sViewsWithIds.put(R.id.today_has_run_title, 5);
        sViewsWithIds.put(R.id.today_has_run, 6);
        sViewsWithIds.put(R.id.card_week_progress, 7);
        sViewsWithIds.put(R.id.progress_week, 8);
        sViewsWithIds.put(R.id.text_progress_week, 9);
        sViewsWithIds.put(R.id.check_progress_week, 10);
        sViewsWithIds.put(R.id.week_has_run_title, 11);
        sViewsWithIds.put(R.id.week_has_run, 12);
        sViewsWithIds.put(R.id.driver1, 13);
        sViewsWithIds.put(R.id.text_running_introduction, 14);
        sViewsWithIds.put(R.id.rangeSlider, 15);
        sViewsWithIds.put(R.id.text_slider_value, 16);
        sViewsWithIds.put(R.id.layout_settings, 17);
        sViewsWithIds.put(R.id.setting_choose_area, 18);
        sViewsWithIds.put(R.id.setting_choose_type, 19);
        sViewsWithIds.put(R.id.button_upload, 20);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRunningBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityRunningBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[20]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[17]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[8]
            , (com.google.android.material.slider.RangeSlider) bindings[15]
            , (com.liangguo.preference.views.CommonSettingView) bindings[18]
            , (com.liangguo.preference.views.CommonSettingView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}