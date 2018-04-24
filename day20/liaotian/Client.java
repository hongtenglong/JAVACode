package day20.liaotian;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//192.168.30.3
public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.30.3", 1804);
		DatagramSocket socket1 = new DatagramSocket(1803);
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎来到聊天室");
		while(true) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					byte[] buf = new byte[1024];
					DatagramPacket p = new DatagramPacket(buf, buf.length);
					try {
						socket1.receive(p);
						buf = p.getData();
						System.out.println(new String(buf));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();
			
			System.out.print("输入：");
			String str = sc.nextLine();
			
			DatagramPacket packet1 = new DatagramPacket(str.getBytes(), str.length(), 
					InetAddress.getLocalHost(), 1805);
			socket1.send(packet1);
			
		}
	}

}
