package day20.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clinet2 {
	public static void main(String[] args) throws Exception {
		//1.��ȡsocket����
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		//2.��ȡ������
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println("�ͻ��˷�����hello");
		ps.flush();
		socket.shutdownOutput();
		
//		bw.write("hello");
//		bw.newLine();
//		bw.flush();
		//3.��ȡ
		String str = null;
		while ((str = br.readLine())!=null) {
			System.out.println("�ͻ��ˣ�"+str);		
		}
		
		br.close();
		ps.close();
		socket.close();
	}
}
