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
		DatagramSocket socket1 = new DatagramSocket();// 返回给客户端的socket
		DatagramSocket socket = new DatagramSocket(1803);
		ServerSocket server = new ServerSocket(1805);
		List<InetAddress> list = new ArrayList<>();
		while (true) {
			// 多线程连接
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
			// System.out.println("测试");
			
			byte[] buf = new byte[1024];
			try {
				// System.out.println("服务端正在等待数据");
				socket.receive(new DatagramPacket(buf, buf.length));
				
				//System.out.println(new String(buf));
				// System.out.println("服务端已获得数据");
				// System.out.println(new String(buf));
				for (InetAddress inetAddress : list) {
					//System.out.println(inetAddress.getHostAddress());
					//System.out.println(inetAddress.getHostName());
					DatagramPacket packet = new DatagramPacket(buf, buf.length, 
							InetAddress.getByName(inetAddress.getHostAddress()) , 1804);
					System.out.println("已经发送给了"+inetAddress.getHostAddress());
					socket1.send(packet);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
