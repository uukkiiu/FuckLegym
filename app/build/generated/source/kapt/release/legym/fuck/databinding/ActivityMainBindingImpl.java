package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_bg_head, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.container_subtitle, 5);
        sViewsWithIds.put(R.id.image_vip, 6);
        sViewsWithIds.put(R.id.text_integral, 7);
        sViewsWithIds.put(R.id.card_semester_mileage, 8);
        sViewsWithIds.put(R.id.card_container, 9);
        sViewsWithIds.put(R.id.text_semester_mileage, 10);
        sViewsWithIds.put(R.id.spacer_semester_mileage, 11);
        sViewsWithIds.put(R.id.text_semester_mileage_current, 12);
        sViewsWithIds.put(R.id.text_semester_mileage_total, 13);
        sViewsWithIds.put(R.id.progress, 14);
        sViewsWithIds.put(R.id.chip_rule, 15);
        sViewsWithIds.put(R.id.button_running, 16);
        sViewsWithIds.put(R.id.spacer_bottom, 17);
        sViewsWithIds.put(R.id.button_sign_activity, 18);
        sViewsWithIds.put(R.id.button_sign_course, 19);
        sViewsWithIds.put(R.id.text_warning, 20);
        sViewsWithIds.put(R.id.text_version, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[18]
            , (com.google.android.material.button.MaterialButton) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (com.google.android.material.chip.Chip) bindings[15]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.google.android.material.progressindicator.LinearProgressIndicator) bindings[14]
            , (android.widget.Space) bindings[17]
            , (android.widget.Space) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.imageHeader.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textName.setTag(null);
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
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textName, userRealName);
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