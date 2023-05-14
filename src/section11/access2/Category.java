package section11.access2;

public class Category {	
	public String categoryCd;
	public String categoryName;
	public double discountRate;

	
	public void getInfo(){
		System.out.println("카테고리: " + categoryName);
	}
	
	public void getdiscountRate() {
		int iDiscount =  (int)(discountRate*100);
		System.out.println( iDiscount + "% 할일 행사중 입니다.");
	}
	
}
