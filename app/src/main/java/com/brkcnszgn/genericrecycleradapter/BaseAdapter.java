package com.brkcnszgn.genericrecycleradapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter<T>.ViewHolder> {

    private Context context;
    private int resourceId;
    private List<T> list;
    private ISetItemView<T> iSetItemView;
    private IOnRecyclerViewItemClickListener<T> iOnRecyclerViewItemClickListener;

    public BaseAdapter(Context context,int resourceId, List<T> list){
        this.context = context;
        this.resourceId = resourceId;
        this.list = list;
    }

    public void setItemView(ISetItemView<T> iSetItemView){
        this.iSetItemView = iSetItemView;
    }

    public void setiOnRecyclerViewItemClickListener(IOnRecyclerViewItemClickListener iOnRecyclerViewItemClickListener){
        this.iOnRecyclerViewItemClickListener = iOnRecyclerViewItemClickListener;
    }


    @NonNull
    @Override
    public BaseAdapter<T>.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(resourceId,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final BaseAdapter<T>.ViewHolder holder, int position) {
        final T item = list.get(position);


        iSetItemView.setItemView(holder.view, item);

        if (iOnRecyclerViewItemClickListener != null)
            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    iOnRecyclerViewItemClickListener.onRecyclerItemListener(holder.view, item);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }
}
