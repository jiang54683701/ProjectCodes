package com.vincent.obd.utils;

import net.tsz.afinal.FinalHttp;
import net.tsz.afinal.http.AjaxCallBack;
import net.tsz.afinal.http.AjaxParams;

public class HttpUtil
{
	public static <T> void connect(String url, AjaxParams params,
			AjaxCallBack<T> callback)
	{
		FinalHttp fh = new FinalHttp();// timeout 10s, retry 5times
		fh.post(url, params, callback);
	}

}
