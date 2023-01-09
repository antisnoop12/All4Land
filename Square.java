package homework2;

public class Square {
	public static void main(String[] args) {
		

//		for문으로 만들기
		int count = 0;//접은 횟수
		int rect = 1; //사각형 갯수
		
		for(count=0 ; rect<= 500; count++) {
			rect *=2;

		}
		System.out.println("사각형 개수" + rect + "접은 횟수" + count);
		
		//while로 만들기
		int count2 = 0;
		int rect2= 1;
		while(rect2<= 500) {
			rect2 *=2;
			count2 += 1;
		}
		System.out.println("사각형 개수" + rect2 + "접은 횟수" + count2);
		
	}
	
}

