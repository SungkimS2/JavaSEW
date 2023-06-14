package section16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List
 * 	컬렉션프레임웤 중 하나 인터페이스(list)로 순서가 있는 데이터 모음을 다루는 객체
 * 	선형 배열 객체
 * 	가변 배열	
 * 	인덱스값이 있다
 *  https://jhnyang.tistory.com/entry/%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4-%EB%8B%A8%EC%B6%95%ED%82%A4
 */
public class Collection02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // ArrayList <- 다형성으로 받을 수 있음
		
		// 데이터 저장하기		// 인덱스 번호 자동생성
		list.add("피카츄");	// 0
		list.add("라이츄");	// 1
		list.add("파이리");	// 2
		list.add("꼬부기");	// 3
		list.add("버터플");	// 4
		list.add("야도란");	// 5
		list.add("피존투");	// 6
		list.add("또가스");	// 7
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기
		
		String str = list.get(6); // list에서는 get메서드를 통해서 인덱스값을 가져올 수 있음
		System.out.println("list 6 인덱스 값: " + str);
		
		// 저장된 데이터에서 특정 인덱스 내용삭제하기
		list.remove(1);
		
		System.out.println("저장된 데이터의 개수: " + list.size()); // remove를 하면 인덱스 번호 위로 한칸씩 올라감
		
		String str2 = list.get(1);
		System.out.println("list 1 인덱스 값: " + str2);
		String str3 = list.get(6);
		System.out.println("list 1 인덱스 값: " + str3);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list[" +i+ "]: " + list.get(i));
		}
		
		System.out.println("=============================");
		
		// 확장 for문
		for(String name : list) {
			System.out.println("name: " + name);
		}
		//얕은 복사
		ArrayList list2 = (ArrayList) list;
		
		//깊은 복사
		List<String> list3 = (List<String>) list2.clone();
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("잠만보");
		linkedList.add("이브이");
		linkedList.add(1, "블래키");
		
		for(String name : linkedList) {
			System.out.println("Linked List : " + name);
		}

	}
} 
