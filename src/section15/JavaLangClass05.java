package section15;

public class JavaLangClass05 {
	public static void main(String[] args) {
		// 정수형 타입선언
		// 생성자를 통한 선언은 JDK 1.9버전 부터 사용하지 않는 것을 권장 
		Integer num1 = new Integer(10);  // 취소선 -> 추천하지 않음. new로 생성할 경우 새로운 인티저 메모리가 생성되어 다른 객체들도 접근할 수 있음.
		Integer num2 = Integer.valueOf(10);
		Integer num3 = 10;
		
		// 실수형 타입 선언
		Double doubleNum1 = Double.valueOf(30.11);
		
		// 문자형 타입 선언
		Character ch = Character.valueOf('A');
		
		
		
	}
}
