package day16;

import java.util.ArrayDeque;
import java.util.Deque;

/**练习：队列*/
class Person{
	private int no;
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return no+","+name;
	}
}
public class TestDeque2 {

	public static void main(String[] args) {
		// 银行排队
		Deque<Person> d = new ArrayDeque<>();
		Person p1 = new Person("张三");
		Person p2 = new Person("李四");
		Person p3 = new Person("王五");
		Person p4 = new Person("赵六");
		Person p5 = new Person("周七");
		Person [] pers = {p1,p2,p3,p4,p5};
		
		for(int i = 0; i < pers.length; i ++) {
			pers[i].setNo(i+1);//自动分配 递增的编号
			d.addLast(pers[i]);//元素加入 队列
		}
		
		while(d.size() > 0 ) {
			//出队
			System.out.println("* "+d.pollFirst()+" 办理完成");
			if(d.size() > 0) {
				d.forEach(System.out::println);
			}else {
				System.out.println("后边没有队伍了");
				System.out.println("全部办理完成");
			}
		}
	}

}
