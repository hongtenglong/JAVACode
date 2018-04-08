package day08.caiquan;

public class Robot {
	private String name;
	private int score = 0;
	private static Robot r = new Robot();
	private Robot() {}
	public static Robot getRobot() {
		return r;
	}
	
	
	public int chuQuan() {
		return (int)(Math.random()*3+1);
	}
	
	
	public String getName() {
		return name;
	}
	public Robot setName(String name) {
		this.name = name;
		return this;
	}
	public int getScore() {
		return score;
	}
	public Robot setScore(int score) {
		this.score = score;
		return this;
	}
}
