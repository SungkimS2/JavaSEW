package section11.access2;

public class TopClothesCategory extends ClothesCategory{

	public String TopClothesKind;
	
	public TopClothesCategory(String TopClothesKind) {
		super.ClothesKind = "상의";
		this.TopClothesKind = TopClothesKind;
	
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("의류 종류: " + ClothesKind);
		System.out.println("상의 종류: " + TopClothesKind);
	
	}
	
	public void armband() {
		System.out.println("Armband를 사은품으로 드려요.");
	}
	
}
