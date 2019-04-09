package com.example.myapplication.Utility;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.widget.TextView;

public class Fonts {


	public static void OpenSans_Regular_Txt(TextView btn, AssetManager asm)
	{
		Typeface fontsStyle= Typeface.createFromAsset(asm, "fonts/Roboto-Regular.ttf");
		btn.setTypeface(fontsStyle);
	}

	public static void OpenSans_Medium_Txt(TextView btn, AssetManager asm)
	{
		Typeface fontsStyle= Typeface.createFromAsset(asm, "fonts/Roboto-Medium.ttf");
		btn.setTypeface(fontsStyle);
	}

}
