package com.brkcnszgn.genericrecycleradapter.v2;

import com.brkcnszgn.genericrecycleradapter.IOnRecyclerViewItemClickListener;
import com.brkcnszgn.genericrecycleradapter.ISetItemView;

public class ItemHolder<T> {
    private int resourceId;
    private int viewType;
    private ISetItemView<T> iSetItemView;
    private IOnRecyclerViewItemClickListener<T> iOnRecyclerItemClickListener;

    public ItemHolder(int resourceId, int viewType, ISetItemView<T> iSetItemView, IOnRecyclerViewItemClickListener<T> iOnRecyclerItemClickListener) {
        this.resourceId = resourceId;
        this.viewType = viewType;
        this.iSetItemView = iSetItemView;
        this.iOnRecyclerItemClickListener = iOnRecyclerItemClickListener;
    }

    public int getViewType() {
        return viewType;
    }

    public int getResourceId() {
        return resourceId;
    }

    public ISetItemView<T> getiSetItemView() {
        return iSetItemView;
    }

    public IOnRecyclerViewItemClickListener<T> getiOnRecyclerItemClickListener() {
        return iOnRecyclerItemClickListener;
    }
}
