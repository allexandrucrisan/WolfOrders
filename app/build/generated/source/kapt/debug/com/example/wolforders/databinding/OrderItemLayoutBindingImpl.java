package com.example.wolforders.databinding;
import com.example.wolforders.R;
import com.example.wolforders.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OrderItemLayoutBindingImpl extends OrderItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_no_title, 5);
        sViewsWithIds.put(R.id.date_title, 6);
        sViewsWithIds.put(R.id.total_title, 7);
        sViewsWithIds.put(R.id.imageButton, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OrderItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private OrderItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.dateText.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.orderNoText.setTag(null);
        this.statusText.setTag(null);
        this.totalText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.total == variableId) {
            setTotal((java.lang.String) variable);
        }
        else if (BR.order == variableId) {
            setOrder((com.example.wolforders.data.models.Order) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotal(@Nullable java.lang.String Total) {
        this.mTotal = Total;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.total);
        super.requestRebind();
    }
    public void setOrder(@Nullable com.example.wolforders.data.models.Order Order) {
        this.mOrder = Order;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.order);
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
        java.lang.String orderStatus = null;
        java.lang.String total = mTotal;
        java.lang.Integer orderOrderId = null;
        int androidxDatabindingViewDataBindingSafeUnboxOrderOrderId = 0;
        java.lang.String orderDate = null;
        com.example.wolforders.data.models.Order order = mOrder;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (order != null) {
                    // read order.status
                    orderStatus = order.getStatus();
                    // read order.orderId
                    orderOrderId = order.getOrderId();
                    // read order.date
                    orderDate = order.getDate();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(order.orderId)
                androidxDatabindingViewDataBindingSafeUnboxOrderOrderId = androidx.databinding.ViewDataBinding.safeUnbox(orderOrderId);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dateText, orderDate);
            this.orderNoText.setText(androidxDatabindingViewDataBindingSafeUnboxOrderOrderId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusText, orderStatus);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalText, total);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): total
        flag 1 (0x2L): order
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}