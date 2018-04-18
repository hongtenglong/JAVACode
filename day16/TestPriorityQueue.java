package day16;

import java.util.PriorityQueue;

/**示例：优先队列*/
public class TestPriorityQueue {

	public static void main(String[] args) {
		//优先
		PriorityQueue<String>  p = new PriorityQueue<>();
		p.offer("cc");
		p.offer("aa");
		p.offer("bb");
		//队列 不允许 添加null,但是 LinkedList特殊,为了 代码兼容
//		p.offer(null);
//		p.forEach(System.out::println);
		//顺序是对的
		while(p.size() > 0) {
			System.out.println(p.poll());
		}
	}

}
