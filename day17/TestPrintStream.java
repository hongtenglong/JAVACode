package day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) throws IOException {
		// ��һ�� �ļ������ݶ�ȡ���� ���ڿ���̨�� ��ӡ���
		//��
		//1
		FileInputStream fin = new FileInputStream("d:/data/a.txt");
		//2��
		byte [] b = new byte[fin.available()];
		fin.read(b);
		//3.
		fin.close();
		
		//-------------------PrintStream-----------------------------
		//1
		PrintStream print = new PrintStream(System.out);
		//2
		print.println(new String(b,"gbk"));
		//3.
		print.close();
	}

}
