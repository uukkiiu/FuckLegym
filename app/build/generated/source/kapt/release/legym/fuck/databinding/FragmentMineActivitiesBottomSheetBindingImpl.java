package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMineActivitiesBottomSheetBindingImpl extends FragmentMineActivitiesBottomSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.statistic_title, 1);
        sViewsWithIds.put(R.id.graded_card, 2);
        sViewsWithIds.put(R.id.statistic_purpose_title, 3);
        sViewsWithIds.put(R.id.activity_purpose, 4);
        sViewsWithIds.put(R.id.activity_purpose_progress, 5);
        sViewsWithIds.put(R.id.activity_registered_title, 6);
        sViewsWithIds.put(R.id.activity_registered, 7);
        sViewsWithIds.put(R.id.activity_signed_title, 8);
        sViewsWithIds.put(R.id.activity_signed, 9);
        sViewsWithIds.put(R.id.card_second, 10);
        sViewsWithIds.put(R.id.statistic_no_grade_title, 11);
        sViewsWithIds.put(R.id.activity_registered_title_no_grade, 12);
        sViewsWithIds.put(R.id.activity_registered_no_grade, 13);
        sViewsWithIds.put(R.id.activity_signed_title_no_grade, 14);
        sViewsWithIds.put(R.id.activity_signed_no_grade, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMineActivitiesBottomSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentMineActivitiesBottomSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.progressindicator.LinearProgressIndicator) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
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