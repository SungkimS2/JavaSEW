package section12.access1;

//추상클래서 클래스 + abstract
// 추상클래스는 반드시 추상메소드를 수반한다.

public abstract class Human {
	private String name;
	private int age;
	
	public void say() {
		System.out.println("말을 해요!");
	}
	
	//구현되지 않은 추상메소드
	public abstract void useFire();
	/*
	 * 
	 * pricate 변수 접근할 수 있는 getter / setter 메소드
	 * 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
