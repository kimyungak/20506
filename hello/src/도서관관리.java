import java.util.Scanner;

public class 도서관관리 {

	public static void main(String[] args) {
		book b1 = new book("JAVA 교과서", 10);
		b1.printbookcount();
		
		book b2 = new book("PYTHON 기초", 20);
		b2.printbookcount();
		
		book b3 = new book("C언어 기초", 100);
		b3.printbookcount();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하시는 작업을 선택해주세요[1:대출 2:반납]");
			int job = sc.nextInt();
			if(job==1) {
				System.out.print("원하는 수량:");
				int count = sc.nextInt();
				b3.rentalbook(count);
			}else {
				System.out.print("반납할 수량:");
				int count = sc.nextInt();
				b3.returnbook(count);
			}	
		}
		
		//b3.rentalbook(10);
		//b3.rentalbook(20);

	}

}
