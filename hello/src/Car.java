
public class Car {
	//생성자
	Car(){
		System.out.println("Car 생성자");
	}
	
	String carname;
	String color = "검정색" ;
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + "현재속도:" + velocity);
	}
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + "현재속도:" + velocity);
	}
	void print() {
		System.out.println(carname + color);
	}
}
