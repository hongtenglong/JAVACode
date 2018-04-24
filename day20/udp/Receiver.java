package day20.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
	public static void main(String[] args) throws Exception {
		// 创建 socket对象
		DatagramSocket socket = new DatagramSocket(9999);
		byte [] buf = new byte[1024];
		DatagramPacket packet =new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		buf = packet.getData();
		String str = new String(buf, 0, buf.length);
		System.out.println(str);
		socket.close();
	}
}
