package day16;

import java.util.LinkedList;
import java.util.Queue;

/**ʾ��������Queue*/
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
		//ģ�����
		System.out.println("------");
		while(q.size() > 0) {
			System.out.println(q.poll());
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
