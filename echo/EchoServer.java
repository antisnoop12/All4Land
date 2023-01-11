package echo;

import java.io.*; 
import java.net.*; 
public class EchoServer{ 
	private BufferedReader bufferR; 
	private BufferedWriter bufferW; 
	private InputStream is; 
	private OutputStream os; 
	private ServerSocket serverS; 
	public EchoServer(int port){ 
		//1. 서버에서 서버소켓을 만든다. 아래서 만든 서버소캣의 포트는 port=3000
		try{ 
			serverS = new ServerSocket(port); 
		}catch(IOException ioe){ 
			ioe.printStackTrace(); 
			System.exit(0); 
		} 
		//2. 무한루프문 안에 accept를 넣어놔서 청취할때 까지 무한 대기
		while(true){ 
			try{ 
				System.out.println("클라이언트의 요청을 기다리는 중"); 
				Socket tcpSocket = serverS.accept(); 
		// 여기서 무한 대기
				System.out.println("클라이언트의 IP 주소 : "+ tcpSocket.getInetAddress().getHostAddress()); 
				is = tcpSocket.getInputStream(); 
				os = tcpSocket.getOutputStream(); 
				
	
				bufferR = new BufferedReader(new InputStreamReader(is)); 
				bufferW = new BufferedWriter(new OutputStreamWriter(os));//여기서 대기? 
				//bufferR로 받기 시작하고
				String message = bufferR.readLine(); 
				System.out.println("수신메시지 : "+ message); 
				message += System.getProperty("line.separator"); 
				String message2 = bufferR.readLine(); 
				System.out.println("수신메시지 : "+ message2); 
				message2 += System.getProperty("line.separator"); 
				
				//여기까지 받고
				bufferW.write(message); 
				bufferW.write("hi"); 
				bufferW.write(message2); 
				bufferW.flush(); 
				
				//여기서 클라이언트로 다시 보내고
				bufferR.close(); 
				bufferW.close(); 
				tcpSocket.close(); 
			}catch(IOException ioe){ 
				ioe.printStackTrace(); 
			} 
		} 
	} 
	public static void main(String[] args){ 
		new EchoServer(2999); //
	} 
} 