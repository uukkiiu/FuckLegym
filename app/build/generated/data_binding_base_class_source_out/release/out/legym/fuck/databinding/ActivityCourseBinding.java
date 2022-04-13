// Generated by data binding compiler. Do not edit!
package legym.fuck.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;
import legym.fuck.R;

public abstract class ActivityCourseBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonAllCourse;

  @NonNull
  public final MaterialButton buttonCourseSign;

  @NonNull
  public final ConstraintLayout courseDetailContainer;

  @NonNull
  public final RecyclerView courseInfoRecyclerView;

  @NonNull
  public final MaterialCardView courseInfoRecyclerViewContainer;

  @NonNull
  public final AppCompatTextView courseInfoSignPurpose;

  @NonNull
  public final AppCompatTextView courseInfoTitle;

  @NonNull
  public final AppCompatTextView courseName;

  @NonNull
  public final AppCompatTextView courseNameTitle;

  @NonNull
  public final MaterialCardView currentCourseId;

  @NonNull
  public final LinearLayout driver1;

  @NonNull
  public final AppCompatTextView textCourseIntroduction;

  protected ActivityCourseBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton buttonAllCourse, MaterialButton buttonCourseSign,
      ConstraintLayout courseDetailContainer, RecyclerView courseInfoRecyclerView,
      MaterialCardView courseInfoRecyclerViewContainer, AppCompatTextView courseInfoSignPurpose,
      AppCompatTextView courseInfoTitle, AppCompatTextView courseName,
      AppCompatTextView courseNameTitle, MaterialCardView currentCourseId, LinearLayout driver1,
      AppCompatTextView textCourseIntroduction) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonAllCourse = buttonAllCourse;
    this.buttonCourseSign = buttonCourseSign;
    this.courseDetailContainer = courseDetailContainer;
    this.courseInfoRecyclerView = courseInfoRecyclerView;
    this.courseInfoRecyclerViewContainer = courseInfoRecyclerViewContainer;
    this.courseInfoSignPurpose = courseInfoSignPurpose;
    this.courseInfoTitle = courseInfoTitle;
    this.courseName = courseName;
    this.courseNameTitle = courseNameTitle;
    this.currentCourseId = currentCourseId;
    this.driver1 = driver1;
    this.textCourseIntroduction = textCourseIntroduction;
  }

  @NonNull
  public static ActivityCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_course, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCourseBinding>inflateInternal(inflater, R.layout.activity_course, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCourseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_course, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCourseBinding>inflateInternal(inflater, R.layout.activity_course, null, false, component);
  }

  public static ActivityCourseBinding bind(@NonNull View view) {
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
  public static ActivityCourseBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCourseBinding)bind(component, view, R.layout.activity_course);
  }
}
