package com.example.timor.recyclerview.interfaces;

/**
 * Created by Timor on 2017/2/9.
 * Item颜色选择
 */

public interface ItemTouchHelperViewHolder {
    /**
     * Item选中时的颜色
     */
    void onItemSelected();

    /**
     * 手指松开时 Item 要变化的颜色
     */
    void onItemClear();
}
