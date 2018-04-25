package day20.liaotian2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket socket1 = new DatagramSocket();// ���ظ��ͻ��˵�socket
		DatagramSocket socket = new DatagramSocket(1803);
		ServerSocket server = new ServerSocket(1805);
		List<InetAddress> list = new ArrayList<>();
		while (true) {
			// ���߳�����
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						try {
							Socket socket = server.accept();
							if (!list.contains(socket.getInetAddress())) {
								System.out.println("socket.toString:"+socket.toString());
								list.add(socket.getInetAddress());
							}
							// System.out.println(socket.getInetAddress().getHostAddress());
							// System.out.println(socket.getInetAddress().getHostName());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
			// System.out.println("����");
			
			byte[] buf = new byte[1024];
			try {
				// System.out.println("��������ڵȴ�����");
				socket.receive(new DatagramPacket(buf, buf.length));
				
				//System.out.println(new String(buf));
				// System.out.println("������ѻ������");
				// System.out.println(new String(buf));
				for (InetAddress inetAddress : list) {
					//System.out.println(inetAddress.getHostAddress());
					//System.out.println(inetAddress.getHostName());
					DatagramPacket packet = new DatagramPacket(buf, buf.length, 
							InetAddress.getByName(inetAddress.getHostAddress()) , 1804);
					System.out.println("�Ѿ����͸���"+inetAddress.getHostAddress());
					socket1.send(packet);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
