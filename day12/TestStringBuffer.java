package day12;

public class TestStringBuffer {

	public static void main(String[] args) {
		//string 不可变
	/*	String s = "hello";
		s = s.concat("tom");// "hellotom"
		System.out.println(s);//"hello"
*/
		// StringBuffer StringBuilder
		//可变字符串类
		StringBuffer sf = new StringBuffer();
		System.out.println(sf.capacity());//容量 16
		//字符串 的末尾 追加 字符串参数

		StringBuffer sf1 = new StringBuffer(100);//最大容量
		sf1.append("hello");
		System.out.println(sf1.capacity());//100
		//缩小 容量 为 添加的字符串的长度
		sf1.trimToSize();
		System.out.println(sf1.capacity());//5
		
		//添加
		char [] cs = {'a','b','c','d','e'};
		//
		sf1.append(cs, 1, 2);//"hellobc"
		System.out.println(sf1);
		//插入
		sf1.insert(5, "你好");//"hello你好bc"
		System.out.println(sf1);
		//修改  修改 指定参数位置  的 字符 为 第2个 参数的字符
		sf1.setCharAt(5, '您');//“hello您好bc"
		System.out.println(sf1);
		//删除  删除 指定参数 位置 的字符
		sf1.deleteCharAt(5);// “hello好bc"
		System.out.println(sf1);
		//删除 [start,end)  删除子串
		sf1.delete(5, 8);// “hello"
		System.out.println(sf1);
		//索引 第一次出现的位置索引
		int index1 = sf1.indexOf("ll");//2
		System.out.println(index1);
		sf1.append("ll");//"helloll"
		int index2 = sf1.lastIndexOf("ll");
//		String sf2 = new String("helloll");
		//最后一次
//		int index2 = sf2.lastIndexOf("ll");//5
		System.out.println(index2);
		System.out.println(sf1.charAt(4));//'o'
		//反转
		sf1.reverse();
		System.out.println(sf1);
		//
		String str = "1236";
		StringBuffer sf3 = new StringBuffer(str);
		sf3.reverse();
		System.out.println(sf3);
		
		
		
		
		
		
		
		
	}

}
