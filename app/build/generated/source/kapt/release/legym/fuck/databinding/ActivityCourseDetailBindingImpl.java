package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCourseDetailBindingImpl extends ActivityCourseDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.course_detail_name_title, 6);
        sViewsWithIds.put(R.id.course_detail_time_title, 7);
        sViewsWithIds.put(R.id.course_detail_teacher_title, 8);
        sViewsWithIds.put(R.id.course_detail_project_title, 9);
        sViewsWithIds.put(R.id.insetDivider, 10);
        sViewsWithIds.put(R.id.course_detail_project_info_title, 11);
        sViewsWithIds.put(R.id.course_detail_grade_title, 12);
        sViewsWithIds.put(R.id.course_detail_campus_title, 13);
        sViewsWithIds.put(R.id.course_detail_start_date_title, 14);
        sViewsWithIds.put(R.id.course_detail_start_date, 15);
        sViewsWithIds.put(R.id.course_detail_end_date_title, 16);
        sViewsWithIds.put(R.id.course_detail_end_date, 17);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCourseDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityCourseDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (com.google.android.material.divider.MaterialDivider) bindings[10]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatTextView) bindings[5];
        this.mboundView5.setTag(null);
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
        if (BR.detail == variableId) {
            setDetail((legym.fuck.logic.legym.network.model.course.CourseDetailResultBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetail(@Nullable legym.fuck.logic.legym.network.model.course.CourseDetailResultBean Detail) {
        this.mDetail = Detail;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.detail);
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
        java.lang.String detailStartTime = null;
        java.lang.Integer detailYear = null;
        java.lang.String detailTeacherName = null;
        java.lang.String detailYearToString = null;
        legym.fuck.logic.legym.network.model.course.CourseDetailResultBean detail = mDetail;
        java.lang.String detailProjectName = null;
        java.lang.String detailCampusName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (detail != null) {
                    // read detail.startTime
                    detailStartTime = detail.getStartTime();
                    // read detail.year
                    detailYear = detail.getYear();
                    // read detail.teacherName
                    detailTeacherName = detail.getTeacherName();
                    // read detail.projectName
                    detailProjectName = detail.getProjectName();
                    // read detail.campusName
                    detailCampusName = detail.getCampusName();
                }


                if (detailYear != null) {
                    // read detail.year.toString()
                    detailYearToString = detailYear.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, detailStartTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, detailTeacherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, detailProjectName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, detailYearToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, detailCampusName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detail
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}