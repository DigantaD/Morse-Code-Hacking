import java.util.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {

	public int Ip_Send() {

		InetAddress address = null;
		String url;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter URL/Network Address to be analyzed: ");
		url = s.next();

		try {

			address = InetAddress.getByName(url);
		} catch (UnknownHostException e) {

			System.out.println("Invalid or Unknown Address.");
			System.exit(2);
		}

		ip = address.getHostAddress();
		return ip;
		System.exit(0);
	}
}