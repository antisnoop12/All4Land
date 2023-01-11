package thread;

public class SingleThreadEx extends Thread{
	private int[] temp;
	public SingleThreadEx(String threadname) {
		super(threadname); // Thread의 생성자로 안에 넣은 값이 String타입이면 thread의 이름을 정해준 채로 thread객체를 생성한다.
		temp=new int[10];
		for(int start = 0 ; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() { //thread scheduler가 실행시켜준다.
		for(int start : temp){
			try {
				Thread.sleep(100); //100mili second씩 쉬어라. 실행
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("쓰레드 이름: %s", currentThread().getName()); //현재 쓰레드의 이름을 가져와라
			System.out.printf(" temp value: %d %n", start);
		}
	}
	public static void main(String[] args) {
		SingleThreadEx st = new SingleThreadEx("superman");
//		SingleThreadEx st2 = new SingleThreadEx("batman");
		st.start();
//		st2.start();
	}
}

class Th1 extends Thread{
	public void run() {
		
	}
}
class Th2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
