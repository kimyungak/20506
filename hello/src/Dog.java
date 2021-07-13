
public class Dog {
	//생성자
	Dog(){}
	
	Dog(String breed, int age, String color) {
		this.breed = breed ;
		this.age = age;
		this.color = color;
	}
	
	//멤버변수
	String breed;
	int age;
	String color;
	
	//메소드
	void barking() {
		System.out.println(breed + "is barking.");
	}
	void hungry() {
		System.out.println(breed + "is hungry.");
	}
	void sleeping() {
		System.out.println(breed + "is sleeping");
	}
	
	String toPrint(String breed, int age, String color) {
		
		String str = "(" + breed + ":" + age + ":" + color ")" ;
		return str;
	}
	
}
