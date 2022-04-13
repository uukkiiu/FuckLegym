package legym.fuck;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import legym.fuck.databinding.ActivityCourseBindingImpl;
import legym.fuck.databinding.ActivityCourseDetailBindingImpl;
import legym.fuck.databinding.ActivityDocBindingImpl;
import legym.fuck.databinding.ActivityHuodongBindingImpl;
import legym.fuck.databinding.ActivityLoginBindingImpl;
import legym.fuck.databinding.ActivityMainBindingImpl;
import legym.fuck.databinding.ActivityOrderHistoryBindingImpl;
import legym.fuck.databinding.ActivityPayBindingImpl;
import legym.fuck.databinding.ActivityRunningBindingImpl;
import legym.fuck.databinding.ActivityRunningHistoryBindingImpl;
import legym.fuck.databinding.ActivitySignInBindingImpl;
import legym.fuck.databinding.ActivityStopBindingImpl;
import legym.fuck.databinding.DialogLoadingBindingImpl;
import legym.fuck.databinding.FragmentAutoRegisterBindingImpl;
import legym.fuck.databinding.FragmentDocContentBindingImpl;
import legym.fuck.databinding.FragmentDocListBindingImpl;
import legym.fuck.databinding.FragmentMineActivitiesBottomSheetBindingImpl;
import legym.fuck.databinding.FragmentNewUserBindingImpl;
import legym.fuck.databinding.ItemActivityCardBindingImpl;
import legym.fuck.databinding.ItemCourseInfoCardBindingImpl;
import legym.fuck.databinding.ItemHuodongBindingImpl;
import legym.fuck.databinding.ItemRegisterResultBindingImpl;
import legym.fuck.databinding.ItemRunningHistoryBindingImpl;
import legym.fuck.databinding.PopupSingleSelectorBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCOURSE = 1;

  private static final int LAYOUT_ACTIVITYCOURSEDETAIL = 2;

  private static final int LAYOUT_ACTIVITYDOC = 3;

  private static final int LAYOUT_ACTIVITYHUODONG = 4;

  private static final int LAYOUT_ACTIVITYLOGIN = 5;

  private static final int LAYOUT_ACTIVITYMAIN = 6;

  private static final int LAYOUT_ACTIVITYORDERHISTORY = 7;

  private static final int LAYOUT_ACTIVITYPAY = 8;

  private static final int LAYOUT_ACTIVITYRUNNING = 9;

  private static final int LAYOUT_ACTIVITYRUNNINGHISTORY = 10;

  private static final int LAYOUT_ACTIVITYSIGNIN = 11;

  private static final int LAYOUT_ACTIVITYSTOP = 12;

  private static final int LAYOUT_DIALOGLOADING = 13;

  private static final int LAYOUT_FRAGMENTAUTOREGISTER = 14;

  private static final int LAYOUT_FRAGMENTDOCCONTENT = 15;

  private static final int LAYOUT_FRAGMENTDOCLIST = 16;

  private static final int LAYOUT_FRAGMENTMINEACTIVITIESBOTTOMSHEET = 17;

  private static final int LAYOUT_FRAGMENTNEWUSER = 18;

  private static final int LAYOUT_ITEMACTIVITYCARD = 19;

  private static final int LAYOUT_ITEMCOURSEINFOCARD = 20;

  private static final int LAYOUT_ITEMHUODONG = 21;

  private static final int LAYOUT_ITEMREGISTERRESULT = 22;

  private static final int LAYOUT_ITEMRUNNINGHISTORY = 23;

  private static final int LAYOUT_POPUPSINGLESELECTOR = 24;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(24);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_course, LAYOUT_ACTIVITYCOURSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_course_detail, LAYOUT_ACTIVITYCOURSEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_doc, LAYOUT_ACTIVITYDOC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_huodong, LAYOUT_ACTIVITYHUODONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_order_history, LAYOUT_ACTIVITYORDERHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_pay, LAYOUT_ACTIVITYPAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_running, LAYOUT_ACTIVITYRUNNING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_running_history, LAYOUT_ACTIVITYRUNNINGHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_sign_in, LAYOUT_ACTIVITYSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.activity_stop, LAYOUT_ACTIVITYSTOP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.dialog_loading, LAYOUT_DIALOGLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.fragment_auto_register, LAYOUT_FRAGMENTAUTOREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.fragment_doc_content, LAYOUT_FRAGMENTDOCCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.fragment_doc_list, LAYOUT_FRAGMENTDOCLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.fragment_mine_activities_bottom_sheet, LAYOUT_FRAGMENTMINEACTIVITIESBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.fragment_new_user, LAYOUT_FRAGMENTNEWUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.item_activity_card, LAYOUT_ITEMACTIVITYCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.item_course_info_card, LAYOUT_ITEMCOURSEINFOCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.item_huodong, LAYOUT_ITEMHUODONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.item_register_result, LAYOUT_ITEMREGISTERRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.item_running_history, LAYOUT_ITEMRUNNINGHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(legym.fuck.R.layout.popup_single_selector, LAYOUT_POPUPSINGLESELECTOR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCOURSE: {
          if ("layout/activity_course_0".equals(tag)) {
            return new ActivityCourseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_course is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCOURSEDETAIL: {
          if ("layout/activity_course_detail_0".equals(tag)) {
            return new ActivityCourseDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_course_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDOC: {
          if ("layout/activity_doc_0".equals(tag)) {
            return new ActivityDocBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_doc is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHUODONG: {
          if ("layout/activity_huodong_0".equals(tag)) {
            return new ActivityHuodongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_huodong is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYORDERHISTORY: {
          if ("layout/activity_order_history_0".equals(tag)) {
            return new ActivityOrderHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_order_history is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAY: {
          if ("layout/activity_pay_0".equals(tag)) {
            return new ActivityPayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pay is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRUNNING: {
          if ("layout/activity_running_0".equals(tag)) {
            return new ActivityRunningBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_running is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRUNNINGHISTORY: {
          if ("layout/activity_running_history_0".equals(tag)) {
            return new ActivityRunningHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_running_history is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNIN: {
          if ("layout/activity_sign_in_0".equals(tag)) {
            return new ActivitySignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTOP: {
          if ("layout/activity_stop_0".equals(tag)) {
            return new ActivityStopBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_stop is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGLOADING: {
          if ("layout/dialog_loading_0".equals(tag)) {
            return new DialogLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUTOREGISTER: {
          if ("layout/fragment_auto_register_0".equals(tag)) {
            return new FragmentAutoRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_auto_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOCCONTENT: {
          if ("layout/fragment_doc_content_0".equals(tag)) {
            return new FragmentDocContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_doc_content is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOCLIST: {
          if ("layout/fragment_doc_list_0".equals(tag)) {
            return new FragmentDocListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_doc_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMINEACTIVITIESBOTTOMSHEET: {
          if ("layout/fragment_mine_activities_bottom_sheet_0".equals(tag)) {
            return new FragmentMineActivitiesBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_mine_activities_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWUSER: {
          if ("layout/fragment_new_user_0".equals(tag)) {
            return new FragmentNewUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_user is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMACTIVITYCARD: {
          if ("layout/item_activity_card_0".equals(tag)) {
            return new ItemActivityCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_activity_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOURSEINFOCARD: {
          if ("layout/item_course_info_card_0".equals(tag)) {
            return new ItemCourseInfoCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_course_info_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHUODONG: {
          if ("layout/item_huodong_0".equals(tag)) {
            return new ItemHuodongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_huodong is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREGISTERRESULT: {
          if ("layout/item_register_result_0".equals(tag)) {
            return new ItemRegisterResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_register_result is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRUNNINGHISTORY: {
          if ("layout/item_running_history_0".equals(tag)) {
            return new ItemRunningHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_running_history is invalid. Received: " + tag);
        }
        case  LAYOUT_POPUPSINGLESELECTOR: {
          if ("layout/popup_single_selector_0".equals(tag)) {
            return new PopupSingleSelectorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for popup_single_selector is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.liangguo.androidkit.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "detail");
      sKeys.put(3, "grade");
      sKeys.put(4, "user");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(24);

    static {
      sKeys.put("layout/activity_course_0", legym.fuck.R.layout.activity_course);
      sKeys.put("layout/activity_course_detail_0", legym.fuck.R.layout.activity_course_detail);
      sKeys.put("layout/activity_doc_0", legym.fuck.R.layout.activity_doc);
      sKeys.put("layout/activity_huodong_0", legym.fuck.R.layout.activity_huodong);
      sKeys.put("layout/activity_login_0", legym.fuck.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", legym.fuck.R.layout.activity_main);
      sKeys.put("layout/activity_order_history_0", legym.fuck.R.layout.activity_order_history);
      sKeys.put("layout/activity_pay_0", legym.fuck.R.layout.activity_pay);
      sKeys.put("layout/activity_running_0", legym.fuck.R.layout.activity_running);
      sKeys.put("layout/activity_running_history_0", legym.fuck.R.layout.activity_running_history);
      sKeys.put("layout/activity_sign_in_0", legym.fuck.R.layout.activity_sign_in);
      sKeys.put("layout/activity_stop_0", legym.fuck.R.layout.activity_stop);
      sKeys.put("layout/dialog_loading_0", legym.fuck.R.layout.dialog_loading);
      sKeys.put("layout/fragment_auto_register_0", legym.fuck.R.layout.fragment_auto_register);
      sKeys.put("layout/fragment_doc_content_0", legym.fuck.R.layout.fragment_doc_content);
      sKeys.put("layout/fragment_doc_list_0", legym.fuck.R.layout.fragment_doc_list);
      sKeys.put("layout/fragment_mine_activities_bottom_sheet_0", legym.fuck.R.layout.fragment_mine_activities_bottom_sheet);
      sKeys.put("layout/fragment_new_user_0", legym.fuck.R.layout.fragment_new_user);
      sKeys.put("layout/item_activity_card_0", legym.fuck.R.layout.item_activity_card);
      sKeys.put("layout/item_course_info_card_0", legym.fuck.R.layout.item_course_info_card);
      sKeys.put("layout/item_huodong_0", legym.fuck.R.layout.item_huodong);
      sKeys.put("layout/item_register_result_0", legym.fuck.R.layout.item_register_result);
      sKeys.put("layout/item_running_history_0", legym.fuck.R.layout.item_running_history);
      sKeys.put("layout/popup_single_selector_0", legym.fuck.R.layout.popup_single_selector);
    }
  }
}
