package pushPop;

import java.util.Scanner;

public class UseDong {
	public static void main(String[] args) {
		UseDong us = new UseDong();
		us.play();
	}
	Scanner sc = new Scanner(System.in);

	String sQ;
	String pushPop;
	MyStack st = new MyStack();
	MyQueue qu = new MyQueue();
	Memory mm;
	
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
			//영역에 접근하기 위함이라는 느낌
			mm = st;
			if(pushPop.equals("push")) {
				int n = sc.nextInt();
				mm.push(n);				
			}else if(pushPop.equals("pop")) {
				mm.pop();
			}
		}else if(sQ.equals("q")) {
			mm=qu;
			if(pushPop.equals("push")) {
				int n = sc.nextInt();
				mm.push(n);	
			}else if(pushPop.equals("pop")) {
				mm.pop();
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
