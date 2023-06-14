package section17;
/*
 * 
 *	스트림(Stream)
 *	 Java 컬렉션을 처리하고 조작하는 기능을 제공하는 API이다.
 *	 연속적인 데이터를 처리하고 변환할 수 있다.
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");
		
//		printBasic(list);
		
//		printWithFP(list);
		
//		printBasicWithFiltering(list);
		
		printWithFPWithfiltering(list);
	}
	
	// 기존 확장for문 이용하여 List 전체출력
	private static void printBasic(List<String> list) {
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	// stream forEach 람다식
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}
	
	
	// 기존 확장for문 필터(if문) 이용
	private static void printBasicWithFiltering(List<String> list) {
		for(String str : list) {
			if(str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}
	
	// stream filter forEach 람다식
	private static void printWithFPWithfiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")) // 스트림의 필터가 list의 항목중에 endsWith로 지정된 "at"를 filtering(남겨줌) 해줌.
			.forEach(element -> System.out.println("element - " + element)); // 거른 후 forEach로 거른 element만 출력되게 함.
	}
	
}
