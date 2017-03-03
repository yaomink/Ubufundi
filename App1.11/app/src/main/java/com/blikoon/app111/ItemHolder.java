package com.blikoon.app111;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public ItemHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(android.R.id.text1);
    }
    public TextView getView()
    {
        return textView;
    }
}