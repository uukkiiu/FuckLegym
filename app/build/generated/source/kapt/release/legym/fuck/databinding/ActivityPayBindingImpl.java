package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPayBindingImpl extends ActivityPayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.refreshLayout, 4);
        sViewsWithIds.put(R.id.contentViewContainer, 5);
        sViewsWithIds.put(R.id.image_header_card_background, 6);
        sViewsWithIds.put(R.id.container_card_header, 7);
        sViewsWithIds.put(R.id.image_vip, 8);
        sViewsWithIds.put(R.id.text_user_vip_type, 9);
        sViewsWithIds.put(R.id.text_user_account, 10);
        sViewsWithIds.put(R.id.spacer1, 11);
        sViewsWithIds.put(R.id.image_my_integral_card_background, 12);
        sViewsWithIds.put(R.id.container_my_integral, 13);
        sViewsWithIds.put(R.id.text_my_integral, 14);
        sViewsWithIds.put(R.id.button_pay_panel, 15);
        sViewsWithIds.put(R.id.container_pay, 16);
        sViewsWithIds.put(R.id.text_every_day_price_title, 17);
        sViewsWithIds.put(R.id.container_text_every_day_price, 18);
        sViewsWithIds.put(R.id.text_every_day_price, 19);
        sViewsWithIds.put(R.id.image_begging, 20);
        sViewsWithIds.put(R.id.card_purchase_plan1, 21);
        sViewsWithIds.put(R.id.card_purchase_plan2, 22);
        sViewsWithIds.put(R.id.card_purchase_plan3, 23);
        sViewsWithIds.put(R.id.card_purchase_plan_diy, 24);
        sViewsWithIds.put(R.id.image_pay_button_background, 25);
        sViewsWithIds.put(R.id.button_make_order, 26);
        sViewsWithIds.put(R.id.spacer2, 27);
        sViewsWithIds.put(R.id.image_invite_card_background, 28);
        sViewsWithIds.put(R.id.container_card_invite, 29);
        sViewsWithIds.put(R.id.text_new_user_title, 30);
        sViewsWithIds.put(R.id.text_new_user_subtitle, 31);
        sViewsWithIds.put(R.id.text_my_invite_code, 32);
        sViewsWithIds.put(R.id.chip_copy_invite_code, 33);
        sViewsWithIds.put(R.id.text_invite_code_rules_title, 34);
        sViewsWithIds.put(R.id.spacer_invite_code, 35);
        sViewsWithIds.put(R.id.text_invite_code_rules, 36);
        sViewsWithIds.put(R.id.spacer3, 37);
        sViewsWithIds.put(R.id.image_rules_card_background, 38);
        sViewsWithIds.put(R.id.container_card_rules, 39);
        sViewsWithIds.put(R.id.text_integral_rules_title, 40);
        sViewsWithIds.put(R.id.text_integral_rules, 41);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }
    private ActivityPayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[26]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (com.google.android.material.card.MaterialCardView) bindings[21]
            , (com.google.android.material.card.MaterialCardView) bindings[22]
            , (com.google.android.material.card.MaterialCardView) bindings[23]
            , (com.google.android.material.card.MaterialCardView) bindings[24]
            , (com.google.android.material.button.MaterialButton) bindings[33]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[29]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[18]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[6]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[28]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[12]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[25]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[38]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (com.scwang.smart.refresh.layout.SmartRefreshLayout) bindings[4]
            , (android.widget.Space) bindings[11]
            , (android.widget.Space) bindings[27]
            , (android.widget.Space) bindings[37]
            , (android.view.View) bindings[35]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[41]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[40]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[36]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[34]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[31]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[3]
            );
        this.imageHeader.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textUserName.setTag(null);
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
        if (BR.user == variableId) {
            setUser((legym.fuck.logic.legym.network.model.login.LoginResult) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable legym.fuck.logic.legym.network.model.login.LoginResult User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
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
        java.lang.String userRealName = null;
        legym.fuck.logic.legym.network.model.login.LoginResult user = mUser;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.realName
                    userRealName = user.getRealName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            legym.fuck.widget.adapters.binding.ViewBindingAdapter.setLegymHeader(this.imageHeader, user);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textUserName, userRealName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}