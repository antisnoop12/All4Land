package thread;

public class SingleThreadEx2 implements Runnable{
	private int[] temp;
	public SingleThreadEx2() {
//		super(name); ->이땐 Object에 있는 생성자를 가져온 것이다.
		temp=new int[10];
		for(int start = 0 ; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() { //thread scheduler가 실행시켜준다.
		
		for(int start : temp){
			try {
				Thread.sleep(1000); //1000mili second씩 쉬어라. 실행
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("쓰레드 이름: %s,", Thread.currentThread().getName()); //현재 쓰레드의 이름을 가져와라 currentThread는 static메소드!!!
			System.out.printf(" temp value: %d %n", start);
		}
	}
	
	public static void main(String[] args) {
		SingleThreadEx2 st = new SingleThreadEx2(); //아직 스레드가 만들어지기 전상태
		Thread t = new Thread(st,"superman"); // 이때 스레드가 만들어지고 뒤에 String type의 superman으로 스레드 이름 부여
//		Thread t = new Thread(st);		
//		t.setName("superman"); 이렇게 만들 수도 있다!
		t.start();
	}
}
