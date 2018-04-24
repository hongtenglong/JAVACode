package day20.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器启动。。。。");
		Socket socket = server.accept();
		
		
		//2.获取流对象
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		
		//3.读取
		String str = null;
		while ((str = br.readLine())!=null) {
			System.out.println("服务器端："+str);
		}
		
		//响应
		ps.println("服务器端发来的hello");
		ps.flush();
//		bw.write("你好啊");
//		bw.newLine();
//		bw.flush();
		
		//4.释放
		ps.close();
		br.close();
		socket.close();
		
	}

}
