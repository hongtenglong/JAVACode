package day20.lee.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {

	public static void main(String[] args) throws Exception {
		//1.����socket����
		DatagramSocket socket = new DatagramSocket();
		//2.�������
		byte[] buf = "hello".getBytes();
		DatagramPacket packet = new DatagramPacket(buf, 
				buf.length, 
				InetAddress.getLocalHost(),//���͵���ip��ַ
				9999);
		//2.��������
		socket.send(packet);
		socket.close();
	}

}
