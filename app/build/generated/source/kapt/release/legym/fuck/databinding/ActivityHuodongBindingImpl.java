package legym.fuck.databinding;
import legym.fuck.R;
import legym.fuck.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHuodongBindingImpl extends ActivityHuodongBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout, 1);
        sViewsWithIds.put(R.id.collapsingToolbarLayout, 2);
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.searchView, 4);
        sViewsWithIds.put(R.id.contentViewContainer, 5);
        sViewsWithIds.put(R.id.container_filter, 6);
        sViewsWithIds.put(R.id.container_linear_filter, 7);
        sViewsWithIds.put(R.id.container_empty, 8);
        sViewsWithIds.put(R.id.refreshLayout, 9);
        sViewsWithIds.put(R.id.recyclerView, 10);
        sViewsWithIds.put(R.id.progress, 11);
        sViewsWithIds.put(R.id.fab, 12);
        sViewsWithIds.put(R.id.bottom_app_bar, 13);
        sViewsWithIds.put(R.id.textView_select_count, 14);
        sViewsWithIds.put(R.id.button_select_all, 15);
        sViewsWithIds.put(R.id.button_register_all, 16);
        sViewsWithIds.put(R.id.button_unregister_all, 17);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHuodongBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityHuodongBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.HorizontalScrollView) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[5]
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[12]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (com.scwang.smart.refresh.layout.SmartRefreshLayout) bindings[9]
            , (com.ferfalk.simplesearchview.SimpleSearchView) bindings[4]
            , (com.google.android.material.textview.MaterialTextView) bindings[14]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[3]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
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