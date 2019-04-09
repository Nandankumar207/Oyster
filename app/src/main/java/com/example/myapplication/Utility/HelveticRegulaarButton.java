package com.example.myapplication.Utility;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by Mahipal Singh  mahisingh1@Outlook.com on 29/11/18.
 */
public class HelveticRegulaarButton extends android.support.v7.widget.AppCompatButton {
    public HelveticRegulaarButton(Context context) {
        super(context);
        createFont();
    }

    public HelveticRegulaarButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public HelveticRegulaarButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/HELVETIC.TTF");
        setTypeface(font);
    }

}
