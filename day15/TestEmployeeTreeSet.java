package day15;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Emplyee implements Comparable<Emplyee>{
	private int no;
	private String name;
	public Emplyee() {
	}
	public Emplyee(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return no+","+name;
	}
	@Override
	public int compareTo(Emplyee o) {
		
		return this.no - o.no;
	}	
}
public class TestEmployeeTreeSet {

	public static void main(String[] args) {
		// 自己指定 比较器
		SortedSet <Emplyee> emps = new TreeSet<>((o1,o2)-> o2.getNo() - o1.getNo());
		Emplyee zhangsan = new Emplyee(1,"zhangsan");
		Emplyee lisi = new Emplyee(3,"lisi");
		Emplyee wangwu = new Emplyee(2,"wangwu");
		
		emps.add(zhangsan);
		emps.add(lisi);
		emps.add(wangwu);
		
		emps.forEach(System.out::println);
		
	}

}
