import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		book b1 = new book("JAVA ������", 10);
		b1.printbookcount();
		
		book b2 = new book("PYTHON ����", 20);
		b2.printbookcount();
		
		book b3 = new book("C��� ����", 100);
		b3.printbookcount();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���Ͻô� �۾��� �������ּ���[1:���� 2:�ݳ�]");
			int job = sc.nextInt();
			if(job==1) {
				System.out.print("���ϴ� ����:");
				int count = sc.nextInt();
				b3.rentalbook(count);
			}else {
				System.out.print("�ݳ��� ����:");
				int count = sc.nextInt();
				b3.returnbook(count);
			}	
		}
		
		//b3.rentalbook(10);
		//b3.rentalbook(20);

	}

}
