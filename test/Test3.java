
package test;


public class Test3{
	public static void main(String[] args) {
		Test33 t = Test33.get();
	}
}


class Test33 {
	//private은 외부에서는 절대 접글할 수 없다. 내부에서만 접근해라.
	//생성자로 객체를 생성해야 객체 내에 것을 사용할 수 있지만 생성자가 프라이빗이기 때문에 불러올 수 없다.
	//따라서 객체 생성전에 사용할 수 있게 하는 static을 쓰는 것이다.

	int a;
	int b;
	//생성자가 private로 선언 돼있기 때문에 Hello2에서 가져올 수가 없다!!
	//그렇다면 getter와 같은 방식으로 생성자 메서드를 가져올 필요가 있다!!
	private Test33(){
		System.out.println("불러옴11222");
	}
	//밖에서 생성자를 부르려고 하는데 생성자가 private으로 만들어져 있다.
	//따라서 밖에서 프라이빗의 생성자를 가져오기 위해 public으로 만들어서 가져온 것이다.
    //근데 생성자를 불러와야 객체를 만들 수 있는데 객체가 없기 때문에 객체가 없어도 사용이 가능한 static을 사용해서 만들어 준것이다.
	
	//	public static void get() {
	//		Test3 test = new Test3();
	//	} --> 이렇게 짜면 test는 지역변수기 때문에 사라진다.	
	public static Test33 get() {
		Test33 test = new Test33();
		return test;
	}
}