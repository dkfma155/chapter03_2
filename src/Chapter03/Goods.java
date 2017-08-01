package Chapter03;

public class Goods {

	private String name;
	private int price;
	private int countStock;
	private int countSold;
	   
	
	public void setName( String name ) {
		this.name= name;		//하나(this)는 객체 자신의 변수, 파라미터의 변수
		}
	public String getName() {
		return name;
	}	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}
	
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountStock() {
		return countStock;
	}
	
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public int getCountSold() {
		return countSold;
	}
	
	void showInfo() {
	
		//private은 내부에서만 접근이 가능하다.
		System.out.println(name);
	   }
}
