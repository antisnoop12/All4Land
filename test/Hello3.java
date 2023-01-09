package test;


/*
Is ~ A관계 (상속) : ~는 ~이다.
 
Has ~ A관계 (포함오브젝트) : ~는 ~를 가지고 있다.
*/
// 데이터클래스 - 데이터 관리 클래스와 같은 관계 --> has ~ a 관계
class A{ // 데이터 클래스 : 항상 독립적으로 만들어라!
	
	public A() {
		System.out.println("A");
	}
	public void dispA() {
		System.out.println("Disp :: A");
	}
}

class B{	// 데이터 클래스
	
	public B() {
		System.out.println("B");
	}
	public void dispB() {
		System.out.println("Disp :: B");
	}
}

public class Hello3{// 데이터 관리 클래스 
	
	A aa; //A타입에 접근할 수 있는 레퍼런스 변수 aa를 만든것 뿐이고 객체는 생성자 안썻기 때문에 아직이다.
	B bb;
	public Hello3() {
		aa = new A();
		bb = new B();
	}
	
	public void dispAsub() { //has ~a 관계이기 때문에 이렇게 건너건너 가야한다.
		aa.dispA();
	}
	
	public static void main(String[] args) {
		Hello3 h3 = new Hello3();
		h3.aa.dispA();
		h3.dispAsub();
	}
	
}