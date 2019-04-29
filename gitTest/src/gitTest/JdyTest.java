package gitTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JdyTest {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local.getHostAddress());
	}

}
