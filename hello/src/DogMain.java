
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.breed = "Çªµé";
		dog1.age = 1;
		dog1.color = "¿À·»Áö";
		
		dog1.barking();
		dog1.sleeping();
		
		Dog dog2 = new Dog("ºÒµ¶",3,"ºí·¢");
		dog2.hungry();
	}

}
