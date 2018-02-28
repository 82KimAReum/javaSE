import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress ia = InetAddress.getByName("www.microsoft.com");
		InetAddress [] array = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ia : array) {
			System.out.print(ia.getHostName() + " --> ");
			System.out.println(ia.getHostAddress());
		}
	}
}






