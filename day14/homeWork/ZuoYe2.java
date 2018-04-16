package day14.homeWork;

import java.util.Scanner;

enum Season{
	SPRING("����","��ů����"),SUMMER ("����","��������"),
	FALL("����","�����ˬ"),WINTER("����","����ѩƮ");
	private String msg;
	private String season;
	private Season(String season,String msg) {
		this.msg = msg;
		this.season = season;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return season+"  "+ msg;
	}
	
}

public class ZuoYe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뼾�ڣ�");
		
		String season = sc.next();
		for (Season s : Season.values()) {
			if(s.getSeason().equals(season)) {
				System.out.println(s);
				break;
			}
		}
		
		
		/*Season season = Season.valueOf(sc.next());
		switch(season) {
		case SPRING:
			System.out.println(SPRING);
			break;
		case SUMMER:
			System.out.println(SUMMER);
			break;
		case FALL:
			System.out.println(FALL);
			break;
		case WINTER:
			System.out.println(WINTER);
			break;
		}*/
	}
}
