package method;

import java.util.Scanner;

public class ScoreMethod2 {
	public static void main(String[] args) {
		System.out.print("총 인원수는?: " );
		int number = ScoreMethod.inputInt();
		
//		명수 입력
		String []subject = new String[] {"국어", "영어", "수학"};
		String []students = new String[number];
		int [][]score = new int[number][4];
		float []avgs = new float[number];

//		입력함수 호출
		ScoreMethod.input(number, students, score, subject, avgs);

//		출력함수 호출	
		ScoreMethod.print(students, score, avgs);
		
		
	}
// ==============================================================================
// 메서드
	//입력함수 - 이름
	static String inputName() {
		Scanner sc;
		sc = new Scanner(System.in);
		
		String input=sc.next();

		return input;
	}
	//입력함수 - 점수
	static int inputInt() {
		Scanner sc;
		sc = new Scanner(System.in);

		int input=sc.nextInt();

		return input;
	}
	//입력함수
	static void input(int number, String []students,int [][]score, String []subject, float []avgs) {
		for(int i = 0 ; i < number ; i++) {
			System.out.print("이름: ");
			String name = ScoreMethod.inputName();
			students[i] = name;
			
			int total = 0;
			System.out.println("---점수를 입력하세요--- ");
			for(int j = 0; j<score[i].length ; j++) {
				if(j<score[i].length-1) {
					System.out.print(subject[j]+":");
					int score1 = ScoreMethod.inputInt();
					score[i][j] = score1;

				}else{
					 total = ScoreMethod.sum(score[i][j-3], score[i][j-2], score[i][j-1]);
					 score[i][j] = total;

				}
				
				
			}
			avgs[i] = ScoreMethod.avg(total);
			
			
		}
	}
	//연산함수 - 총합
	static int sum(int a, int b, int c) {
		int totalScore = a + b + c;
		return totalScore;
	}
	//연산함수 - 평균
	static float avg(int total) {
		float avgScore = total/3;
		return avgScore;
	}
	//출력함수 - 이름
	static void print(String []students, int [][]score, float []avgs) {
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