package thread;

public class ExceptionText2 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		
		for(int i = 0 ; i < 5 ; i++) {
			try {
				System.out.println(arr[i]);
				System.out.println(i); //이건 무조건 찍고 싶은데 try catch로는 찍을 수 가 없어 그래서 쓰는게 finally
			}catch(ArrayIndexOutOfBoundsException ae){ // 예외처리기 - 이 상황에서는 하나의 예외만 처리해주므로 뒤에 catch(){}를 적어주면서 추가할 수 있다.
//				이런식으로 명시적으로 적어주는 것은 명시적으로 예외를 적어주고
//				명시적으로 적어준것 이외에 나머지도 다 잡아주고 싶다면 catch(Exception e){}이걸 뒤쪽에 달아주면 된다.
				System.out.println("AE error");
//				catch가 길어지면 가독성이 떨어지므로 메서드 뒤에 [throws 예외클래스 이름]을 적어주면 된다.
			}catch(Exception e){
				
			}finally {
				System.out.println("f: " + i);//예를 들어 뭔가를 열었을 때 무조건 닫아줘야 하는 경우 이런걸 쓴다.
			}
		}
		
		System.out.println("END ...");
	}
}
