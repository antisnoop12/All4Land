package test2;
/*
 * 상속
 * 1. 자바는 100프로 상속구조로 이루어져 있다.
 * 2. 최상위 클래스: Object
 * 3. 확장성, 재사용성을 위해 사용 => is ~ a관계일 때 상속을 사용한다.
 * 4. 단일 상속이 원칙 ( 복잡성을 피하기 위해서)
 * 5. 다중상속은 객체끼리는 허용 불가. 인터페이스는 다중상속을 허용한다(인터페이스는 복잡하지 않다).
 * 6. 상속해주는 클래스 => super class, 부모클래스
 *    상속받는 클래스 => sub class, 자식클래스 라고 부른다
 * 7. super class는 항상 sub class의 공통된 사항을 멤버로 제공(갖고 있다는 뜻)
 * 8. '상속받는다.'라는 의미는 super class의 모든것을 내것처럼 사용할 수 있다는 의미이다.
 * 9. super class의 private 멤버는 sub class에서 직접적으로 접근 할 수 없다.
 */
public class InhertanceExam extends Object {//extends의 의미는 내가 sub class가 되겠다!
	
	public static void main(String[] args) {
	// 상속을 해주더라도 private는 직접적인 접근이 불가하다.
		InhertanceExam in = new InhertanceExam();
		System.out.println(in.toString());
		
	}
}
