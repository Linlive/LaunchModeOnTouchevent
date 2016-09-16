package com.tl.pro.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

	Button mThirdButton;
	TextView mName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);

		mThirdButton = (Button) findViewById(R.id.id_button_third);
		mName = (TextView) findViewById(R.id.id_third_tv);
		mName.setText(this.toString());
		mThirdButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
				startActivity(intent);
			}
		});

	}
}
