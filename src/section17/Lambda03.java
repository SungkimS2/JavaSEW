package section17;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
	
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(44);
		numbers.add(55);
		numbers.add(77);
		
//		int result = normalSum(numbers);
//		System.out.println("합계: " + result);
		
		int result = fpSum(numbers);
		System.out.println("합계: " + result);

	}
	
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	// stream reduce 람다식 - 스트림요소들을 결합하여 단일결과 생성 
	// reduce는 list가 갖고 있는 numbers 리스트들을 병합하는 목적이다.
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (sum, number) -> sum + number); 		/* reduce 는 여기서 numbers에 있는 값들을 "sum + number"를
				 스트림의 넘버값을 reduce(0, 값으로 초기화하여 sum에 number값에 + 해줌.	 해서 하나의 값으로 return 해줌 */
																		  
	}
	
}




