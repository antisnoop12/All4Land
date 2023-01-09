package test;


class Hello6 {
	int a;
	int b;
	//생성자가 private로 선언 돼있기 때문에 Hello6에서 가져올 수가 없다!!
	//그렇다면 getter와 같은 방식으로 생성자 메서드를 가져올 필요가 있다!!
	private Hello6(){
		System.out.println("불러옴11111");
	}
	//밖에서 생성자를 부르려고 하는데 생성자가 private으로 만들어져 있다.
	//따라서 밖에서 프라이빗의 생성자를 가져오기 위해 public으로 만들어서 가져온 것이다.
    //근데 생성자를 불러와야 객체를 만들 수 있는데 객체가 없기 때문에 객체가 없어도 사용이 가능한 static을 사용해서 만들어 준것이다.
	public static Hello6 get() {
		Hello6 test = new Hello6();
		return test;
	}
}

public class Test1{
	public static void main(String[] args) {
		Hello6 t = Hello6.get();
		Hello6 t2 = Hello6.get();
		
		t.a= 10;
		t2.a= 11;
		System.out.println(t.a + " " + t2.a + " " + t.a);
	}
}