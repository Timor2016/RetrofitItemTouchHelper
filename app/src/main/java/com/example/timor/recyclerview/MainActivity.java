package com.example.timor.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.timor.recyclerview.adapter.SwipeAdapter;
import com.example.timor.recyclerview.callback.MyItemTouchHelperCallback;
import com.example.timor.recyclerview.interfaces.OnStartDragListener;

public class MainActivity extends AppCompatActivity implements OnStartDragListener {
    
    private RecyclerView myRecycleView;

 
    private SwipeAdapter myAdapter;
    private ItemTouchHelper mItemTouchHelper;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        myRecycleView = (RecyclerView)findViewById(R.id.recycleView);
        myAdapter = new SwipeAdapter(this);
        myRecycleView.setAdapter(myAdapter);
        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));

        ItemTouchHelper.Callback callback = new MyItemTouchHelperCallback(myAdapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(myRecycleView);
    }

    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        mItemTouchHelper.startDrag(viewHolder);
    }
    @Override
    public void onStartSwipe(RecyclerView.ViewHolder viewHolder) {

    }

}
