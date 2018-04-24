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
		List<InetAddress> AddressList = new ArrayList<>();// IP地址列表
		ServerSocket server = new ServerSocket(1804);// 每个客户端连接端口1804
		DatagramSocket socket = new DatagramSocket(1805); // 发送消息端口1803
		
		System.out.println("服务器已启动");
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
						buf = packet.getData();// 获取到的客户端数据
						for (InetAddress i : AddressList) {
							//System.out.println(i);
							DatagramPacket packet1 = new DatagramPacket(buf, buf.length, i.getLocalHost(), 1803);
							socket.send(packet1); //发送出去
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
