package day20.lee.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*��������
 */
public class TCP_server {

	public static void main(String[] args) throws IOException {
		//1.�����˿�(3306 1521 8080 8443) 
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�������Ѿ�����...");
		//2.��������(����)
		Socket socket = server.accept();
		//��ȡ�ͻ��˵�ip��ַ
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
		
		//��Ӧ
		out.write("hello".getBytes());
		
		
		//3.�ر�socket
		is.close();
		out.close();
		socket.close();
	}
	
}
