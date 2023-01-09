package class3;
/*
 * 추상 클래스 : 구체화가 되지 않는 클래스
 * 			: 객체를 생성할 수 없다.
 * 			- 기본적으로 상속을 목적으로 사용.
 * 			- super class로 사용 
 * 
 * 
 *		- 추상메소드를 하나 이상 가지고 있는 클래스
 *		- 추상 메소드란 : 바디{}가 없는 메소드 즉, 이름만 가지고 있는 메소드 
 *		- 추상 메소드는 오버라이드를 위해 사용한다.(★강제성을 부여한다★ -> 무조건 오버라이드 해서 만들어야 한다. 
 *				오버라이드 하지 않고 상속 받으면 클래스가 자동으로 추상클래스가 되기 때문에 객체를 만들 수 없다.
 *				객체 만들고 싶으면 오버라이드를 해라★!)
 *
 *		- 이름 부여하고 큰 틀을 만들어 강제성을 부여할 때 사용한다. 즉 꼭 필요한것!! 대신 내용은 작성자가 채운다.
 *		
 */
public class AbsClass extends Abs{

	public static void main(String[] args) {
//		Abs abs = new Abs(); 이거 안된다! 추상 클래스는 객체를 생성할 수 없다!
		AbsClass abs = new AbsClass();
		
	}

	void disp() {
		
	}
}

abstract class Abs{ //이렇게 명확하게 abtract라는 메소드를 갖고 있다면 추상 클래스라고 명시해 주어야 한다★★★
	abstract void disp();
}
