package day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**ʾ����������֤*/
public class TestString3 {

	public static void main(String[] args) {
		// [0-9]{6} �ʱ� 6λ����
		Scanner input= new Scanner(System.in);
		System.out.println("����һ���������룺");
		String s = input.next();
		//1.����������ʽ
		Pattern p = Pattern.compile("\\d{6}");
		//2.����Ҫ��֤�� �ַ���
		Matcher m = p.matcher(s);
		//3.��֤
		System.out.println(m.matches());// true
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
