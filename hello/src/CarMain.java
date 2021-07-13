
public class CarMain {

	public static void main(String[] args) {
		//소나타
		Car sonata = new Car();
		sonata.carname = "소나타";
		sonata.velocity = 0;
		
		//속도 올리기 2번
		sonata.speedUp();
		sonata.speedUp();
		//속도 내리기 1번
		sonata.speedDown();
		sonata.speedDown();
		
		//
		Truck t1 = new Truck();
		t1.carname = "포터";
		t1.speedUp();
		t1.speedDown();
		
		sonata.print();
		t1.color = "파랑색";
		t1.print();
		t1.ton = 3;
		t1.print();
		
		//
		Taxi taxi = new Taxi();
		taxi.carname = "카카오 택시";
		taxi.payUp();
		taxi.payUp();
		taxi.payUp();
		
	}

}
