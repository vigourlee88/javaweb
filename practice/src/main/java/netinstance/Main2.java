package netinstance;

import java.net.InetAddress;

//使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名：
public class Main2 {
	public static void main(String[] args) throws Exception{
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("Local HostAddress: "
		+addr.getHostAddress());
		String hostname = addr.getHostName();
		System.out.println("Local host name: " + hostname);
	}
}
