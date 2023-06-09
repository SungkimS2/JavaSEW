package section16;
/*
 * 컬렉션(Collection)
 * 	자바에서 컬렉션은 여러객체를 모아서 저장하고 관리하는 자료구조를 말한다.
 * 
 * Stack 클래스
 * 	선입후출(FILO) : 먼저 들어온 값이 마지막에 나간다.
 * 
 */
import java.util.Stack;


public class Collection01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
//		Stack<object> stack = new Stack<>(); // 오브젝트 타입으로 받고 싶다면 타입을 안써도 됨
		
		
		// 생성한 객체에 자료 저장하기
		stack.push("중식");
		stack.push("일식");
		stack.push("한식");
		stack.push("돈까스");
		stack.push("서브웨이");
		stack.push("쌀국수");
	
		// 현재 저장하고 있는 데이터 개수
		System.out.println("데이터 개수: " + stack.size()); // 얘는 사이즈 메서드로 알 수 있음. 렝스 아님!
	
		// 데이터를 하나씩 빼오기
		System.out.println("1번: " + stack.pop()); // stack.pop() 메서드 사용하여 빼기
		System.out.println("2번: " + stack.pop());
		System.out.println("3번: " + stack.pop());
		
		
		// 가장 위에 있는 데이터 확인
		System.out.println("가장위에 있는 데이터: " + stack.peek()); // 스텍은 밑에서 부터 쌓이기 때문에 맨 위가 스텍메모리에선 멘 아래다
	
		//나머지도 빼기
		//while(!stack.empty()) {  비어있지 않을때 와일문이 돌면 안되기 때문에 stack 앞에 ! 또는 == false 사용
		while(stack.empty() == false) {
			String name = stack.pop();
			System.out.println("pop 데이터: " + name);
		}
		
	}
}
