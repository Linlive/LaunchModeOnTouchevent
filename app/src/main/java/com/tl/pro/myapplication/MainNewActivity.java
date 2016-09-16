package com.tl.pro.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainNewActivity extends AppCompatActivity {

	ViewPager mViewPager;

	ViewPagerChanger mViewPagerChanger;
	ViewPagerAdapter mViewPagerAdapter;
	List<View> mViews = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_new);
		mViewPager = (ViewPager) findViewById(R.id.id_view_pager);

		initView();
		mViewPagerChanger = new ViewPagerChanger();
		mViewPagerAdapter = new ViewPagerAdapter(MainNewActivity.this, mViews);
		mViewPager.addOnPageChangeListener(mViewPagerChanger);
		mViewPager.setAdapter(mViewPagerAdapter);
	}

	private void initView(){
		LayoutInflater inflater = LayoutInflater.from(this);
		mViews.add(inflater.inflate(R.layout.view1, null));
		mViews.add(inflater.inflate(R.layout.view2, null));
		mViews.add(inflater.inflate(R.layout.view3, null));
	}

	class ViewPagerChanger implements ViewPager.OnPageChangeListener {
		@Override
		public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

		}

		@Override
		public void onPageSelected(int position) {

		}

		@Override
		public void onPageScrollStateChanged(int state) {

		}
	}

	class ViewPagerAdapter extends PagerAdapter {
		List<View> mViews;
		Context mContext;
		public ViewPagerAdapter(Context context, List<View> views) {
			super();
			this.mContext = context;
			this.mViews = views;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			View view = mViews.get(position);
			container.addView(view);
			return view;
		}

		@Override
		public int getItemPosition(Object object) {

			return PagerAdapter.POSITION_NONE;
		}

		@Override
		public int getCount() {
			return mViews.size();
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView(mViews.get(position));
			//super.destroyItem(container, position, object);
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == object;
		}
	}
}
