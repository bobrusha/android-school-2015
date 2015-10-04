package com.elegion.githubclient.activity;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Aleksandra on 04.10.15.
 */
public class MyItemDecoration extends RecyclerView.ItemDecoration {

    private final int mPaddingBottom;
    private final int mPaddingTop;
    private final int mPaddingLeft;
    private final int mPaddingRight;

    public MyItemDecoration(int paddingBottom, int paddingTop, int paddingLeft, int paddingRight) {
        mPaddingBottom = paddingBottom;
        mPaddingTop = paddingTop;
        mPaddingLeft = paddingLeft;
        mPaddingRight = paddingRight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.bottom = mPaddingBottom;
        outRect.top = mPaddingTop;
        outRect.right = mPaddingRight;
        outRect.left = mPaddingLeft;
    }
}
