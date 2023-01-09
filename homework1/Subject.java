package homework1;

import java.util.Scanner;

final public class Subject {

	private String subName;
	private int subScore;

	
	public String getSubName() {
		return subName;
	}
	
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	public int getSubScore() {
		return subScore;
	}
	
	public void setSubScore(int subScore) {
		this.subScore = subScore;
	}
	
	
	public Subject(String name, int score) {
		this.subName = name;
		this.subScore = score;
	}

}
