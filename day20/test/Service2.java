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
		// 获取serversocket对象
		ServerSocket ser = new ServerSocket(1);
		System.out.println("服务器启动");
		// 获取客户封装信息
		Socket soc = ser.accept();
		// 获取流
		// BufferedWriter bw=new BufferedWriter(new
		// OutputStreamWriter(soc.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());
		
		// 读取
		String str = br.readLine();
		System.out.println(str);
		
		
		// 响应
		ps.println("hihhhhhhh");
		ps.flush();
		/*
		 * bw.write("hi"); bw.newLine(); bw.flush();
		 */
		// 释放
		ps.close();
		br.close();
		soc.close();

	}
}
