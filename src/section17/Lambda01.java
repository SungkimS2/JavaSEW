package section17;
/*
 * 	Lambda 표현식
 * 		람다식(Lambda Expression) 이란 함수를 하나의 식(expression)으로 표현한 것을 말한다.
 * 		함수를 람다식으로 표현하면 메소드 이름이 필요 없기 때문에,
 * 		람다식은 익명 함수(Anonymours Fuction)의 한 종류라고 볼 수 있다.
 * 
 * 	기존방식
 * 	반환타입 메소드명(매개변수,...) {
 * 		실행문
 * 	}
 * 
 * 	
 * 	람다식
 * 	(매개변수, ...) -> { 실행문 }
 * 
 * 
 */
public class Lambda01 {
	public static void main(String[] args) {
		// 1. 기존의 익명클래스(일회용성으로 사용하는 코드)
		MyLamdaFuntion lambdaFunction1 = new MyLamdaFuntion() {
			
			@Override
			public int max(int a, int b) {
				return a > b ? a : b; // a가 b보다 크면 a : 는 참이고 : b 는 거짓이다.

			}
		};
		System.out.println(lambdaFunction1.max(3, 5));
		
		// 2. 람다식을 이용한 익명클래스
		MyLamdaFuntion lambdaFunction2 = (int a, int b) -> a > b ? a : b; // '->'화살표 연산자
		System.out.println(lambdaFunction2.max(3, 5));
	}
}

@FunctionalInterface
interface MyLamdaFuntion{
	int max(int a, int b);
}