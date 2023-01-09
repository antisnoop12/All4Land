package method;

import java.util.Scanner;

public class ScoreMethod4 {
	public static void main(String[] args) {
		System.out.print("총 인원수는?: " );
		int number = ScoreMethod.inputInt();
		
		String []subject = new String[] {"이름","국어", "영어", "수학"};
		String [][]student = new String[number][6];
		
		makeArr(number, student, subject);
		print(number, student);
		
		
		
	}
	static void makeArr(int number, String [][]student, String []subject) {
		for(int j = 0; j<number ; j++) {
			
			//6회 반복
			for(int i = 0; i < 6 ; i++ ) {
				if(i<4) {
					System.out.print(subject[i]+": ");
					String sth;
					Scanner sc = new Scanner(System.in);
					sth = sc.next();
					student[j][i] = sth;
				}else if(i==4) {
					int kor = str2int(student[j][1]);
					int eng = str2int(student[j][2]);
					int math = str2int(student[j][3]);
					student[j][i] =int2str(sum(kor, eng, math));
				}else {
					student[j][i] = flo2str(avg(str2flo(student[j][4])));
				}
				
			}
			
		}
	}
	static void print(int number, String [][]student) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		for(int i = 0; i < number; i++) {
			for(int j=0 ; j <6 ; j++) {
				System.out.print(student[i][j]+"\t");
			}
			System.out.println();
		}
	}

	static int str2int(String str) {
		int num = Integer.parseInt(str);
		return num;
	}
	static String int2str(int num) {
		String str = Integer.toString(num);
		return str;
	}
	static float str2flo(String str) {
		float flo = Float.parseFloat(str);
		return flo;
	}
	static String flo2str(float flo) {
		String str = Float.toString(flo);
		return str;
	}
	static int sum(int a, int b, int c) {
		int sum = a+ b+ c;
		return sum;
		
	}
	static float avg(float sum) {
		float avg = sum/3;
		return avg;
	}
}