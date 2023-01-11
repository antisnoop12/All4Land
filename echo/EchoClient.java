package echo;

import java.io.*; 
import java.net.*; 
public class EchoClient { 
	private String ip; 
	private int port; 
	private String str; 
	private String hi;
	private String some;
	private String strGet; 
	private String hiGet;
	private String someGet;
	BufferedReader file; 
	BufferedReader file2; 
	
	public EchoClient(String ip, int port) throws IOException { 
		this.ip = ip; 
		this.port = port; 
		Socket tcpSocket = getSocket(); 
		OutputStream os_socket = tcpSocket.getOutputStream(); 
		InputStream is_socket = tcpSocket.getInputStream(); 

		BufferedWriter bufferW = new BufferedWriter( new OutputStreamWriter(os_socket)); 
		BufferedReader bufferR = new BufferedReader( new InputStreamReader(is_socket)); 
		System.out.print("message : "); 
		file = new BufferedReader( new InputStreamReader(System.in)); 
		str = file.readLine(); 
		str += System.getProperty("line.separator"); 
		bufferW.write(str); 
		bufferW.flush(); //
		System.out.print("message2 : "); 
		file = new BufferedReader( new InputStreamReader(System.in)); 
		some = file.readLine(); 
		some += System.getProperty("line.separator"); 
		bufferW.write(some); 
		bufferW.flush(); //
		strGet = bufferR.readLine(); 
		System.out.println("Echo Result : " + strGet); 
		hiGet = bufferR.readLine();
		System.out.println(hiGet);
		someGet = bufferR.readLine();
		System.out.println(someGet);
		file.close(); 
		bufferW.close(); 

		bufferR.close(); 
		tcpSocket.close(); 
	} 
	public Socket getSocket() { 
		Socket tcpSocket = null; 
		try { 
			tcpSocket = new Socket(ip, port); 
		} catch (IOException ioe) { 
			ioe.printStackTrace(); 
			System.exit(0); 
		} 
		return tcpSocket; 
	} 
	public static void main(String[] args) throws IOException { 
		new EchoClient("localhost", 2999); 
	} 
} 
