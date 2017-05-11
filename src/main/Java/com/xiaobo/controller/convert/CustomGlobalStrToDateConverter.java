package com.xiaobo.controller.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomGlobalStrToDateConverter implements Converter<String, Date> {

	/**
	 * s:为源
	 * T：为目标
	 */
	

	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		try {
			Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(arg0);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
