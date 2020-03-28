package com.brkcnszgn.genericrecycleradapter;

import android.view.View;

public interface IOnRecyclerViewItemClickListener<T> {
    void onRecyclerItemListener(View v, T item);
}
