package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHuodongBindingImpl extends ItemHuodongBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_selected_background, 4);
        sViewsWithIds.put(R.id.clickView, 5);
        sViewsWithIds.put(R.id.view_selected, 6);
        sViewsWithIds.put(R.id.container_image_cover, 7);
        sViewsWithIds.put(R.id.image_cover, 8);
        sViewsWithIds.put(R.id.shadow_state, 9);
        sViewsWithIds.put(R.id.text_state, 10);
        sViewsWithIds.put(R.id.container_main_content, 11);
        sViewsWithIds.put(R.id.text_conflict_warning, 12);
        sViewsWithIds.put(R.id.spacer2, 13);
        sViewsWithIds.put(R.id.text_people, 14);
        sViewsWithIds.put(R.id.text_limit_people, 15);
        sViewsWithIds.put(R.id.container_widget_end, 16);
        sViewsWithIds.put(R.id.widget_end_button, 17);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHuodongBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ItemHuodongBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (android.view.View) bindings[9]
            , (android.widget.Space) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.view.View) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[17]
            );
        this.cardView.setTag(null);
        this.subtitle1.setTag(null);
        this.subtitle2.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.activity == variableId) {
            setActivity((legym.fuck.logic.legym.network.model.huodong.HuodongItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActivity(@Nullable legym.fuck.logic.legym.network.model.huodong.HuodongItem Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
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
        java.lang.String activityAddress = null;
        java.lang.String activityName = null;
        legym.fuck.logic.legym.network.model.huodong.HuodongItem activity = mActivity;

        if ((dirtyFlags & 0x3L) != 0) {



                if (activity != null) {
                    // read activity.address
                    activityAddress = activity.getAddress();
                    // read activity.name
                    activityName = activity.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle1, activityAddress);
            legym.fuck.ui.huodong.HuoDongBindingAdapter.setActivityDate(this.subtitle2, activity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, activityName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): activity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}