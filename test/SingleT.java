package test;

public class SingleT {
	
	int a = 3;
	private static final SingleT st = new SingleT();

	private SingleT(){

	}
	
	public static SingleT getInstance() {
		return st;
	}
	
	public static void main(String[] args) {
		SingleT single;
		//직접 접근이 불가능하기 때문에 static메소드를 경유해서 생성해준다.
		single = st.getInstance();
		System.out.println();
	}
}
