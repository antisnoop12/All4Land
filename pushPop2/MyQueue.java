package pushPop2;

public class MyQueue extends Memory{

	int indexQ = 0;

	@Override
	void push(int number) {
		super.push(number);
		
	}
	@Override
	void pop() { //퍼스트 아웃
		if(index == 0) {
			
		}else {
			list[indexQ] = 0;
			indexQ++;
		}
	}
	

}
