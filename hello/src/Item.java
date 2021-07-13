
public class Item {
	// ��� ����
	private int no; // �� Ŭ���������� ���� ���� : private
	private String name;
	private int price;
	private int count;
	private static final String COMPANY = "��� ȸ��"; // �� Ŭ���������� ���� ���� : private, ���뺯�� : static, �ʱⰪ�� �ٲ��� ���� : final
	private static int itemCount = 0; // �� Ŭ���������� ���� ���� : private, ���뺯�� : static

	// �⺻ ������
	Item() {
		itemCount++;
	}

	// ������1
	Item(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}

	// ������2
	Item(int no, String name, int price, int count) {
		this(no, name);
		this.price = price;
		this.count = count;
	}

	// get()����, set()����
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

	//inStore()�޼ҵ�
	public void inStore(int a) {
		count += a;
		System.out.println("�԰� :" + name + "," + a + "��");
	}
	//outStore()�޼ҵ�
	public void outStore(int b) {
		if (count >= b) {
			count -= b;
			System.out.println(count + "������ : " + name + "���� ��� : " + b + "��");
		} else {
			System.out.println("�Ͱ���� : " + name + " ���� ��� : " + this.count + "��");
		}
	}
	//toPrint()�޼ҵ�
	public void toPrint() {
		System.out.println("��ǰ�ڵ�:" + no + " ��ǰ��:" + name + " ����:" + price + " ���:" + count);
	}
}