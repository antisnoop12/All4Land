package javaex;

import java.util.Scanner;

public class Calc {
	//종료 만들기
	public static void main(String[] args) {
		String yn = "";
		Scanner sc;
		sc = new Scanner(System.in);
		do {
			double num1 = sc.nextDouble();
			String ope = sc.next();
			double num2 = sc.nextDouble();

			System.out.println(calculate(num1,ope,num2));
			do {
				System.out.print("다시 계산하시겠습니까?(Y/N): ");
				yn = sc.next();
			}while(!yn.equals("Y") && !yn.equals("N"));

			System.out.println();
		}while(yn.equals("Y"));

	}
	
	
	
	static String calculate(double num1, String ope, double num2 ){
		String result = null;
		double resultInt = 0;
		int num1Int= (int)num1;
		int num2Int= (int)num2;
		if(num1%1 == 0 && num2%1==0) {
			
		}
			
		switch(ope) {
		case "+" : 
			resultInt= num1 + num2 ; 
			result = num1 +""+ ope +""+ num2+"="+resultInt;
			break;
		case "-" : 
			resultInt= num1 - num2 ; 
			result = num1 +""+ ope +""+ num2+"="+resultInt;
			break;
		case "*" : 
			resultInt= num1 * num2; 
			result = num1 +""+ ope +""+ num2+"="+resultInt;
			break;
		case "/" : 
			resultInt= num1 / num2; 
			result = num1 +""+ ope +""+ num2+"="+resultInt;
			break;
		default: 
			result= "잘못된 입력입니다."; 
			break;
		}

		
		
		return result;
	}
}
