package day14.homeWork;

import java.util.Arrays;
import java.util.Comparator;

class Member implements Comparable<Member>{
	private int no;
	private String name;
	private int score;
	
	public Member(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return this.no - o.no;
	}
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	
	
}


public class ZuoYe3 {

	public static void main(String[] args) {
		Member [] m = new Member[3];
		m[0] = new Member(2,"����",53);
		m[1] = new Member(1,"����",89);
		m[2] = new Member(3,"����",63);
		
		
		//�ڲ��Ƚ��������ձ�Ž�����������
		//Arrays.sort(m);   
		
		//�ⲿ�Ƚ�����ʵ�ְ����ֽ�������
		Arrays.sort(m, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o2.getScore() - o1.getScore();
			}
		});
		
		
		//�ⲿ�Ƚ�����ʵ�ְ����ֽ�������lambda���ʽ
		//Arrays.sort(m,(m1,m2)->m2.getScore()-m1.getScore());
		
		Arrays.asList(m).forEach(System.out::println);

	}

}
