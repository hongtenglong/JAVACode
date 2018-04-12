package day12;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String c = "";
		do {
			System.out.println(" ‰»Î–’√˚£∫");
			sb.append(c);
			c = sc.next();
		}while(!c.equals("q"));
		System.out.println(sb);
	}
}
