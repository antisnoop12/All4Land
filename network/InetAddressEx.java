package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress iaddr = InetAddress.getLocalHost();
		iaddr = InetAddress.getByName("www.naver.com");
		System.out.println(iaddr.getHostAddress());
	}
}
