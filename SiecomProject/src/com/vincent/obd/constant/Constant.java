package com.vincent.obd.constant;

import com.vincent.obd.R;
import com.vincent.obd.fragments.CallFragment;
import com.vincent.obd.fragments.CarStatusFragment;
import com.vincent.obd.fragments.HomePageFragment;
import com.vincent.obd.fragments.InsuranceFragment;
import com.vincent.obd.fragments.SettingFragment;

public class Constant
{
	public static final String ACTION_WELCOME = "com.obd.welcome";

	public static final String ACTION_DETAIL = "com.obd.detail";
	
	public static final String BOOT_PREFERENCE = "obd";
	
	public static final String APPLICATION_VERSION = "version";
	
	public static final int[] TAB_NAMES = { R.string.home_page, R.string.car_status, R.string.call,
			R.string.insurance, R.string.setting };

	public static final int TAB_IMAGES[] = { R.drawable.home_page,
			R.drawable.car_status, R.drawable.call, R.drawable.insurance,
			R.drawable.setting };

	public static final Class[] TAB_FRAGMENTS = { HomePageFragment.class,
			CarStatusFragment.class, CallFragment.class,
			InsuranceFragment.class, SettingFragment.class };
}
