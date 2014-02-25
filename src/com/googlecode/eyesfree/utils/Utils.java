package com.googlecode.eyesfree.utils;

import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;


public class Utils {
	public static boolean isHC() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
	}
	public static void setAlphaForView(View v, float alpha) {
		AlphaAnimation animation = new AlphaAnimation(alpha, alpha);
		animation.setDuration(0);
		animation.setFillAfter(true);
		v.startAnimation(animation);
		}
}
