import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPEchoClient {
	private Socket socket;
	private PrintWriter pw;
	private BufferedReader br;
	private Scanner scan;
	public TCPEchoClient() {
		try {
			this.socket = new Socket(InetAddress.getByName("ubuntu-00"), 60000);
			System.out.println("방금 서버와 연결됐습니다.");
			this.br = new BufferedReader(new InputStreamReader(
					this.socket.getInputStream()));
			this.pw = new PrintWriter(new OutputStreamWriter(
					this.socket.getOutputStream()));
			this.scan = new Scanner(System.in);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void service() {
		while(true) {
			System.out.print("Enter a message to send to server : ");
			String message = this.scan.nextLine();
			if(message.equals("bye") || message.equals("quit")) break;
			this.pw.println(message);   this.pw.flush();
			try {
				String msg = this.br.readLine();
				System.out.println("[Message from Server] : " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new TCPEchoClient().service();
	}
}
