package com.tl.pro.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Method;

public class FirstActivity extends AppCompatActivity {

	Button mFirstButton;
	TextView mName;
	TextView mIntentFrom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);

		String aa = "aa";
		Object service = getSystemService("statusbar");
		try {
			Class <?> statusBarManager = Class.forName
					("android.app.StatusBarManager");
			Method expand = statusBarManager.getMethod ("disable", int.class);
			expand.invoke (service,0x00000001);
		} catch (Exception e) {
			e.printStackTrace();
		}


		Intent intent = getIntent();


		mFirstButton = (Button) findViewById(R.id.id_button_first);
		mName = (TextView) findViewById(R.id.id_first_tv);
		mIntentFrom = (TextView) findViewById(R.id.id_first_intent_tv);

		if (null != intent) {
			StringBuilder tag = new StringBuilder();
			tag.append("tag is : ");
			tag.append(intent.getStringExtra("tag"));
			mIntentFrom.setText(tag);
		} else {
			mIntentFrom.setText("nothing");
		}
		mName.setText(this.toString());
		mFirstButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//				Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
				startActivity(intent);
			}
		});
		//http://blog.csdn.net/liuhe688/article/details/6754323/
	}
}
