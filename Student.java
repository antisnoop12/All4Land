package hw;

import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	private Scanner sc = new Scanner(System.in);
	
	//	getter setter
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	//디폴트 생성자를 보존하고 싶었습니다.
	public Student() {
		
	}
	//학생이 각각 정보가 다르기 때문에 생성자
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		total = total();
		avg = avg();
		//계산 메소드 뽑기
	}
	public int total() {
		return total = kor + eng + mat;
	}
	public float avg() {
		return total/3;
	}

	public void print() {
//		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%f",name,kor,eng,mat,total,avg);
	}
	

}
