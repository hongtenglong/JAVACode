package day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {

	public static void main(String[] args) {
		//[0-9]{6}
		//1.设置正则表达式
		Pattern p = Pattern.compile("\\d{6}");
		//2.设置要验证的字符串
		Matcher m = p.matcher("123456");
		//3.验证
		System.out.println(m.matches());
		String s = "123456";
	}

}
