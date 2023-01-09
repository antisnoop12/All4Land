package hw;

import java.util.Scanner;

/*
 *  성적 처리 프로그램
 *  1. 입력: 이름, 국, 영, 수
 *  2. 연산: 총점, 평균
 *  3. 출력: 이름, 국어, 영어, 수학, 총점, 평균
 *  3-1. 한 사람 성적만 먼저
 *  4. 학생수 입력, 배열 할당
 * 
 * 
 */
public class Score {
	public static void main(String[] args) {
//		String []arr = new String[] { };
		Scanner sc;
		sc = new Scanner(System.in);
		String []subject = new String[] {"1번", "2번", "3번"};
		System.out.println(subject.length);
		for(int iiiii=0; iiiii<subject.length ; iiiii++) {
			System.out.println(subject[iiiii]);
		}
		System.out.print("이름: ");
		String name = sc.next();
		int []score = new int[4]; //국영수총
		int total = 0;
		
		System.out.println("국영수 점수 차례대로: ");
		for(int i = 0; i<score.length ; i++) {
			if(i<score.length-1) { // score길이 - 1 =3 
				int score1 = sc.nextInt(); //score 길이 = 4
				score[i] = score1;
				total += score1;
			}else {
				score[i] = total;
			}


		}
//		float avg = (total)/3;
		System.out.println("이름\t국어\t영어\t수학\t총점\t");
		
		
		System.out.print(name+"\t");
		for(int i: score) {
			System.out.print(i+"\t");
		}
	}
	
}
