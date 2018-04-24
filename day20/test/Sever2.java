package day20.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sever2 {

	public static void main(String[] args) throws Exception {
		// 获取socket对象
		Socket soc = new Socket(InetAddress.getLocalHost(), 9999);
		// BufferedWriter bw=new BufferedWriter(new
		// OutputStreamWriter(soc.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());
		ps.println("hello");
		ps.flush();
		soc.shutdownInput();

		/*
		 * bw.write("hello"); bw.close();
		 */
		/*
		 * String str=br.readLine(); System.out.println(str);
		 */
		int i;
		while ((i=br.read())!=-1) {
			System.out.println(i);
		}
		
		String a = null;
		while ((a = br.readLine()) != null) {
			System.out.println(a);
		}

		ps.close();
		br.close();
		soc.close();
	}
}
