package section11.access1;
public class SchoolBus extends Bus{

	public SchoolBus() { //생성자
		wheel = 4;
		color = "Yellow";
	}
		
	public void drive() {
		System.out.println("학생을 태우고 운전을 합니다.");
			
	}
	
	public void stopPannel() {
		System.out.println("학생 하차시 정지판넬 작동!");
	}
	
	
}
