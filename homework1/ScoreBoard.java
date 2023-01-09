package homework1;

import java.util.Scanner;

public class ScoreBoard {
	
	
	public static void main(String[] args) {
		ScoreBoard sb = new ScoreBoard();
		sb.makeScoreBoard();
	}
	
	
	Name n;
	Subject s;
	Subject[] subjs = new Subject[3];
	Scanner sc = new Scanner(System.in);
	
	
	public void makeScoreBoard() {
		makeName();
		makeKor();
		makeEng();
		makeMat();
		printName();
		printSubject();
	}
	public void makeName() {
		System.out.print("이름: ");
		n = new Name(sc.next());
	}
	public void makeKor(){
		System.out.print("국어: ");
		s = new Subject("kor", sc.nextInt());
		subjs[0] = s;
	}
	public void makeEng(){
		System.out.print("영어: ");
		s = new Subject("eng", sc.nextInt());
		subjs[1] = s;
	}
	public void makeMat(){
		System.out.print("수학: ");
		s = new Subject("mat", sc.nextInt());
		subjs[2] = s;
	}

	public void printName() {
		System.out.print("이름: "+n.getName() + " ");
	}
	public void printSubject() {
		for(int i = 0; i <3 ; i++) {
			System.out.print(subjs[i].getSubName()+ ": " + subjs[i].getSubScore()+"\t");
		}
		System.out.print("총점: " + tot(subjs[0].getSubScore(),subjs[1].getSubScore(),subjs[2].getSubScore())+"\t");
		System.out.print("평균: " + avg(subjs[0].getSubScore(),subjs[1].getSubScore(),subjs[2].getSubScore())+"\t");
	}
	
	public int tot(int a, int b, int c) {
		int tot = a+ b + c;
		return tot;
	}
	public float avg(int a ,int b, int c) {
		float avg = (a+b+c)/3;
		return avg;
	}
}
