package com.example.timor.recyclerview.interfaces;

/**
 * Created by Timor on 2017/2/9.
 */

public interface ItemTouchHelperAdapter {

    /**
     * 移动
     * @param fromPosition
     * @param toPosition
     * @return
     */
    boolean onItemMove(int fromPosition, int toPosition);

    /**
     * 删除
     * @param position
     */
    void onItemDismiss(int position);
}
