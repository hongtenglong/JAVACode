package day15;

import java.util.ArrayList;
import java.util.List;

/**练习：List*/
class Student{
	private String name;
	private int age;
	private int score;
	private String classNum;
	public Student() {
	}
	public Student(String name, int age, int score, String classNum) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getScore() {
		return score;
	}
	public String getClassNum() {
		return classNum;
	}
	@Override
	public String toString() {
		return name+","+age+","+score+","+classNum;
	}
	
}
public class TestList3 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三",22,80,"class01"));
		list.add(new Student("李四",23,90,"class01"));
		list.add(new Student("王五",24,100,"class02"));
		list.add(new Student("赵六",25,70,"class02"));
		list.add(new Student("周七",26,60,"class03"));
		list.add(new Student("吴八",27,50,"class03"));
		
		int count1 = 0,count2 = 0,count3 = 0;
		int sum1,sum2,sum3;
		sum1 = sum2 = sum3 = 0;
		int sumAge = 0;
		//平均年龄
		for(Student stu : list) {
			sumAge += stu.getAge();
		}
		System.out.println("平均年龄："+sumAge / list.size());
		
		//平均分数
		for(Student stu:list) {
			if(stu.getClassNum().equals("class01")) {
				count1 ++;
				sum1 += stu.getScore();
			}else if(stu.getClassNum().equals("class02")) {
				count2 ++;
				sum2 += stu.getScore();
			}else if(stu.getClassNum().equals("class03")) {
				count3 ++;
				sum3 += stu.getScore();
			}
		}
		System.out.println("class01:"+ sum1 / count1);
		System.out.println("class02:"+ sum2 / count2);
		System.out.println("class03:"+ sum3 / count3);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
