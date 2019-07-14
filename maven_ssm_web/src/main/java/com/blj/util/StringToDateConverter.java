package com.blj.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String s) {
      Date date=null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
            System.out.println("转换后日期格式是："+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
