package section11.access2;

public class PantsClothesCategory extends ClothesCategory{

	public String PantsClothesKind;
	
	public PantsClothesCategory(String pantsClothesKind) {
		
		super.ClothesKind = "하의";
		this.PantsClothesKind = pantsClothesKind;
		super.discountRate = 0.3;
		
	}
	
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("의류 종류: " + ClothesKind);
		System.out.println("상의 종류: " + PantsClothesKind);
	}
	public void belt() {
		System.out.println("벨트를 사은품으로 드려요.");
	}
	
}
