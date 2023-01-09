package homework2;

public class Multiply {

	public static void main(String[] args) {

		for(int i=1; i<10 ; i++) {
			for(int j=2; j<10 ; j++) {
				int k=i*j;
				if(j ==9) {
					System.out.println(j+"*"+i+"="+k);
				}else {
					System.out.print(j+"*"+i+"="+k + "\t");
				}

			}
		}
		
		//강사님 코드
		for(int i=1; i<10 ; i++) {
			for(int j=2; j<10 ; j++) {
				int k=i*j;

					System.out.print(j+"*"+i+"="+k + "\t");
				

			}
			System.out.println();
		}
		// while로 만들기
		int ii = 1;
		while(ii<10) {
			int jj = 2;
			while(jj<10) {
				int kk = ii*jj;
				System.out.print(jj+"*"+ii+"="+kk +"\t");
				jj +=1;
			}
			System.out.println();
			ii += 1;
		}
		
//		초기문;
//		while(조건문) {
//			증감문;
//		}
//		while문은 증감문의 위치를 잘 확인해 줄 필요가 있다.
//		while문의 초기문은 while문 위에 무조건 있어야한다. 그래야 헷갈리지 않는다.
//		int ii = 0;
//		while(ii<3) {
//			System.out.println(ii);
//			ii++;
//		}
//		
//		for(int ii2 = 0;ii2<3;ii2++) {
//			System.out.println(ii2);
//		}
		
//		do {
//			
//			System.out.println("Test");
//			
//		}while(조건문);
//		싫든 좋든 do 문이 한번은 실행되고 조건문에 따라 바뀌게 된다.
		
		
		
		
		
		
	}
}
