package day14;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
	
	private int no;
	private int age;
	

	public Student(int no, int age) {
		super();
		this.no = no;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Student [no=" + no + ", age=" + age + "]";
	}

	//����
	@Override
	public int compareTo(Student o) {
		/*if(this.no > o.no){
			return 1;//����  ����
		}else if(this.no < o.no){
			return -1;//����  
		}else{
			return 0;
		}*/
		return this.no - o.no;
	}

	//�Ƚ�
	/*@Override
	public int compareTo(Object o) {
		//  this.no   o.no
		// TODO Auto-generated method stub
		return 0;
	}*/
	
}


public class CompareTest {

	public static void main(String[] args) {
		int[] arr = { 34,23,36,12 };
		Arrays.sort(arr);
		//�������
		Arrays.stream(arr).forEach(System.out::println);
		
		
		String[] arr2 = {"aa","cc","bb"};
		Arrays.sort(arr2);
		Arrays.stream(arr2).forEach(System.out::println);
		
		Student[] stus = new Student[3];
		stus[0] = new Student(3,18);
		stus[1] = new Student(1,20);
		stus[2] = new Student(2,21);
		//����������������
		//��Ȼ����(ʵ��compareable)
		//Arrays.sort(stus);
		//���ñȽ���
		/*Arrays.sort(stus, new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		});*/
		Arrays.sort(stus,(s1,s2)->{return s1.getAge()-s2.getAge();});
		//�������
		Arrays.stream(stus).forEach(System.out::println);
	}
	
}
