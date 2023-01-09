package pushPop;

public class MyQueue extends Memory{




	@Override
	void pop() { //퍼스트 아웃
		index--;
		for(int i = 0 ; i <5 ; i++) { // 마지막을 제외하곤 앞으로 한칸씩 이동시켜준 후 배열의 마지막은 int의 null값인 0으로 지정
			if(i<4) {
				list[i]=list[i+1];
			}else if (i==4) {
				list[i] = 0;
			}
		}
	}
}
