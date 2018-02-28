import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	public TCPEchoServer() {
		try {
			this.server = new ServerSocket(60000);
			System.out.println("Server is ready....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void service() {
		try {
			this.socket = this.server.accept();
			String client = this.socket.getInetAddress().getHostName();
			System.out.println("[" + client + "] is just connected");
			this.br = new BufferedReader(
					                 new InputStreamReader(this.socket.getInputStream()));
			this.pw = new PrintWriter(
					                new OutputStreamWriter(this.socket.getOutputStream()));
			String line = null;
			while((line = this.br.readLine()) != null) {
				System.out.println("[Message from client] : " + line);
				this.pw.println(line);   this.pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(this.br != null)  this.br.close();
				if(this.pw != null) this.pw.close();
				if(this.socket != null) this.socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new TCPEchoServer().service();
	}
}




