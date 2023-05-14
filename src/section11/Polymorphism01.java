package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

/*
 * 다형성
 *  같은 인터페이스 또는 부모를 공유하는 개체가 여러 유형의 타입을 가질 수 있는것
 * 
 */
public class Polymorphism01 {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.btBell();
		b1.drive();
		
System.out.println("=======================");
		
		Car c1 = new Bus();
		c1.drive();
//		c1.btnBell();
		
System.out.println("=======================");
		
		Bus b2 = new SchoolBus();
		b2.drive();
//		b2.stopPannel(); 컴파일 애러
		
System.out.println("=======================");	
		
		SchoolBus sb1 = (SchoolBus)b2; //강제형변환
		sb1.drive();
		sb1.stopPannel();
	}
}
