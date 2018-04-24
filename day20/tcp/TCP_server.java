package day20.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TCP_server {
	public static void main(String[] args) throws IOException {
		//1.监听端口(3306 1521 8080 8443)
		ServerSocket server = new ServerSocket(1211);
		System.out.println("服务器已创建。。。。。。");
		
		//建立连接（阻塞状态）
		Socket socket = server.accept();
		//获取客户端的IP地址
		//System.out.println(socket.getInetAddress().getHostAddress());
		InputStream is = socket.getInputStream();
		byte[] buf = new byte[1024];
		int data;
		StringBuffer sb = new StringBuffer();
		while((data = is.read(buf))!=-1) {
			//System.out.println(data);
			sb.append(new String(buf,0,data));
		}
		System.out.println("服务器端 say:"+sb);
		
		//响应
		OutputStream os = socket.getOutputStream();
		os.write("滚！！！".getBytes());
		System.out.println("gun");
		socket.shutdownOutput();
		//is.close();
		//os.close();
	}
}
