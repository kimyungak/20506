
public class Fish extends Animal{
	void swim() {
		System.out.println(name + "�� ���Ĩ�ϴ�.");
	}

	public static void main(String[] args) {
		Fish myfish = new Fish();
		myfish.name = "�ؾ�ŷ";
		myfish.setage(3);
		
		myfish.swim();
	}

}
