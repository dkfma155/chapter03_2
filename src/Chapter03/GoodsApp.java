package Chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		//private은 내부에서만 접근이 가능하다.
		//goods.name = "nikon";
		goods.setName("nikon");
		//goods.price = 200000;
		goods.setPrice(20000);
		//goods.countSold = 10;
		goods.setCountSold(10);
		//goods.countStock= 100;
		goods.setCountStock(100);
		
		System.out.println(
				//private은 내부에서만 접근이 가능하다.
				//"name:"+goods.name+
				//",price"+goods.price+
				//",countSold"+goods.countSold+
				//",countStock"+goods.countStock
				"name"+goods.getName()+
				",price"+goods.getPrice()+
				",CountSold"+goods.getCountSold()+
				",CountStock"+goods.getCountStock()
				);
		
		//default 접근자 필드는 다른 패키지에서는 접근 불가
		//Goods2 goods2 = new Goods2();
		//goods2.name = "coke";
	}
	
}

