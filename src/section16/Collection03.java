package section16;

import java.util.Vector;

/*
 * 
 * Vector
 * 	선형배열 객체
 * 	ArrayList와 동일
 * 	Tread safe - sychronized 되어 있다. 
 *   - Tread(Main Tread)는 자바안에서 메서드를이 동시에 실행됨. 벡터 객체가 있을경우 Tread클레스들이 동시에 접근함.
 *   - sychronized(동기화)로 설정하면 각 Tread 클레스가 순차적으로 접근하도록 제어해줌
 * 
 */
public class Collection03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		//추가
		vec.add("피카츄");
		vec.add("라이츄");
		vec.add("파이리");
		
		System.out.println("저장된 데이터 개수: " + vec.size());
		
		//데이터 가져오기
		System.out.println("1번 인덱스 데이터 가져오기: " + vec.get(1));
		
		
	}
}
