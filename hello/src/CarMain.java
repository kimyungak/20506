
public class CarMain {

	public static void main(String[] args) {
		//�ҳ�Ÿ
		Car sonata = new Car();
		sonata.carname = "�ҳ�Ÿ";
		sonata.velocity = 0;
		
		//�ӵ� �ø��� 2��
		sonata.speedUp();
		sonata.speedUp();
		//�ӵ� ������ 1��
		sonata.speedDown();
		sonata.speedDown();
		
		//
		Truck t1 = new Truck();
		t1.carname = "����";
		t1.speedUp();
		t1.speedDown();
		
		sonata.print();
		t1.color = "�Ķ���";
		t1.print();
		t1.ton = 3;
		t1.print();
		
		//
		Taxi taxi = new Taxi();
		taxi.carname = "īī�� �ý�";
		taxi.payUp();
		taxi.payUp();
		taxi.payUp();
		
	}

}
