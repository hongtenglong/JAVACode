package day20.lee.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * @author Administrator
 *
 */
public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.获取socket对象
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		//2.获取流对象
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		/*bw.write("hello");
		bw.newLine();
		bw.flush();*/
		ps.println("hello");  //添加换行标志
		
		//3.读取
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(socket.getInetAddress().getHostAddress()+":"+str);
		}
		
		ps.close();
		br.close();
		socket.close();
	}

}
