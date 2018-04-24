package day20.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while (true) {
			Socket socket = server.accept();
			//���߳�
			new Thread(new Runnable() {
				@Override
				public void run() {
					//2.��ȡ������
					//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					BufferedReader br;
					try {
						br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						//3.��ȡ
						String str = null;
						while ((str = br.readLine())!=null) {
							System.out.println("�������ˣ�"+str);
						}
						//��Ӧ
						ps.println("�������˷�����hello");
						ps.flush();
//						bw.write("��ð�");
//						bw.newLine();
//						bw.flush();
						
						//4.�ͷ�
						ps.close();
						br.close();
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();;
		}

	}

}
