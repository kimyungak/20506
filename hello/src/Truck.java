
public class Truck extends Car {	
	//������
	Truck(){
		System.out.println("Truck ������");
	}
	
	int ton ;
	void print() {
		System.out.println(carname + color + ":" + ton + "��");
	}
	
	public static void main(String[] args) {
		Truck ���� = new Truck();
	}
}
