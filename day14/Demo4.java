package day14;

import java.util.Arrays;

class  Student11{
	private int score;
	private static Student11  stu1 = new Student11();
	private Student11(){};
	public static Student11 getInstance() {
		return stu1;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}
	
}

public class Demo4 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("[±ã±ã]");
		}
		for (int i = 10; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("[±ã±ã]");
		}
	}
}







