import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPEchoClient {
	private DatagramSocket client;
	private DatagramPacket receivePacket, sendPacket;
	private Scanner scan;
	public UDPEchoClient() {
		try {
			this.client = new DatagramSocket();
			this.scan = new Scanner(System.in);
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	void service() {
		System.out.println("메시지 발송 준비 완료");
		try {
			while(true) {
				System.out.print("Enter a message to send to server : ");
				String message = this.scan.nextLine();
				if(message.equals("bye") || message.equals("quit")) break;
				this.sendPacket = new DatagramPacket(
						                        message.getBytes(), message.getBytes().length,
						                        InetAddress.getByName("localhost"), 50000);
				this.client.send(sendPacket);
				byte [] buffer = new byte[1024];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);
				this.client.receive(receivePacket);
				String msg = new String(buffer, 0, this.receivePacket.getLength());
				System.out.println("[Message from Server] : " + msg);
			}
		}catch(UnknownHostException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			if(this.client != null) this.client.close();
		}
	}
	public static void main(String[] args) {
		new UDPEchoClient().service();
	}
}
