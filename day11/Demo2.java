package day11;
interface Test1{
	void sub(String str,int start,int end);
}

	
public class Demo2 {
	public static void main(String[] args) {
		new Test1() {
			@Override
			public void sub(String str, int start, int end) {
				// TODO Auto-generated method stub
				System.out.println(str.substring(start, end));
			}
		}.sub("abcdefg", 2, 5);
		
		Test1 t =(a,b,c)->{System.out.println(a.substring(b, c));};
		t.sub("abcdefg", 2, 5);
		
		Test1 t2 = String::substring;
		t2.sub("abcdefg",2,5);
	}
}
