package day09.homeWork;

class QiChe2{
	private String engine;
	private String wheel;
	
	public QiChe2() {
		super();
	}
	public QiChe2(String engine, String wheel) {
		super();
		this.engine = engine;
		this.wheel = wheel;
	}
	public void drive() {
		System.out.println("������ʻ");
	}
	public void brake(){
		System.out.println("����ɲ��");
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getWheel() {
		return wheel;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	
}
class KaChe2 extends QiChe2{
	String huoCang;
	int zaiZhong;
	
	
	
	public KaChe2() {
		super();
	}
	public KaChe2(String huoCang, int zaiZhong,String engine, String wheel) {
		super(engine,wheel);
		this.huoCang = huoCang;
		this.zaiZhong = zaiZhong;
	}
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
	public String getHuoCang() {
		return huoCang;
	}
	public void setHuoCang(String huoCang) {
		this.huoCang = huoCang;
	}
	public int getZaiZhong() {
		return zaiZhong;
	}
	public void setZaiZhong(int zaiZhong) {
		this.zaiZhong = zaiZhong;
	}
	
}

class Bus2 extends QiChe2{
	String keCang;
	int zaiKeLiang;
	
	
	
	public Bus2() {
		super();
	}
	public Bus2(String keCang, int zaiKeLiang,String engine, String wheel) {
		super(engine,wheel);
		this.keCang = keCang;
		this.zaiKeLiang = zaiKeLiang;
	}
	
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
	public String getKeCang() {
		return keCang;
	}
	public void setKeCang(String keCang) {
		this.keCang = keCang;
	}
	public int getZaiKeLiang() {
		return zaiKeLiang;
	}
	public void setZaiKeLiang(int zaiKeLiang) {
		this.zaiKeLiang = zaiKeLiang;
	}
	
}

public class ZuoYe2 {
	public static void main(String[] args) {
		KaChe2 k = new KaChe2("����", 20, "����", "����");
		Bus2 b = new Bus2("����", 20, "����", "����");
	}
}
