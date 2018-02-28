import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	private DatagramSocket socket;
	private DatagramPacket receivePacket, sendPacket;
	public UDPEchoServer() {
		try {
			this.socket = new DatagramSocket(50000);
			System.out.println("Server is ready...");
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	void service() {
		try {
			while(true) {
				byte [] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);
				this.socket.receive(receivePacket);
				String msg = new String(buffer, 0, this.receivePacket.getLength());
				System.out.println("[Message from client] : " + msg);
				this.sendPacket = new DatagramPacket(msg.getBytes(), 
						                                                        msg.getBytes().length,
						                                       this.receivePacket.getAddress(),
						                                       this.receivePacket.getPort());
				this.socket.send(sendPacket);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			if(this.socket != null) this.socket.close();
		}
	};
	public static void main(String[] args) {
		new UDPEchoServer().service();
	}
}
