package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCourseBindingImpl extends ActivityCourseBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.current_course_id, 1);
        sViewsWithIds.put(R.id.course_detail_container, 2);
        sViewsWithIds.put(R.id.course_name_title, 3);
        sViewsWithIds.put(R.id.course_name, 4);
        sViewsWithIds.put(R.id.course_info_recycler_view_container, 5);
        sViewsWithIds.put(R.id.course_info_title, 6);
        sViewsWithIds.put(R.id.course_info_sign_purpose, 7);
        sViewsWithIds.put(R.id.course_info_recycler_view, 8);
        sViewsWithIds.put(R.id.driver1, 9);
        sViewsWithIds.put(R.id.text_course_introduction, 10);
        sViewsWithIds.put(R.id.button_course_sign, 11);
        sViewsWithIds.put(R.id.button_all_course, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCourseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityCourseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
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