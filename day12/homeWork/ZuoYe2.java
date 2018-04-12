package day12.homeWork;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.layout.Background;

public class ZuoYe2 {
	public static void main(String[] args) {
		//作业1
		//模拟一个trim方法，去除字符串两端的空格。
		String s1 = "    hello worl   d   ";
		System.out.println(s1.trim());
		
		
		//作业2
		//将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
		int left = 2,right = 6;
		String s2 = "abcdefg";
		StringBuilder sb = new StringBuilder(s2);		
		StringBuilder ss2 = new StringBuilder(sb.substring(left, right));
		System.out.println(sb.replace(left, right, ss2.reverse().toString()));
		
		//作业3
		//获取一个字符串在另一个字符串中出现的次数。
        //比如：获取“ab”在 “abkkcadkabkebfkabkskab”
		// 中出现的次数
		StringBuilder sb3 = new StringBuilder("abkkcadkabkebfkabkskab");
		int count = 0;
		int index = sb3.lastIndexOf("ab");
		while(index!=-1) {
			count++;
			sb3.delete(index, index+2);
			index = sb3.lastIndexOf("ab");
		}
		System.out.println(count);
		
		
		//作业4
		//对字符串中字符进行自然顺序排序。
		String str4 = "ahjdashfjkancxxl";
		char [] c = str4.toCharArray();
		Arrays.sort(c);
		System.out.println(c);

	}
}
