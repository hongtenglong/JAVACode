package day20;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Demo2 {
	public static void main(String[] args) throws UnknownHostException {
		//��ȡ����IP��ַ
		InetAddress address = InetAddress.getLocalHost();
		String hostName = address.getHostName();
		String ip = address.getHostAddress();
		System.out.println(hostName+":"+ip);
		
		//2.��ȡָ��ip��ַ
		InetAddress address2 = InetAddress.getByName("192.168.30.3");
		System.out.println(address2.getHostName());
		
		//3.���ʰٶ�IP��Ϣ
		InetAddress [] addresses = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : addresses) {
			System.out.println(inetAddress.getHostAddress());
		}
		
	}

}
