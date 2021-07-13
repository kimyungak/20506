
public class Fish extends Animal{
	void swim() {
		System.out.println(name + "가 헤엄칩니다.");
	}

	public static void main(String[] args) {
		Fish myfish = new Fish();
		myfish.name = "붕어킹";
		myfish.setage(3);
		
		myfish.swim();
	}

}
