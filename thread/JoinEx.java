package thread;

import java.awt.desktop.ScreenSleepEvent;

class MyRunnableTwo implements Runnable{
		

	public void run() {
//		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " start");
			first();
//		}		
	}
	public void first() {
		System.out.println(Thread.currentThread().getName() + " first");
		second();
	}
	public void second() {
		System.out.println(Thread.currentThread().getName() + " end");
	}
}

public class JoinEx {
	public static void main(String[] args) { //메인도 하나의 Thread이다.
		System.out.println(Thread.currentThread().getName()+ " start");
		Runnable s = new MyRunnableTwo();
		
		Runnable r = new MyRunnableTwo();
		
		Thread myThreadR = new Thread(r,"r1");
		Thread myThreadR2 = new Thread(r,"r2");
		Thread myThreadS = new Thread(s,"s1");
		Thread myThreadS2 = new Thread(s,"s2");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		myThreadR.start();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
		myThreadR2.start();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
		myThreadS.start();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
		myThreadS2.start();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

//		try {
//			myThread.join();
//		} catch (InterruptedException ie) {
//			ie.printStackTrace();
//		}
//		
//		try {
//			myThread2.join();
//		} catch (InterruptedException ie) {
//			ie.printStackTrace();
//		}

		System.out.println(Thread.currentThread().getName()+ " end");
	
	
	}
}
