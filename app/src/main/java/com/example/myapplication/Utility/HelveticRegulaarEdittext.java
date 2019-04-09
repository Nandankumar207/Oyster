package com.example.myapplication.Utility;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by Mahipal Singh  mahisingh1@Outlook.com on 5/1/19.
 */
public class HelveticRegulaarEdittext extends android.support.v7.widget.AppCompatEditText {
    public HelveticRegulaarEdittext(Context context) {
        super(context);
        createFont();
    }

    public HelveticRegulaarEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public HelveticRegulaarEdittext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/HELVETIC.TTF");
        setTypeface(font);
    }

}
