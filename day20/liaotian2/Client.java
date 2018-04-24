package day20.liaotian2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket3 = new Socket("192.168.30.3", 1805); // 连接服务器TCP端口
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket1 = new DatagramSocket(1804);
		while (true) {
			DatagramSocket socket = new DatagramSocket();
			byte[] buf = new byte[1024];
			//System.out.print("请输入：");
			String str = sc.nextLine();
			buf = str.getBytes();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.30.3"), 1803);
			socket.send(packet);
			socket.close();

			// 多线程获取消息
			new Thread(new Runnable() {
				@Override
				public void run() {
					byte[] buf = new byte[1024];
					while (true) {
						try {
							socket1.receive(new DatagramPacket(buf, buf.length));
							System.out.println(new String(buf));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
		}

	}

}
