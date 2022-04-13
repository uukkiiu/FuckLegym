package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRunningHistoryBindingImpl extends ItemRunningHistoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_date, 4);
        sViewsWithIds.put(R.id.driver, 5);
        sViewsWithIds.put(R.id.text_effective_mileage_title, 6);
        sViewsWithIds.put(R.id.text_effective_total_title, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRunningHistoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemRunningHistoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.itemRunningHistory.setTag(null);
        this.textEffectiveMileage.setTag(null);
        this.textRunningType.setTag(null);
        this.textTotalMileage.setTag(null);
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
        if (BR.grade == variableId) {
            setGrade((legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGrade(@Nullable legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail Grade) {
        this.mGrade = Grade;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.grade);
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
        java.lang.String gradeRunningTypeName = null;
        legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail grade = mGrade;
        java.lang.String gradeEffectiveMileage = null;
        java.lang.String gradeTotalMileage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (grade != null) {
                    // read grade.runningTypeName
                    gradeRunningTypeName = grade.getRunningTypeName();
                    // read grade.effectiveMileage
                    gradeEffectiveMileage = grade.getEffectiveMileage();
                    // read grade.totalMileage
                    gradeTotalMileage = grade.getTotalMileage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textEffectiveMileage, gradeEffectiveMileage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textRunningType, gradeRunningTypeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTotalMileage, gradeTotalMileage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): grade
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}