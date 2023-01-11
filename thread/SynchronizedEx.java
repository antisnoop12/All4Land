package thread;
class ATM implements Runnable{
	private long depositeMoney = 20000;
	public void run() {
		synchronized (this) {
				//동기화 블록이 없을 경우에는 마구잡이로 스레드가 들어와 버린다.
				//동기화 블록에는 하나의 스레드만 들어와야한다.
			for (int i = 0 ; i < 20 ; i++) {

				try {
					Thread.sleep(300);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				if ( getDepositeMoney() <=0) 
					break;
				withDraw(1000);
//				
				notifyAll();
				try {
					wait();
				} catch (InterruptedException e) {
					// try-catch
					e.printStackTrace();
				}
				System.out.println("hi");
			}	
		}
	}
	
	public void withDraw(long howMuch) {

		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("money: %d %n", getDepositeMoney());
		}else {
			System.out.print(Thread.currentThread().getName()+ " , ");
			System.out.println("out.");
		}
		

	}	
	public long getDepositeMoney() {
		return depositeMoney;
	}	
}
public class SynchronizedEx {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		Thread father = new Thread(atm, "father");
		
		
		son.start();
		mother.start();
		father.start();
		

	}
}
