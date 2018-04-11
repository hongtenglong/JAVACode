package day11.la;

import java.util.Arrays;
import java.util.List;

interface Run{
	void run();
}

class Person{
	
	public void show(Run run){
		run.run();
	}
	
}


public class TestLambda2 {

	
	public static void main(String[] args) {
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("aa");
			}
			
		}).start();*/
		//new Thread(()->{System.out.println("aa");}).start();
		/*String[] arrs = {"aa","bb","cc"};
		for (String str : arrs) {
			System.out.println(str);
		}*/
		
		//List<String> lists = Arrays.asList("aa","bb","cc");
		/*for (String str : lists) {
			System.out.println(str);
		}*/
		//±éÀú
		//lists.forEach((n)->{System.out.println(n);});
		//c++
		//lists.forEach(System.out::println);
		
		
		
	}
}
