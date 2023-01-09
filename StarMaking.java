package homework2;

import java.util.Scanner;

public class StarMaking {
	public static void main(String[] args) {
		//1번 직사각형
		int j1 = 0;
		while(j1<3) {
			int i1 = 0;
			while(i1<4) {
				System.out.print("*");
				i1 +=1;
			}	
			System.out.println();
			j1 +=1;
		}
		
		//2번 계단
		int i2 = 1;
		while(i2<4) {
			int j2 = 0;
			
			while(j2 < i2) {
				if(j2 == 3) break;
				System.out.print("*");
				j2 += 1;
				
			}		
			System.out.println();
			i2 += 1;
			
		}
		//3번 계단
		int i3 = 1;
		while(i3<4) {
			int k3 = 3;
			while(k3 > i3) {
				if(k3 == 0) break;
				System.out.print(" ");
				k3 -= 1;
				
			}
			int j3 = 0;
			while(j3 < i3) {
				if(j3 == 3) break;
				System.out.print("*");
				j3 += 1;
				
			}		
			System.out.println();
			i3 += 1;
			
		}
		//4번 산
		int i4 = 1;
		while(i4 < 6) {
			
			int j4 = 0;
			int k4 = 3;
			while(k4 > i4) {
				System.out.print(" ");
				k4 -= 1;
			}
			if(i4 % 2 == 1) {

				while(j4 < i4) {
					System.out.print("*");
					j4 +=1;
				}
				System.out.println("");
			}else {}
			
			i4 += 1;
		}
		//5번 다이아몬드

		int i5 = 1;
		int k5 = 0;
		double l5 = 2;
		while(i5 < 10) {
			if(i5 < 6) {
				k5 += 1;
				l5 -= 0.5;
			}else if(i5 >= 6) {
				k5 -= 1;
				l5 += 0.5;
			}
			if(k5 % 2 == 1) {
				int m5 = 0;
				while(m5 < l5) {
					System.out.print(" ");
					m5 += 1;
				}
				int j5 = 0;
				while(j5 < k5) {
					System.out.print("*");
					j5 += 1;
				}
			}
			else {
				System.out.println();
			}


			i5 += 1;
		}		

		//6번 입력 다이아몬드
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		makeDiamond(num);

		
		
	}
	public static void makeDiamond(int num) {
//		spacebarNum: 입력할 공백 수
//		num - starNum = 입력할 *의 수
//		spacebar의 수는 입력한 홀수를 2로 나눈 몫의 음수값(정수)부터 1씩 증가시키면 된다.
//		" *의 수 = 입력한 홀수 - (입력한 홀수를 음수로 바꾸고 1을 더해준 값) "을 2씩 증가시키면 된다.
		int spacebarNum = -1 * (num/2);
		int starNum = -1 * (num)+1;
		String spacebar = " ";
		String star = "*";
		for(int i=0; i<num; i++) {
			System.out.println(spacebar.repeat(Math.abs(spacebarNum))+star.repeat(num - Math.abs(starNum)));
			starNum += 2;
			spacebarNum += 1;
		}
		
	}
	
	
}
