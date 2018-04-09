package day09.homeWork;

class Monster{
	private String name;
	private int health;
	private int atk;
	public void attack() {
		System.out.println(name + " 生命值：" +health+" 攻击力："+atk);
	}
	public void move() {
		System.out.println("移动");
	}
	
	
	public Monster(String name, int health, int atk) {
		super();
		this.name = name;
		this.health = health;
		this.atk = atk;
	}
	
	public Monster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
}

class SheGuai extends Monster{
	
	public SheGuai() {
		super("蛇怪", 110, 25);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void move() {
		System.out.println("曲线移动");
	}
	public void buXie() {
		if(getHealth()>=10)
			return;
		System.out.println("生命值低于10了 补加20生命值 ");
		setHealth(getHealth()+20);
	}
	
}
class WuGongJing extends Monster{
	
	public WuGongJing() {
		super("蜈蚣精", 120, 30);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("飞行移动");
	}
}



public class ZuoYe5 {
	public static void main(String[] args) {
		SheGuai s = new SheGuai();
		WuGongJing w = new WuGongJing();
		s.attack();
		w.setHealth(w.getHealth()-s.getAtk());
		s.buXie();
		s.move();
		w.attack();
		s.setHealth(s.getHealth()-w.getAtk());
		w.move();
	}
}
