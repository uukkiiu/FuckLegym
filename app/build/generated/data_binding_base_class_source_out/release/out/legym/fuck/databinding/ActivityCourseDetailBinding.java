// Generated by data binding compiler. Do not edit!
package legym.fuck.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.divider.MaterialDivider;
import java.lang.Deprecated;
import java.lang.Object;
import legym.fuck.R;
import legym.fuck.logic.legym.network.model.course.CourseDetailResultBean;

public abstract class ActivityCourseDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView courseDetailCampusTitle;

  @NonNull
  public final AppCompatTextView courseDetailEndDate;

  @NonNull
  public final AppCompatTextView courseDetailEndDateTitle;

  @NonNull
  public final AppCompatTextView courseDetailGradeTitle;

  @NonNull
  public final AppCompatTextView courseDetailNameTitle;

  @NonNull
  public final AppCompatTextView courseDetailProjectInfoTitle;

  @NonNull
  public final AppCompatTextView courseDetailProjectTitle;

  @NonNull
  public final AppCompatTextView courseDetailStartDate;

  @NonNull
  public final AppCompatTextView courseDetailStartDateTitle;

  @NonNull
  public final AppCompatTextView courseDetailTeacherTitle;

  @NonNull
  public final AppCompatTextView courseDetailTimeTitle;

  @NonNull
  public final MaterialDivider insetDivider;

  @Bindable
  protected CourseDetailResultBean mDetail;

  protected ActivityCourseDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView courseDetailCampusTitle, AppCompatTextView courseDetailEndDate,
      AppCompatTextView courseDetailEndDateTitle, AppCompatTextView courseDetailGradeTitle,
      AppCompatTextView courseDetailNameTitle, AppCompatTextView courseDetailProjectInfoTitle,
      AppCompatTextView courseDetailProjectTitle, AppCompatTextView courseDetailStartDate,
      AppCompatTextView courseDetailStartDateTitle, AppCompatTextView courseDetailTeacherTitle,
      AppCompatTextView courseDetailTimeTitle, MaterialDivider insetDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.courseDetailCampusTitle = courseDetailCampusTitle;
    this.courseDetailEndDate = courseDetailEndDate;
    this.courseDetailEndDateTitle = courseDetailEndDateTitle;
    this.courseDetailGradeTitle = courseDetailGradeTitle;
    this.courseDetailNameTitle = courseDetailNameTitle;
    this.courseDetailProjectInfoTitle = courseDetailProjectInfoTitle;
    this.courseDetailProjectTitle = courseDetailProjectTitle;
    this.courseDetailStartDate = courseDetailStartDate;
    this.courseDetailStartDateTitle = courseDetailStartDateTitle;
    this.courseDetailTeacherTitle = courseDetailTeacherTitle;
    this.courseDetailTimeTitle = courseDetailTimeTitle;
    this.insetDivider = insetDivider;
  }

  public abstract void setDetail(@Nullable CourseDetailResultBean detail);

  @Nullable
  public CourseDetailResultBean getDetail() {
    return mDetail;
  }

  @NonNull
  public static ActivityCourseDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_course_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCourseDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCourseDetailBinding>inflateInternal(inflater, R.layout.activity_course_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCourseDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_course_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCourseDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCourseDetailBinding>inflateInternal(inflater, R.layout.activity_course_detail, null, false, component);
  }

  public static ActivityCourseDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCourseDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCourseDetailBinding)bind(component, view, R.layout.activity_course_detail);
  }
}
