package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**示例：PrintWriter*/
public class TestPrintWriter {

	public static void main(String[] args) throws IOException {
/*		//1
		PrintWriter pw = new PrintWriter("d:/data/num.txt");
		//2
		for(int i = 1; i <= 5; i++) {
			pw.println("数字是："+i);
		}
		//3.
		pw.close();*/
		
		//---------------------------------------------
		//把 控制台上 输入的内容 存到 文件中
		//--------控制台输入内容读取 BufferedReader readLine()---------------------
		//1
		try(InputStreamReader ifr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(ifr);
		PrintWriter pw = new PrintWriter("d:/data/input.txt");){
			
			//2.
			String s;
			while(true) {
				s = bfr.readLine();
				if(s.equals("end")) {
					break;
				}
				pw.println(s);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
