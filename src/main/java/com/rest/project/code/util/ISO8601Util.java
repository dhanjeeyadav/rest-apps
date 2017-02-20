package com.rest.project.code.util;
/**
 * 
 * Class: ISO8601Util.java
 * Description: This class is to get current timestamp in ISO8601 format 
 * 
 * **/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ISO8601Util
{
	private static TimeZone tz = TimeZone.getTimeZone("UTC");
	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");

	static
	{
		df.setTimeZone(tz);
	}

	public static String now()
	{
		return df.format(new Date());
	}
}