package com.tl.pro.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/16.
 */
public class TestView extends TextView {

	private static final String TAG = "MainActivity/TestView";

	float lastX1;
	float lastY1;

	float lastX;
	float lastY;

	public TestView(Context context) {
		super(context);
	}

	public TestView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public TestView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		Log.d(TAG, "dispatchTouchEvent: ");
		return super.dispatchTouchEvent(event);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		float nowX = event.getX();
		float nowY = event.getY();
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.w(TAG, "ACTION_DOWN   --------------1");
				lastX1 = event.getX();
				lastY1 = event.getY();
				return true;
				//break;
			case MotionEvent.ACTION_MOVE:

				Log.w(TAG, "ACTION_MOVE  -------------1");
				break;
			case MotionEvent.ACTION_UP:
				Log.w(TAG, "ACTION_UP ---------------1");
				if (Math.abs(nowX - lastX) > 10 || Math.abs(nowY - lastY) > 10) {
					Log.w(TAG, "ACTION_UP----------------1, return ");
					//return true;
				}
				//return true;
				break;
			default:
				Log.w(TAG, "default-----------1");
				break;
		}
		return false;
	}
}
