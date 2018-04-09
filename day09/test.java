package day09;

class Heart extends Thread{
	String [] s = new String[100];
	Heart() {
		for (int i = 0; i < s.length; i++) {
			s[i] = "A";
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length; i++) {
			if(i == s.length-1) {
				i = 0;
			}
			s[i] = "A";
			//System.out.println("Íê");
		}
		System.out.println("Íê1111111111111111111111111111");
	}
}


public class test {
	public static void main(String[] args) {
		Heart [] s = new Heart[10000];
		for (int i = 0; i < 10000; i++) {
			s[i] = new Heart();
			s[i].start();
		}
	}
}
