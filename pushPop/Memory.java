package pushPop;

public abstract	class Memory {
	
	int [] list = new int[5];
	int index =0;
	
	//First in의 개념은 동일하기 때문에 같은 메서드를 상속해주기 위해 추상이 아닌 메서드로 제작했습니다.
	void push(int number) {
		list[index] = number;
		index++;
		
	}
	
	// 스택은 라스트아웃, 큐는 퍼스트인으로 서로 다릅니다. 하지만 pop으로 수를 빼야하기 때문에 다음과 같이 추상클래스로 제작했습니다.
	abstract void pop();
}
