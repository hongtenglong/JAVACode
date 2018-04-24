package day20.lee.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �ͻ���
 */
public class TCP_client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.����scoket
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		//2.��������
		OutputStream out = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		out.write("hi".getBytes());
		//-1��־
		socket.shutdownOutput();
		
		//��ȡ�������˵���Ӧ
		byte[] buf = new byte[1024];
		int data = -1;  
		StringBuffer sb = new StringBuffer();
		while((data=is.read(buf)) != -1){
			sb.append(new String(buf, 0, data));
		}
		System.out.println("server say:"+sb);
		
		//3.�ر�socket
		out.close();
		is.close();
		socket.close();
		
	}

}
