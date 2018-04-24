package day20.lee.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {

	public static void main(String[] args) throws IOException {
		//1.����socket����
		DatagramSocket socket = new DatagramSocket(9999);
		//2.���յ�����
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		//2.��������
		socket.receive(packet);
		byte[] data = packet.getData();
		String str = new String(data, 0, data.length);
		System.out.println(packet.getAddress().getHostAddress()+":"+str);
		//�ر�
		socket.close();
	}

}
