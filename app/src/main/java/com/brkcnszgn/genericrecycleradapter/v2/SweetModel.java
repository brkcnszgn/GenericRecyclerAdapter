package com.brkcnszgn.genericrecycleradapter.v2;

public abstract class SweetModel {
    private int viewType = 0;

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public SweetModel(int viewType) {
        this.viewType = viewType;
    }
}