
public class ShoppingMall {
	String code;
	static int total=0;
	
	void addtotal(int quantity) {
		total += quantity;
		System.out.println(quantity + "개 입고. 잔여 수량:" + total + "개");
	}
	void subtotal(int quantity) {
		total -= quantity;
		System.out.println(quantity + "개 입고. 잔여 수량:" + total + "개");
	}
}