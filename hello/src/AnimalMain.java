import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String kind;
		String name;
		int age;
		String toy;
		
		System.out.print("��������: ");
		kind = sc.next();
		System.out.print("�����̸�: ");
		name = sc.next();
		System.out.print("����: ");
		age = sc.nextInt();
		
		Animal animal1 = new Animal(kind, name, age);
		animal1.printcount();
        animal1.print(name);
        animal1.print(name, age);
        
        System.out.print("���� ���� : ");
        kind = sc.next();
        System.out.print("���� �̸� : ");
        name = sc.next();
        System.out.print("���� ���� : ");
        age = sc.nextInt();
        System.out.print("�峭�� : ");
        toy = sc.next();
        
        Animal animal2 = new Animal(kind, name, age, toy);
        animal2.printcount();
	}
}