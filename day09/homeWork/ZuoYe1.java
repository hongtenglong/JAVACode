package day09.homeWork;

class QiChe{
	public void drive() {
		System.out.println("������ʻ");
	}
	public void brake(){
		System.out.println("����ɲ��");
	}
}
class KaChe extends QiChe{
	public void laHuo() {
		System.out.println("����");
	}
	public void xieHuo() {
		System.out.println("ж��");
	}
	@Override
	public void drive() {
		System.out.println("��������ʻ");
	}
	@Override
	public void brake(){
		System.out.println("������ɲ��");
	}
}

class Bus extends QiChe{
	public void baoZhan() {
		System.out.println("��վ");
	}
	public void tingKaoZhan() {
		System.out.println("ͣ��վ");
	}
	@Override
	public void drive() {
		System.out.println("������������ʻ");
	}
	@Override
	public void brake(){
		System.out.println("����������ɲ��");
	}
}

public class ZuoYe1 {
	public static void main(String[] args) {
		
	}
}
