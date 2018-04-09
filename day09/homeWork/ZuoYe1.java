package day09.homeWork;

class QiChe{
	public void drive() {
		System.out.println("父类行驶");
	}
	public void brake(){
		System.out.println("父类刹车");
	}
}
class KaChe extends QiChe{
	public void laHuo() {
		System.out.println("拉货");
	}
	public void xieHuo() {
		System.out.println("卸货");
	}
	@Override
	public void drive() {
		System.out.println("卡车类行驶");
	}
	@Override
	public void brake(){
		System.out.println("卡车类刹车");
	}
}

class Bus extends QiChe{
	public void baoZhan() {
		System.out.println("报站");
	}
	public void tingKaoZhan() {
		System.out.println("停靠站");
	}
	@Override
	public void drive() {
		System.out.println("公共汽车类行驶");
	}
	@Override
	public void brake(){
		System.out.println("公共汽车类刹车");
	}
}

public class ZuoYe1 {
	public static void main(String[] args) {
		
	}
}
