package day11.la;

interface La1{
	/*String show(String[] arrs);*/
	//boolean show(String str);
	/*int show(String str);*/
	/*Person1 create();*/
	String sub(String str,int start,int end);
}

class Person1{
	public void test(){
		System.out.println("aa");
	}
}


public class TestLambda3 {

	public static void main(String[] args) {
		
		/*La1 la = new La1() {
			@Override
			public String sub(String str, int start, int end) {
				return str.substring(start, end);
			}
		};
		System.out.println(la.sub("abcdef", 0, 3));*/
		/*La1 la = (str,a,b)->{return str.substring(a, b);};
		la.sub(str, start, end);*/
		La1 la =String::substring;
		//la.sub(str, start, end)
		
		//lambda
		//方法引用
		 //截取字符串
		//"aaa".substring(beginIndex, endIndex)
		//1.只调用一个方法，必须是类方法
		String[] arr = {"aa","bb","cc"};
		/*La1 la = (arrs)->{return Arrays.toString(arrs);};
		System.out.println(la.show(arr));*/
		/*La1 la = Arrays::toString;
		System.out.println(la.show(arr));*/
		
		//2.调用特定对象的实例方法
		/*La1 la = (str)->{return "aa".equals(str);};
		System.out.println(la.show("aa"));*/
		/*La1 la = "aa"::equals;
		System.out.println(la.show("aa"));*/
		//System.out::println;
		
		//3.对象的方法使用(str.length())
		/*La1 la = (str)->{return str.length();};
		System.out.println(la.show("aaa"));*/
		/*La1 la = String::length;
		System.out.println(la.show("aaa"));*/
		
		//4.调用构造器
		/*La1 la = ()->{return new Person1();};
		la.create().test();*/
		/*La1 la = Person1::new;
		la.create().test();*/
		
		//匿名内部类  --> lambda --> 方法引用
		 
		
		//截取字符串(  
		  // void sub(String str,int start,int end);
	    //)
		
	}
	
}
