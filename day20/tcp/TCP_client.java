package day20.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), 1211);
		OutputStream os =  socket.getOutputStream();
		os.write("����lailai".getBytes());
		
		//os.close();
		
		InputStream is = socket.getInputStream();
		byte[] buf = new byte[1024];
		int data;
		StringBuffer sb = new StringBuffer();
		while((data = is.read(buf))!=-1) {
			//System.out.println(data);
			sb.append(new String(buf,0,data));
		}
		System.out.println("�ͻ��� say:"+sb);
		socket.shutdownOutput();
		//is.close();
		//��ȡ�������˵���Ӧ
		//socket.close();
	}
}
