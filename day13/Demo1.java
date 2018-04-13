package day13;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		long n = date.getTime();
		System.out.println(n);
		/*
		 * Fri Apr 13 09:28:05 CST 2018
			1523582885106
		 */
		Date date1 = new Date(1523582885106l);
		System.out.println(date1);
		
		java.sql.Date d1 = new java.sql.Date(date.getTime());
		//日期转字符串
		String s = d1.toString();
		System.out.println(s);
		
		//字符串转 日期
		java.sql.Date d2 = java.sql.Date.valueOf(s);
		System.out.println(d2);
		//时间
		java.sql.Time t1 = new java.sql.Time(date.getTime());
		String st = t1.toString();
		System.out.println(st);
		java.sql.Time t2 = java.sql.Time.valueOf(st);
		
		//时间戳
		java.sql.Timestamp ts1 = new java.sql.Timestamp(date.getTime());
		String sts1 = ts1.toString();
		System.out.println(sts1);
		java.sql.Timestamp ts2 = java.sql.Timestamp.valueOf(sts1); 
		
		
		//-----------------------格式化---------------------------
		//数字格式化 NumberFormat
		NumberFormat nf1 = NumberFormat.getInstance();//默认环境的默认方式
		System.out.println(nf1.format(456.5645645));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();//默认环境的默认货币方式
		System.out.println(nf2.format(4354.65656565));
		
		//子类 DecimalFormat
		//0 #
		DecimalFormat df1 = new DecimalFormat("#.00");
		System.out.println(df1.format(45.1));
		
		//DateFormat
		System.out.println(date);
		DateFormat f1 = DateFormat.getInstance();//当前默认环境的默认日期格式化方式
		System.out.println(f1.format(date));
		
		DateFormat f2 = DateFormat.getDateInstance();
		System.out.println(f2.format(date));
		
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.SHORT);//短日期
		System.out.println(f3.format(date));
		
		DateFormat f4 = DateFormat.getDateInstance(DateFormat.MEDIUM);//中日期
		System.out.println(f4.format(date));
		
		DateFormat f5 = DateFormat.getDateInstance(DateFormat.LONG);//长日期
		System.out.println(f5.format(date));
		
		DateFormat f6 = DateFormat.getDateInstance(DateFormat.FULL);//完整日期
		System.out.println(f6.format(date));
		//时间格式的格式化方式
		DateFormat f7 = DateFormat.getTimeInstance(DateFormat.FULL);//完整日期
		System.out.println(f7.format(date));
		
		//时期和日间的格式化方式
		DateFormat f8 = DateFormat.getDateTimeInstance();
		System.out.println(f8.format(date));
		DateFormat f9 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(f9.format(date));
		
		
		//子类 SimpleDateFormat
		// yyyy MM dd hh mm ss SS
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒SS毫秒");
		System.out.println(sf1.format(date));
		//H - 24小时制
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy年MM月dd日 H时mm分ss秒SS毫秒");
		System.out.println(sf2.format(date));
		
		
		//-----------------------------------Date---------------------------------------------
		Date date2 = new Date();
		/*	过时的方法
		 * System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());*/
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		//10年后的日期
		c.add(Calendar.YEAR, 10);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 4-1, 22);
		System.out.println(sf2.format(c1.getTime()));
		
		Calendar c2 = Calendar.getInstance();
		c2.set(1996, 12-1, 10);
		System.out.println(sf2.format(c2.getTime()));
	}
}














