package day16;

import java.util.LinkedList;
import java.util.Queue;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Demo1 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		String names[] = {"张三","郭靖","杨康","黄蓉","王五",};
		for (int i = 0; i < names.length; i++) {
			names[i] = (i+1)+","+names[i];
			q.offer(names[i]);
		}
		while(q.size()>0) {
			System.out.println("*" + q.remove()+"办理完成");
			if (q.size()>0) {
				System.out.println("剩余：");
				q.forEach(System.out::println);
				System.out.println();
			}else {
				System.out.println("后边没有队伍了");
				System.out.println("全部办理完成了");
			}
		}
	}
}
