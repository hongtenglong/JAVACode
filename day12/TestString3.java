package day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**示例：正则验证*/
public class TestString3 {

	public static void main(String[] args) {
		// [0-9]{6} 邮编 6位数字
		Scanner input= new Scanner(System.in);
		System.out.println("输入一个邮政编码：");
		String s = input.next();
		//1.设置正则表达式
		Pattern p = Pattern.compile("\\d{6}");
		//2.设置要验证的 字符串
		Matcher m = p.matcher(s);
		//3.验证
		System.out.println(m.matches());// true
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
