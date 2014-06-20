package com.vincent.obd.utils;

import android.util.Log;

public class LogEx
{
	private static  boolean logSwtich = true; 
	
	private static String TAG = "OBD";
	
	public static void d(String tag, String msg)
	{
		if(logSwtich)
		{
			Log.d(TAG, "["+tag+"]: "+msg);
		}
	}
	
	public static void e(String tag, String msg)
	{
		if(logSwtich)
		{
			Log.e(TAG, "["+tag+"]: "+msg);
		}
	}
	
	public static void i(String tag, String msg)
	{
		if(logSwtich)
		{
			Log.i(TAG, "["+tag+"]: "+msg);
		}
	}
	
	public static void v(String tag, String msg)
	{
		if(logSwtich)
		{
			Log.v(TAG, "["+tag+"]: "+msg);
		}
	}
	
	public static void w(String tag, String msg)
	{
		if(logSwtich)
		{
			Log.w(TAG, "["+tag+"]: "+msg);
		}
	}
	
}
