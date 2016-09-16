package com.tl.pro.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/9/16.
 */
public class TestGroup extends LinearLayout {

	private static final String TAG = "MainActivity/TestGroup";
	float lastX;
	float lastY;


	public TestGroup(Context context) {
		super(context);
	}

	public TestGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TestGroup(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public TestGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.w(TAG, "dispatchTouchEvent");
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.w(TAG, "onInterceptTouchEvent");
		return false;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.w(TAG, "onTouchEvent");
		float nowX = event.getX();
		float nowY = event.getY();
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.w(TAG, "ACTION_DOWN");
				lastX = event.getX();
				lastY = event.getY();
				return true;
				//break;
			case MotionEvent.ACTION_MOVE:

				Log.w(TAG, "ACTION_MOVE");
				break;
			case MotionEvent.ACTION_UP:
				Log.w(TAG, "ACTION_UP");
				if (Math.abs(nowX - lastX) > 10 || Math.abs(nowY - lastY) > 10) {
					Log.w(TAG, "ACTION_UP, return ");
					//return true;
				}
				break;
			default:
				Log.w(TAG, "default");
				break;
		}
		return false;
	}
}
