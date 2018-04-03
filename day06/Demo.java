package day06;

public class Demo {
	public static void main(String[] args) {
		String [] s = {"a","b"};
		//String s = "a";		
		Test1 t = new Test1();
		t.fu(s);
		System.out.println(s[0]);//Êä³ö a
	}
}

class Test1{
	public void fu(String[] s) {
		s[0] = "hehe";
	}
}