
public class ShoppingMall {
	String code;
	static int total=0;
	
	void addtotal(int quantity) {
		total += quantity;
		System.out.println(quantity + "�� �԰�. �ܿ� ����:" + total + "��");
	}
	void subtotal(int quantity) {
		total -= quantity;
		System.out.println(quantity + "�� �԰�. �ܿ� ����:" + total + "��");
	}
}