package day12;

public class TestInteger {

	public static void main(String[] args) {
	
		//装箱 ：基本类型  包装 成 类类型
		int n = 55;
		Integer i = new Integer(n);//int  - > Integer
		i = Integer.valueOf(n);
		
		i = n;//自动装箱 Integer.valueOf(n);
		
		//拆箱   类类型  对象中的  值取出来   Integer - > int 
		n =  i.intValue();//
		n = i;//自动拆箱 i.intValue();
		
		//-------------------------------------------
		//除了 Float 和 Double 以外，其它的 6种  都实现了 常量池的技术，在内存中有缓存
		//  只  缓存 了 -128  到 127
		Integer num1 = 22;
		Integer num2 = 22;
		
		System.out.println(num1 == num2);
		
		Integer num3 = 222;// Integer num3 = new Integer(222);
		Integer num4 = 222;
		System.out.println(num3 == num4);//false
		
		//---------------------方法---------------------------------
		//查看 数据类型的 上限 和 下限
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		//类型转换
		// String ->  int
		String s = "123";
		int number1 = Integer.parseInt(s);//常用
		number1 = Integer.valueOf(s);
		number1 = new Integer(s).intValue();
		
		//int - > String
		s = number1 + "";//常用
		s = Integer.toString(number1);
		s = String.valueOf(number1);
		
		// 进制转换
		System.out.println(Integer.toBinaryString(5));// 10 - > 2
		System.out.println(Integer.toHexString(15));// 10 - > 16
		System.out.println(Integer.toOctalString(5));// 10 - > 8
		System.out.println(Integer.valueOf("101",2));// 2 - > 10
		System.out.println(Integer.valueOf("17", 8));// 8 -> 10
		System.out.println(Integer.valueOf("f", 16));// 16 - > f
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
