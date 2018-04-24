package day20.lee.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo {

	public static void main(String[] args) throws UnknownHostException {
		//1.获取本机ip地址
		InetAddress address = InetAddress.getLocalHost();
		String hostName = address.getHostName();
		String ip = address.getHostAddress();
		System.out.println(hostName+":"+ip);
		
		//2.获取指定ip信息
		InetAddress address2 = InetAddress.getByName("192.168.1.152");
		System.out.println(address2.getHostName());
		
		//3.访问百度ip信息
		InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : addresses) {
			System.out.println(inetAddress.getHostAddress());
		}
	}

}
