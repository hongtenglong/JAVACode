package day20.lee.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo {

	public static void main(String[] args) throws UnknownHostException {
		//1.��ȡ����ip��ַ
		InetAddress address = InetAddress.getLocalHost();
		String hostName = address.getHostName();
		String ip = address.getHostAddress();
		System.out.println(hostName+":"+ip);
		
		//2.��ȡָ��ip��Ϣ
		InetAddress address2 = InetAddress.getByName("192.168.1.152");
		System.out.println(address2.getHostName());
		
		//3.���ʰٶ�ip��Ϣ
		InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : addresses) {
			System.out.println(inetAddress.getHostAddress());
		}
	}

}
