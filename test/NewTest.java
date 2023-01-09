package test;


class Goverment {
	// a가 instance같지만 객체가 만들어졌기 때문에 a는 static으로 선언한 것과 같다.
	int city = 85;
	private static final Goverment gov = new Goverment();
	// 유일성 보장을 위해 final을 사용한다. static이면 외부로 부터 접근이 자유롭기 때문에 유일성을 망칠수 있다.
	//클래스 내에서 객체를 다시 할당하는 일이 없도록 final을 사용한다!
	private Goverment(){

	}
	
	public static Goverment getInstance() {
		return gov;
	}
	
	public void  say() {
		System.out.println("대한민국 정부");
	}

}

public class NewTest{
	public static void main(String[] args) {
		Goverment s1;
		Goverment s2;
		s1 = Goverment.getInstance();
		s1.city= 1;
		s2 = Goverment.getInstance();
		s2.city= 2;
		System.out.println(s1.city + " " + s2.city);
		
//		SingleTon a = new SingleTon();

	}
}