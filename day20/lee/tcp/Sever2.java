package day20.lee.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 *
 */
public class Sever2 {

	public static void main(String[] args) throws IOException {
		//1.获取serversocket对象
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器启动...");
		//获取客户端封装信息
		Socket socket = server.accept();
		//2.获取流
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//3.读取
		String str = br.readLine();
		System.out.println(str);
		
		//4.响应
		PrintStream ps = new PrintStream(socket.getOutputStream(),true);
		ps.println("hi");
		/*bw.write("hi");
		bw.newLine();
		bw.flush();*/
		
		//3.释放
		ps.close();
		br.close();
		socket.close();
		
	}

}
