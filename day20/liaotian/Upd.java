package day20.liaotian;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Upd {
	public static void main(String[] args) throws Exception {
		List<InetAddress> AddressList = new ArrayList<>();// IP��ַ�б�
		ServerSocket server = new ServerSocket(1804);// ÿ���ͻ������Ӷ˿�1804
		DatagramSocket socket = new DatagramSocket(1805); // ������Ϣ�˿�1803
		
		System.out.println("������������");
		while (true) {
			Socket cSocket = server.accept();
			new Thread(new Runnable() {
				public void run() {
					InetAddress address = cSocket.getInetAddress();
					synchronized (this) {
						if (!AddressList.contains(address)) {
							AddressList.add(address);
						}
					}
					try {
						Thread.sleep(500l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();;
			
			new Thread(new Runnable() {
				byte[] buf = new byte[1024];
				@Override
				public void run() {
					// TODO Auto-generated method stub
					DatagramPacket packet = new DatagramPacket(buf, buf.length);
					try {
						socket.receive(packet);
						buf = packet.getData();// ��ȡ���Ŀͻ�������
						for (InetAddress i : AddressList) {
							//System.out.println(i);
							DatagramPacket packet1 = new DatagramPacket(buf, buf.length, i.getLocalHost(), 1803);
							socket.send(packet1); //���ͳ�ȥ
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//byte [] b = socket.getInetAddress().getHostName();
					
				}}).start();
			
		}
		
	}
}
