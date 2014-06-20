package com.vincent.obd;

import com.vincent.obd.constant.Constant;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class ObdActivity extends FragmentActivity
{
	private FragmentTabHost tabHost;

	/* 一键拨号 */
	private static final int CALL_TAB = 2;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		initView();
	}

	private void initView()
	{
		tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		tabHost.setup(this, getSupportFragmentManager(), R.id.tab_content);

		for (int i = 0; i < 5; i++)
		{
			TabSpec tabSpec = tabHost.newTabSpec(getString(Constant.TAB_NAMES[i])).setIndicator(
					getTabView(i));
			tabHost.addTab(tabSpec, Constant.TAB_FRAGMENTS[i], null);
		}
	}

	private View getTabView(int index)
	{
		View v;
		if (index == CALL_TAB)
		{
			v = getLayoutInflater().inflate(R.layout.tab_item_mid, null);
		} else
		{
			v = getLayoutInflater().inflate(R.layout.tab_item, null);
			TextView text = (TextView) v.findViewById(R.id.item_name);
			text.setText(Constant.TAB_NAMES[index]);
		}

		ImageView image = (ImageView) v.findViewById(R.id.item_image);
		image.setBackgroundResource(Constant.TAB_IMAGES[index]);

		return v;
	}

}
