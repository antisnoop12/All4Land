package pushPop;

public class MyStack extends Memory{

	
	@Override
	void pop() { //라스트 아웃
		if(index == 0) {
			
		}else {
			list[index-1] = 0;
			index--;
		}
	}

}
