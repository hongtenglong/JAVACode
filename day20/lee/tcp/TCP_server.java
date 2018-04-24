package day20.lee.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*服务器端
 */
public class TCP_server {

	public static void main(String[] args) throws IOException {
		//1.监听端口(3306 1521 8080 8443) 
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器已经创建...");
		//2.建立连接(阻塞)
		Socket socket = server.accept();
		//获取客户端的ip地址
		//System.out.println(socket.getInetAddress().getHostAddress());
		InputStream is = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		byte[] buf = new byte[1024];
		int data = -1;  
		StringBuffer sb = new StringBuffer();
		while((data=is.read(buf)) != -1){
			sb.append(new String(buf, 0, data));
		}
		System.out.println(socket.getInetAddress().getHostAddress()+"-->say:"+sb);
		
		//响应
		out.write("hello".getBytes());
		
		
		//3.关闭socket
		is.close();
		out.close();
		socket.close();
	}
	
}
