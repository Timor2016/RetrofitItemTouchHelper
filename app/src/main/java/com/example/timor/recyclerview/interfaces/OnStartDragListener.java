package com.example.timor.recyclerview.interfaces;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Timor on 2017/2/9.
 */

public interface OnStartDragListener {

    void onStartDrag(RecyclerView.ViewHolder viewHolder);
    void onStartSwipe(RecyclerView.ViewHolder viewHolder);
}
