package day16;

import java.util.LinkedList;
import java.util.Queue;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Demo1 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		String names[] = {"����","����","�","����","����",};
		for (int i = 0; i < names.length; i++) {
			names[i] = (i+1)+","+names[i];
			q.offer(names[i]);
		}
		while(q.size()>0) {
			System.out.println("*" + q.remove()+"�������");
			if (q.size()>0) {
				System.out.println("ʣ�ࣺ");
				q.forEach(System.out::println);
				System.out.println();
			}else {
				System.out.println("���û�ж�����");
				System.out.println("ȫ�����������");
			}
		}
	}
}
