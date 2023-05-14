package section11;
/*
 * instanceof 연산자
 * 객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인
 * 
 * 
 */

import section11.access2.Category;
import section11.access2.PantsClothesCategory;
import section11.access2.TopClothesCategory;

public class Polymorphism04 {
	public static void main(String[] args) { // arg 프로그램을 실행할때 사용자가 임의로 배열을 설정함 run as 에서 선택
		int selectNum = Integer.parseInt(args[0]);	// 정수클래스 불러오는 공식 Integer.parseInt(args[0]);
		Category selectCategory = getCategory(selectNum);
	
		selectCategory.getInfo();
		
		if(selectCategory instanceof TopClothesCategory) { // 상속관계에서만 형변환이 가능하기때문에 해당 연산자를 사용함
			TopClothesCategory tcc = (TopClothesCategory)selectCategory;
			tcc.armband();
		} else { PantsClothesCategory pcc = (PantsClothesCategory)selectCategory;
			pcc.belt();
		}
		
	}
	
	public static Category getCategory(int selectNum) {
		Category category;
		if(selectNum == 1) {
			category = new TopClothesCategory("긴팔");
		}else {
			category = new PantsClothesCategory("청바지");
		}
		return category;
		
	}

	
}
