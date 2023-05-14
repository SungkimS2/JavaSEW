package section01;

public class Hello {
	/* 여러줄 주석  
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello,JAVA!!!");
	
		printNum(422);
	}
	
	/** JavaDoc 주석
	 * auth : 김혜성
	 * 생성일 : 2023.04.22
	 * 
	 * printNum - 입력받은 정수 출력
	 * 
	 * @param num
	 */
	public static void printNum(int num) {
		System.out.println("num:" + num);
	}
	
	
}

