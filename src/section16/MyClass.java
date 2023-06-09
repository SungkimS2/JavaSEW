package section16;

public class MyClass<T> { //변수의 타입을 정해 놓은 것은 아니나 먼저 getter and setter 만들기(알트+시프트+s) 다음 date 체크박스 체크 후 생성
	private T data;		  //제네릭의 변수타입에 따라 MyClass의 T가 모두 제네릭 변수타입으로 변함

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
