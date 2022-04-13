package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_bg_head, 3);
        sViewsWithIds.put(R.id.edit_layout1, 4);
        sViewsWithIds.put(R.id.edit1, 5);
        sViewsWithIds.put(R.id.edit_layout2, 6);
        sViewsWithIds.put(R.id.edit2, 7);
        sViewsWithIds.put(R.id.button_login, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[1]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            );
        this.checkbox1.setTag(null);
        this.checkbox2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((legym.fuck.ui.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable legym.fuck.ui.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelResponsibleSelf((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelDontPublic((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelResponsibleSelf(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelResponsibleSelf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDontPublic(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDontPublic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDontPublicGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelResponsibleSelf = null;
        java.lang.Boolean viewModelDontPublicGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelResponsibleSelfGetValue = false;
        java.lang.Boolean viewModelResponsibleSelfGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDontPublic = null;
        legym.fuck.ui.login.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.responsibleSelf
                        viewModelResponsibleSelf = viewModel.getResponsibleSelf();
                    }
                    updateLiveDataRegistration(0, viewModelResponsibleSelf);


                    if (viewModelResponsibleSelf != null) {
                        // read viewModel.responsibleSelf.getValue()
                        viewModelResponsibleSelfGetValue = viewModelResponsibleSelf.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.responsibleSelf.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelResponsibleSelfGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelResponsibleSelfGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.dontPublic
                        viewModelDontPublic = viewModel.getDontPublic();
                    }
                    updateLiveDataRegistration(1, viewModelDontPublic);


                    if (viewModelDontPublic != null) {
                        // read viewModel.dontPublic.getValue()
                        viewModelDontPublicGetValue = viewModelDontPublic.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dontPublic.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDontPublicGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDontPublicGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkbox1, androidxDatabindingViewDataBindingSafeUnboxViewModelDontPublicGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkbox2, androidxDatabindingViewDataBindingSafeUnboxViewModelResponsibleSelfGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.responsibleSelf
        flag 1 (0x2L): viewModel.dontPublic
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}