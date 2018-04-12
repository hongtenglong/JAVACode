package day12;

import java.util.Scanner;

/**练习：StringBuffer*/
public class TestStringBuffer2 {

	public static void main(String[] args) {
		/*
		 * 循环输入学员的姓名，输入”q”结束后，将所有的姓名输出。
		 */
/*		Scanner input = new Scanner(System.in);
		String name;
//		String str = "";//空串
		StringBuffer sf = new StringBuffer();
		do {
			System.out.println("输入名字：");
			name = input.next();
			if(name.equals("q")) {
				break;
			}
			sf.append(name);
//			str += name;// str = str + name;
			
		}while(!name.equals("q"));
		System.out.println(sf);*/
		
		//测试
//		String s = "";
		StringBuffer s = new StringBuffer();
		//开始时间
		long start = System.currentTimeMillis();//毫秒值 1970 - 1-1 0：0：0 
		for(int i = 1; i <= 10000; i ++) {
//			s += i;// s = s + i;
			s.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);//
	}

}
