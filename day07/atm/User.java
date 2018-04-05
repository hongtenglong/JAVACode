package day07.atm;

import java.text.DecimalFormat;

public class User {
	private double money = 0.0;
	private String no;
	private String pwd;
	private String shenFenZhen;

	public String getShenFenZhen() {
		return shenFenZhen;
	}

	public void setShenFenZhen(String shenFenZhen) {
		this.shenFenZhen = shenFenZhen;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getNo() {
		return no;
	}

	public void setNo(int no) {
		String no1 = new DecimalFormat("000").format(no);
		this.no = no1;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ø®∫≈£∫" + no + "\t”‡∂Ó£∫" + money;
	}

}
