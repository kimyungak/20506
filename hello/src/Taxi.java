
public class Taxi extends Car {
	int pay = 3000;
	
	void payUp() {
		pay += 100;
		System.out.println("������:"+pay);
	}
}
