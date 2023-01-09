package hw;

import java.util.Scanner;

public class ScorePrinter {
	private Scanner sc = new Scanner(System.in);
	private int number;
	private Student[] students = new Student[number];

	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	
	//결과물
	public void makeScoreBoard() {
		writeNumber();
		makeStudents();
		print();
	}
	//명수 입력 메소드
	public void writeNumber() {
		number = sc.nextInt();
	}
	//학생 객체 만들기 메소드
	public Student makeStudent() {
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수: ");
		int mat = sc.nextInt();
		
		
		Student stu = new Student(name, kor, eng, mat);
		
		return stu;
	}
	
	//학생을 명수 만큼 만들고 학생 배열 안에 넣기
	public void makeStudents() {
		for(int i = 0 ; i<number ; i++) {
			Student stu = makeStudent();
			students[i] = stu;
		}
	}
	//프린트 하기
	public void print() {
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		for(int i = 0 ; i < number ; i++) {
			students[i].print();
		}
	}
	
}
