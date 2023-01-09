package pushPop;

import java.util.Scanner;

public class UseJung {
	public static void main(String[] args) {
		UseJung uj = new UseJung();
		uj.play();
	}
	Scanner sc = new Scanner(System.in);

	String sQ;
	String pushPop;
	MyStack st = new MyStack();
	MyQueue qu = new MyQueue();
	
	public String getsQ() {
		return sQ;
	}

	public void setsQ(String sQ) {
		this.sQ = sQ;
	}

	public String getPushPop() {
		return pushPop;
	}

	public void setPushPop(String pushPop) {
		this.pushPop = pushPop;
	}

	
	public void play() {
		while(true) {			
			selectPushPop();
			print();
		}
		
	}
	public void selectPushPop() {
		System.out.print("s/q");
		setsQ(sc.next());
		System.out.print("push/pop");
		setPushPop(sc.next());
		if(sQ.equals("s")) {
			//각 영역이 처음부터 나뉘어져 있는 느낌
			if(pushPop.equals("push")) {
				int n = sc.nextInt();
				st.push(n);				
			}else if(pushPop.equals("pop")) {
				st.pop();
			}
		}else if(sQ.equals("q")) {
			if(pushPop.equals("push")) {
				int n = sc.nextInt();
				qu.push(n);	
			}else if(pushPop.equals("pop")) {
				qu.pop();
			}
		}
	}
	
	public void print() {
		for(int i =  0; i <5 ; i++) {
			System.out.println(st.list[i]);
		}
		System.out.println();

		for(int i =  0; i <5 ; i++) {
			System.out.println(qu.list[i]);
		}
	}
}
