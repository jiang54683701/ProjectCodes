package com.vincent.obd;

import com.vincent.obd.constant.Constant;
import com.vincent.obd.utils.LogEx;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class BootActivity extends Activity
{

	private SharedPreferences pref;

	private PackageManager packageManager;

	private PackageInfo info;

	private static final String TAG = BootActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		packageManager = this.getPackageManager();
		try
		{
			info = packageManager.getPackageInfo(this.getPackageName(), 0);
		} catch (NameNotFoundException e)
		{
			e.printStackTrace();
			LogEx.d(TAG, "Get packageInfo failed!");
		}

		pref = getSharedPreferences(Constant.BOOT_PREFERENCE, MODE_PRIVATE);
		String tag = pref.getString(Constant.APPLICATION_VERSION, null);

		String action;
		if ((tag == null) || (tag != info.versionName))
		{
			action = Constant.ACTION_WELCOME;

			Editor editor = pref.edit();
			editor.putString(Constant.APPLICATION_VERSION, info.versionName);
			editor.commit();
		} else
		{
			action = Constant.ACTION_DETAIL;
		}

		Intent i = new Intent(action);
		startActivity(i);
		finish();
	}

}
