package day20.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sever2 {
	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  hh:mm:ss");
		System.out.println(sdf.format(new Date()));
	}
}
