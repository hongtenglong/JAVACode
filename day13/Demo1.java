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
		//����ת�ַ���
		String s = d1.toString();
		System.out.println(s);
		
		//�ַ���ת ����
		java.sql.Date d2 = java.sql.Date.valueOf(s);
		System.out.println(d2);
		//ʱ��
		java.sql.Time t1 = new java.sql.Time(date.getTime());
		String st = t1.toString();
		System.out.println(st);
		java.sql.Time t2 = java.sql.Time.valueOf(st);
		
		//ʱ���
		java.sql.Timestamp ts1 = new java.sql.Timestamp(date.getTime());
		String sts1 = ts1.toString();
		System.out.println(sts1);
		java.sql.Timestamp ts2 = java.sql.Timestamp.valueOf(sts1); 
		
		
		//-----------------------��ʽ��---------------------------
		//���ָ�ʽ�� NumberFormat
		NumberFormat nf1 = NumberFormat.getInstance();//Ĭ�ϻ�����Ĭ�Ϸ�ʽ
		System.out.println(nf1.format(456.5645645));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();//Ĭ�ϻ�����Ĭ�ϻ��ҷ�ʽ
		System.out.println(nf2.format(4354.65656565));
		
		//���� DecimalFormat
		//0 #
		DecimalFormat df1 = new DecimalFormat("#.00");
		System.out.println(df1.format(45.1));
		
		//DateFormat
		System.out.println(date);
		DateFormat f1 = DateFormat.getInstance();//��ǰĬ�ϻ�����Ĭ�����ڸ�ʽ����ʽ
		System.out.println(f1.format(date));
		
		DateFormat f2 = DateFormat.getDateInstance();
		System.out.println(f2.format(date));
		
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.SHORT);//������
		System.out.println(f3.format(date));
		
		DateFormat f4 = DateFormat.getDateInstance(DateFormat.MEDIUM);//������
		System.out.println(f4.format(date));
		
		DateFormat f5 = DateFormat.getDateInstance(DateFormat.LONG);//������
		System.out.println(f5.format(date));
		
		DateFormat f6 = DateFormat.getDateInstance(DateFormat.FULL);//��������
		System.out.println(f6.format(date));
		//ʱ���ʽ�ĸ�ʽ����ʽ
		DateFormat f7 = DateFormat.getTimeInstance(DateFormat.FULL);//��������
		System.out.println(f7.format(date));
		
		//ʱ�ں��ռ�ĸ�ʽ����ʽ
		DateFormat f8 = DateFormat.getDateTimeInstance();
		System.out.println(f8.format(date));
		DateFormat f9 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(f9.format(date));
		
		
		//���� SimpleDateFormat
		// yyyy MM dd hh mm ss SS
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��SS����");
		System.out.println(sf1.format(date));
		//H - 24Сʱ��
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy��MM��dd�� Hʱmm��ss��SS����");
		System.out.println(sf2.format(date));
		
		
		//-----------------------------------Date---------------------------------------------
		Date date2 = new Date();
		/*	��ʱ�ķ���
		 * System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());*/
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		//10��������
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














