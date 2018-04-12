package day12;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**示例：String*/
public class TestDemo{
	public static void main(String[] args) {
		//String 
		String s =  new String("hello");
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "abc";
		String s4 = new String("hello");
		//地址
		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s == s1);
		System.out.println(s1 == s4);
		
		//不可变
		String str = "hello";
		//追加 字符串
//		System.out.println(str.concat("tom"));//"hellotom"
		str = str.concat("tom");
		str = "abc";
		System.out.println(str);//"abc"
		//----------------------------------------------
		String str1 = "hello";
		//长度 方法
		System.out.println(str1.length());//5
/*		String sn = "12456";
		System.out.println(sn.length());//3
*/	
		//equals字符序列（值）相等 区分大小写
		System.out.println(str1.equals("hello"));//true
		System.out.println(str1.equals("HellO"));//false
		
		//大小写兼容
		System.out.println(str1.equalsIgnoreCase("HellO"));//true
		//大写
		System.out.println(str1.toUpperCase());//"HELLO"
		//小写
		System.out.println(str1.toLowerCase());//"hello"
		// zhangs@163.com
		//             0
		String str2 = "hellohello he";
		//位置  参数字符串 在 当前字符串str2中第一次出现的位置索引
		System.out.println(str2.indexOf("he"));//0
		//最后一次出现的位置索引
		System.out.println(str2.lastIndexOf("he"));//11
		//不存在  返回 -1
		System.out.println(str2.lastIndexOf("haha"));//-1
		String str3 = "hellotom";
		//获得 指定位置的一个字符char superman.next().charAt(0);
		System.out.println(str3.charAt(5));//'t'
		//取子串
		//参数 是 起始位置 ，从 起始位置 取 到最后 [起始位置,末尾]
		System.out.println(str3.substring(5));//"tom"
		// [起始位置,终止位置)  不包括 终止位置
		System.out.println(str3.substring(2, 4));//"ll"
		//trim前 后 空格
		String str4 = "      h e l l o    ";
		System.out.println(str4.trim());
		//替换用 第2 个参数的 字符串 替换 第1 个参数的字符串;
		System.out.println(str4.replace("l", "xx"));
		//把 字符串 中 所有的空格都去掉
		System.out.println(str4.replace(" ", ""));//""
		//
		String str5 = "Demo.java";
		//以  参数 字符串 为结尾的  ,结果 true
		System.out.println(str5.endsWith("java"));//true
		//以参数 字符串 为 开头 ,是 结果 true
		System.out.println(str5.startsWith("Demo"));
		//
		String str6 = "zabc";
		String str7 = "zabc";
		//当前 字符串对象str6 在 参数字符串对象str7的前边  ，返回 负数
		//当前 字符串对象str6 在 参数字符串对象str7的后边，返回 正数
		//相同返回 0
		System.out.println(str6.compareTo(str7));
		//
		String str8 = "hello";
		char [] cs = str8.toCharArray();
	/*	for(char c:cs) {
			System.out.println("元素是："+c);
		}*/
	/*	int [] n = {3,4,5,6};
		Arrays.stream(n).forEach(System.out::println);*/
		//分割字符串 ，用参数字符串 分割 当前字符串 对象 为一个字符串数组
		String str9 = "aab b cc dd ee ff";
		String [] strs = str9.split(" ");
		for(String sx : strs) {
			System.out.println(sx);
		}
		//参数字符串  在当前字符串对象中是否包含，是 true
		System.out.println(str9.contains("cc"));//true
		
	}

}

