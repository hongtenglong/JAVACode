package day16;

import java.util.PriorityQueue;

/**ʾ�������ȶ���*/
public class TestPriorityQueue {

	public static void main(String[] args) {
		//����
		PriorityQueue<String>  p = new PriorityQueue<>();
		p.offer("cc");
		p.offer("aa");
		p.offer("bb");
		//���� ������ ���null,���� LinkedList����,Ϊ�� �������
//		p.offer(null);
//		p.forEach(System.out::println);
		//˳���ǶԵ�
		while(p.size() > 0) {
			System.out.println(p.poll());
		}
	}

}
