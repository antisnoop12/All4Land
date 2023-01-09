package test2;

/*
 * super() 수퍼 호출
 * => 부모의 생성자를 호출할 수 있게 해준다. super class
 * => 현재 객체가 상속받고 있는 생성자를 호출
 * => 명시적으로 사용한다는 이야기는 '상위클래스의 오버로딩된 생성자를 고르겠다'는 의미!!
 * 
 *  오버라이딩 (다형성) => 동적 바인딩.
 *  : 부모의 메소드를 재정의
 *  오버로드와 달리 그냥 부모의 메소드를 그대로 적으면 된다.
 *  : 부모가 제공하는 기능을 가공하고 싶을 때(추가, 삭제, 변경)
 *  : 부모를 부르고 싶으면 super.을 override된 메소드 안에서 쓰면 된다.
 */
public class DD extends CC {
	
	public DD() {
		// 생성자의 첫번째 라인에는 항상 super()이 존재하고 있다.
		super();//이렇게 무조건 첫번째 줄에 있어야 한다!! 아래로 내려가면 에러 걸린다.
		System.out.println("D생성");
	}
	
	public static void main(String[] args) {
		DD dd = new DD();
		//CC만 알고 있다.
		//AA를 먼저 만든거 아님
		/*
		 * 1. DD생성자 호출
		 * 2. 
		 */
//		dd.dispAa();
//		dd.dispBb();
//		dd.dispCc();
		
		dd.dispCc();
		
	
	}
	
	//어노테이션 직관적으로 재정의 됐음을 보여주는 것! 아직까진 시각적인 효과
	@Override
	public void dispCc() {
		super.dispCc(); //부모의 멤버를 접근, super가 없다면 this가 있는 것이기 떄문에 무한 루프가 걸린다.
		System.out.println("Hello");
	}
	
}
