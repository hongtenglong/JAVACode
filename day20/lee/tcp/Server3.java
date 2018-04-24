package day20.lee.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ������
 * @author Administrator
 *
 */
public class Server3 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while(true){
			Socket socket = server.accept();
			//�������
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						//2.��ȡ��
						//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//3.��ȡ
						String str = br.readLine();
						System.out.println(str);
						//4.��Ӧ
						PrintStream ps = new PrintStream(socket.getOutputStream(),true);
						ps.println("hi");
						/*bw.write("hi");
						bw.newLine();
						bw.flush();*/
						//3.�ͷ�
						ps.close();
						br.close();
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
}
