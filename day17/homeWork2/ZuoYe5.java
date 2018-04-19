package day17.homeWork2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ZuoYe5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileWriter fw = new FileWriter();
		PrintWriter pw = new PrintWriter("src/day17/homeWork2/a.txt");
		for(int i =1;i<=6;i++) {
			pw.write("ÐÇÆÚ"+i);
			pw.write("\r\n");
			pw.flush();
		}
		pw.close();
		
	}

}
