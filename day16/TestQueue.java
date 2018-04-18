package day16;

import java.util.LinkedList;
import java.util.Queue;

/**示例：队列Queue*/
public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		q.add("aa");
		q.add("bb");
		q.add("cc");
		q.offer("dd");
		q.offer(null);
//		System.out.println(q);
		q.forEach(System.out::println);
		//模拟出队
		System.out.println("------");
		while(q.size() > 0) {
			System.out.println(q.poll());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
