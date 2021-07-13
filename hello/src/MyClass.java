//부모 클래스
class Father {
	String name;
	
	Father(String name){
		this.name = name;
		System.out.println("Father 생성자" + this.name);
	}
}

//자식 클래스
public class MyClass extends Father {
	
	MyClass(String name){
		super(name); //상위 클래스 생성자를 호출
		System.out.println("MyClass 생성자" + name);
	}
	public static void main(String[] args) {
		MyClass a = new MyClass("홍길동");
	}
}
