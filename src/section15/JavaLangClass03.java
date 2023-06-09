package section15;

public class JavaLangClass03 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
	
		if(str1.equals(str3)) {
			System.out.println("str1 과 str3는 같다.");	// 1
		} else {
			System.out.println("str1 과 str3는 다르다.");	// 2
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println("======================================================");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		
	
	}
}






