package day20.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service2 {

	public static void main(String[] args) throws IOException {
		// ��ȡserversocket����
		ServerSocket ser = new ServerSocket(1);
		System.out.println("����������");
		// ��ȡ�ͻ���װ��Ϣ
		Socket soc = ser.accept();
		// ��ȡ��
		// BufferedWriter bw=new BufferedWriter(new
		// OutputStreamWriter(soc.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());
		
		// ��ȡ
		String str = br.readLine();
		System.out.println(str);
		
		
		// ��Ӧ
		ps.println("hihhhhhhh");
		ps.flush();
		/*
		 * bw.write("hi"); bw.newLine(); bw.flush();
		 */
		// �ͷ�
		ps.close();
		br.close();
		soc.close();

	}
}
