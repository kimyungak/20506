
public class Item {
	// 멤버 변수
	private int no; // 내 클래스에서만 접근 가능 : private
	private String name;
	private int price;
	private int count;
	private static final String COMPANY = "놀러와 회사"; // 내 클래스에서만 접근 가능 : private, 공용변수 : static, 초기값이 바뀌지 않음 : final
	private static int itemCount = 0; // 내 클래스에서만 접근 가능 : private, 공용변수 : static

	// 기본 생성자
	Item() {
		itemCount++;
	}

	// 생성자1
	Item(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}

	// 생성자2
	Item(int no, String name, int price, int count) {
		this(no, name);
		this.price = price;
		this.count = count;
	}

	// get()변수, set()변수
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int getItemCount() {
		return itemCount;
	}

	public static void setItemCount(int itemCount) {
		Item.itemCount = itemCount;
	}

	public static String getCompany() {
		return COMPANY;
	}

	//inStore()메소드
	public void inStore(int a) {
		count += a;
		System.out.println("입고 :" + name + "," + a + "개");
	}
	//outStore()메소드
	public void outStore(int b) {
		if (count >= b) {
			count -= b;
			System.out.println(count + "출고실패 : " + name + "현재 재고 : " + b + "개");
		} else {
			System.out.println("촐고실패 : " + name + " 현재 재고 : " + this.count + "개");
		}
	}
	//toPrint()메소드
	public void toPrint() {
		System.out.println("상품코드:" + no + " 상품명:" + name + " 가격:" + price + " 재고:" + count);
	}
}