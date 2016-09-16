package com.tl.pro.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private static final String TAG = "MainActivity";

	private LinearLayout linearLayout;
	private TextView textViewClickFirst;
	private TextView textViewOnTouch;

	float lastX;
	float lastY;

	float lastX1;
	float lastY1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initListener();
	}

	private void initView() {
		linearLayout = (LinearLayout) findViewById(R.id.test_ll);
		textViewClickFirst = (TextView) findViewById(R.id.test_click_other);
		textViewOnTouch = (TextView) findViewById(R.id.touch_text_view);
	}

	private void initListener() {
		//linearLayout.setOnTouchListener(this);
		//linearLayout.setOnClickListener(this);
		//textViewClickFirst.setOnClickListener(this);
		textViewOnTouch.setOnClickListener(this);
		/*textViewOnTouch.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				float nowX = event.getX();
				float nowY = event.getY();
				switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
						Log.w(TAG, "ACTION_DOWN   --------------1");
						lastX1 = event.getX();
						lastY1 = event.getY();
						//return true;
						break;
					case MotionEvent.ACTION_MOVE:

						Log.w(TAG, "ACTION_MOVE  -------------1");
						break;
					case MotionEvent.ACTION_UP:
						Log.w(TAG, "ACTION_UP ---------------1");
						if (Math.abs(nowX - lastX) > 10 || Math.abs(nowY - lastY) > 10) {
							Log.w(TAG, "ACTION_UP----------------1, return ");
							return true;
						}
						//return true;
						break;
					default:
						Log.w(TAG, "default-----------1");
						break;
				}
				return false;
			}
		});*/

	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.test_ll) {
			Log.w(TAG, "onClick()---- test_ll");
		}
		if (v.getId() == R.id.touch_text_view) {
			Log.w(TAG, "onClick() ---------------touch_text_view");
		}
		if(v.getId() == R.id.test_click_other){
			Log.w(TAG, "onClick() ----------------test_click_other");
		}
	}
}
