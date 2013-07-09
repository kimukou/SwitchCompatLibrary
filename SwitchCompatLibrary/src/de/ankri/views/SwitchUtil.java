package de.ankri.views;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.MotionEvent;

@SuppressLint("NewApi") 
public class SwitchUtil {

	public static int getAction(MotionEvent ev){
		return ev.getActionMasked();
	}
	
	public static TextPaint setTextPaintDensity(TextPaint mTextPaint,Resources res){
		mTextPaint.density = res.getDisplayMetrics().density;
		return mTextPaint;
	}
}
