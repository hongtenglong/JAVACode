package day16;

import java.util.ArrayDeque;
import java.util.Deque;

/**示例：双端队列Deque*/
public class TestDeque {

	public static void main(String[] args) {
		//队列 ：先进先出
/*		Deque<String> d = new LinkedList<>();
		d.offer("aa");
		d.offerLast("bb");
		d.offer("cc");
		while(d.size() > 0) {
//			System.out.println(d.poll());//pollFirst();
			System.out.println(d.pollFirst());
		}
		*/
		
		
		//栈
		Deque<String> d = new ArrayDeque<>();
	/*	d.offerFirst("aa");
		d.addFirst("bb");
		d.offerFirst("cc");
		
		while(d.size() > 0) {
			System.out.println(d.pollFirst());
		}*/
		d.push("aa");
		d.push("bb");
		d.push("cc");
		
		while(d.size() > 0) {
			System.out.println(d.pop());
		}
		
		
		
		
		
		
		

	}

}
