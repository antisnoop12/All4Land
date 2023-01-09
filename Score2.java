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
public class Score2 {
	public static void main(String[] args) {
//		String []arr = new String[] { };
		Scanner sc;
		sc = new Scanner(System.in);
		
		
		System.out.print("사람수:");
		int number = sc.nextInt();
		
		
		String []students = new String[number];
//		float avg;
		int [][]score = new int[number][4]; //국영수총
		float []avgs = new float[number];
		String []subject = new String[] {"국어", "영어", "수학"};
		for(int i = 0 ; i < number ; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			students[i] = name;
			
			int total = 0;
			System.out.println("---점수를 입력하세요--- ");
			for(int j = 0; j<score[i].length ; j++) {
				if(j<score[i].length-1) {
					System.out.print(subject[j]+":");
					int score1 = sc.nextInt();
					score[i][j] = score1;
					total += score1;
				}else{
					score[i][j] = total;

				}
				
				
			}
			avgs[i] = total/3;
			
			
		}
		
		
//		float avg = (total)/3;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		
		for(int jj = 0 ; jj< students.length; jj++) {
			System.out.print(students[jj]+"\t");
			for(int ii: score[jj]) {
				System.out.print(ii+"\t");
			
			}
			System.out.println(avgs[jj]);
		}
	}
	
}
