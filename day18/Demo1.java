package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//�Զ��ͷ���Դ  ʵ���� AutoCloseable �ӿڵ�������Զ��ͷ�
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				PrintWriter pw = new PrintWriter("src/day18/data/name.txt");) {

			String name;
			while (!(name = br.readLine()).equals("q")) {
				pw.println(name);
				pw.flush();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
