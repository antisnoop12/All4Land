package homework1P;

import java.util.Scanner;

public class StudentMany {
	
	int number;
	StudentScoreMag []ssm;
	static Scanner sc = new Scanner(System.in);
	public int getNumber() {
		return number;
	}

	public void setNumber(int num) {
		number = num;
	}

	public StudentScoreMag[] getSsm() {
		return ssm;
	}

	public void setSsm(StudentScoreMag[] ssm) {
		this.ssm = ssm;
	}

	public static void main(String[] args) {
		

		StudentMany sMany = new StudentMany();
		
		System.out.print("몇명?: ");
		sMany.setNumber(sc.nextInt());
		
		StudentScoreMag [] ssm2 = new StudentScoreMag[sMany.getNumber()];
		sMany.setSsm(ssm2);
		
		for(int i=0; i < ssm2.length ; i++) {
			StudentScoreMag ssm = new StudentScoreMag();
			String name = sc.next();
			int korS = sc.nextInt();
			int engS = sc.nextInt();
			int matS = sc.nextInt();
			ssm.setName(name);
			ssm.setKor(korS);
			ssm.setEng(engS);
			ssm.setMat(matS);
			ssm.setTotal(korS, engS, matS);
			ssm.setAvg(korS, engS, matS);
			ssm2[i] = ssm;
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		for(int i=0; i <ssm2.length ; i++) {
			System.out.println(ssm2[i].getName() + "\t"+ ssm2[i].getKor() + "\t" + ssm2[i].getEng() + "\t" + ssm2[i].getMat() + "\t" + ssm2[i].getTotal() + "\t" + ssm2[i].getAvg() );
		}
		
		
		
		
		
	}
}
