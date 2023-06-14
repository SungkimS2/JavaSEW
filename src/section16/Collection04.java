package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 	Set
 * 	 순서가 없는 데이터 집합
 * 	 중복을 허용하지 않는다.
 * 	 
 * 	반복자(Iterator)
 *   자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용되는 인터페이스.
 *   
 */
public class Collection04 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 데이터 저장 (순서없음)
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		set.add("파이리1");
		set.add("파이리2");
		set.add("파이리3");
		set.add("파이리4");
		
		// 중복값 허용 안함!
		set.add("잉어킹");
		set.add("잉어킹");
		set.add("잉어킹");
	
		
		// 데이터 개수
		System.out.println("데이터 개수: " + set.size());
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {	// hasNext() 다음요소가 있는지 확인해서 boolean 반환 set. 에 값이면 true 없느면 false다. 즉 값이 있는 만큼 반복문이 돈다.
			String name = it.next();	// 해당요소를 반환한다. 커서가 있는지 확인하고 넥스트로 값을 넣을 수 있다.
			System.out.println("name: " + name);
		}
	
	
	}
}
