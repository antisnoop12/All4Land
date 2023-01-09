package homework1P;

public class Subject {
	int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public Subject() {
		
	}
	
	//이런거 한줄 한줄이 확장성이다.
	public Subject(int score) {
		this.score = score;
	}
}
