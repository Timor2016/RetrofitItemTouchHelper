package com.example.timor.recyclerview.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.timor.recyclerview.R;
import com.example.timor.recyclerview.interfaces.ItemTouchHelperAdapter;
import com.example.timor.recyclerview.interfaces.ItemTouchHelperViewHolder;
import com.example.timor.recyclerview.interfaces.OnStartDragListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Timor on 2017/2/9.
 */

public class SwipeAdapter extends RecyclerView.Adapter<SwipeAdapter.MyHolder> implements ItemTouchHelperAdapter {

    private final List<String> mItems = new ArrayList<>();
 //   private final OnStartDragListener mDragStartListener;
    
    public SwipeAdapter(Context context) {
     //   mDragStartListener = dragStartListener;
        mItems.addAll(Arrays.asList(context.getResources().getStringArray(R.array.dummy_items)));
    }


    @Override
    public SwipeAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viwe = LayoutInflater.from(parent.getContext()).inflate(R.layout.swipe_item,parent,false);
       MyHolder holder = new MyHolder(viwe);
        return holder;
    }

    @Override
    public void onBindViewHolder(SwipeAdapter.MyHolder holder, int position) {
        holder.tv.setText(mItems.get(position));
        Log.e(">>>>>>>>>>>>>>","kaisaisji");
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {

        //换位
        Collections.swap(mItems, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        return false;
    }

    @Override
    public void onItemDismiss(int position) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }

    class MyHolder extends RecyclerView.ViewHolder implements
            ItemTouchHelperViewHolder {
        private TextView tv;
        public MyHolder(View itemView) {
            super(itemView);
            this.tv = (TextView)itemView.findViewById(R.id.item);
        }

        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.LTGRAY);
        }

        @Override
        public void onItemClear() {
            itemView.setBackgroundColor(0);
        }
    }
}
