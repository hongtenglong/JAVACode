package day20.lee.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * @author Administrator
 *
 */
public class Server3 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		while(true){
			Socket socket = server.accept();
			//多个处理
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						//2.获取流
						//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//3.读取
						String str = br.readLine();
						System.out.println(str);
						//4.响应
						PrintStream ps = new PrintStream(socket.getOutputStream(),true);
						ps.println("hi");
						/*bw.write("hi");
						bw.newLine();
						bw.flush();*/
						//3.释放
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
