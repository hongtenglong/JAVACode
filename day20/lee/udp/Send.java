package day20.lee.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {

	public static void main(String[] args) throws Exception {
		//1.创建socket对象
		DatagramSocket socket = new DatagramSocket();
		//2.打包数据
		byte[] buf = "hello".getBytes();
		DatagramPacket packet = new DatagramPacket(buf, 
				buf.length, 
				InetAddress.getLocalHost(),//发送到的ip地址
				9999);
		//2.发送数据
		socket.send(packet);
		socket.close();
	}

}
