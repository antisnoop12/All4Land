package class3;
/*
 * 동적 바인딩
 * : 부모의 레퍼런스로 자식을 접근하는 방식
 * 
 * 정적바인딩
 * : 내가 나를 접근하는 방식.
 */
public class AbsExam1 {
	public static void main(String[] args) {
		Circle cir = new Circle();
		Rect rect = new Rect();
		Tri tri = new Tri();
		Area area ;
		area = cir;//동적 바인딩(부모 to 자식)
		//원래는 타입이 다를 경우 접근 불가해서 에러가 나지만 상속관계일 경우는 접근 가능
		area.draw();//cir.draw();
		
		area = rect;
		area.draw();//rect.draw();
		
		area = tri;
		area.draw();//tri.draw();
		
		//동적 바인딩은 하나의 이름으로 쉽게 접근할 수 있다. -> 다형성
		
	}
}
