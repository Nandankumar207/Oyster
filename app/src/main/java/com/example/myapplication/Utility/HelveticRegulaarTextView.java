package com.example.myapplication.Utility;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by mahipal on 27/12/18.
 * HelveticRegulaarTextView-Regular font TextView
 */

public class HelveticRegulaarTextView extends android.support.v7.widget.AppCompatTextView {
    public HelveticRegulaarTextView(Context context) {
        super(context);
        createFont();
    }

    public HelveticRegulaarTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public HelveticRegulaarTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/HELVETIC.TTF");
        setTypeface(font);
    }

}
