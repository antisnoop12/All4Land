package homework1P;

	// 이름 국 영 수 총 평 등등 이 필요!
public class StudentScoreMag {
	Name name;
	Subject kor;
	Subject eng;
	Subject mat;
	int total;
	float avg;
	
	public StudentScoreMag() {
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
		
	}
	public StudentScoreMag(String name, int kor , int eng , int mat) {
		this.name = new Name(name);
		this.kor = new Subject(kor);
		this.eng = new Subject(eng);
		this.mat = new Subject(mat);
		
	}
	
	public void setName(String name) {
		this.name.setName(name);
	}
	public void setKor(int kor) {
		this.kor.setScore(kor);
	}
	public void setEng(int eng) {
		this.eng.setScore(eng);
	}
	public void setMat(int mat) {
		this.mat.setScore(mat);
	}
	public void setTotal(int kor, int eng , int mat) {
		this.total = kor + eng + mat;
	}
	public void setAvg(int kor, int eng , int mat) {
		this.avg = (kor + eng + mat)/3;
	}
	
	public int getKor() {
		return kor.getScore();
	}
	public int getEng() {
		return eng.getScore();
	}
	public int getMat() {
		return mat.getScore();
	}
	public String getName() {
		return name.getName();
	}
	public int getTotal() {
		return total;
	}
	public float getAvg() {
		return avg;
	}
	
//	public static void main(String[] args) {
//		StudentScoreMag ssm = new StudentScoreMag();
//		ssm.setName("이름");
//		System.out.println(ssm.getName());
//	}
}
