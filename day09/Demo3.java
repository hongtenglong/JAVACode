package day09;

import java.util.Scanner;

class Vehicle{
	private String brand;
	public Vehicle() {
		super();
	}
	public Vehicle(String brand) {
		super();
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void calRent(int day) {
		
	}
}

class Car1 extends Vehicle{
	String model;
	
}



public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(;num != 0;) {
			System.out.print(num%10);
			num = num/10;
		}
	}
}
