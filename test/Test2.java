package test;

public class Test2 {
	int a;
	int b;

	private Test2() {
		System.out.println("찍힘");
	}
	
	public static Test2 get() {
		Test2 test = new Test2();
		return test;
	}
	
	public static void main(String[] args) {
		Test2 test4 = Test2.get();
	}
}

class Hello31{
	public static void main(String[] args) {
		Test2 test2 = Test2.get();
	}
}