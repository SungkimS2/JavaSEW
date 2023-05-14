package section11.access1;

public class Bus extends Car{
		
	public Bus() {  // 생성자
		wheel = 4;
		color = "Green";
	}
	
	public void drive() {
		System.out.println("승객을 태우고 운전합니다.");
		
	}
	public void btBell() {
		System.out.println("벨을 누릅니다.");
	}
	
}
