
public class book {
	
	//������
	book(String name, int count){
		bookName = name ;
		this.count = count ;
	}
	
	//��� ���� - å�̸�, ���
	String bookName ;
	int count ;
	
	//�޼ҵ�
	//���� ����� å�� �̸��� ����� ����ϴ� �޼ҵ�
	void printbookcount() {
		System.out.println(bookName + ":" + count + "��");
	}
	
	//å�� �����ϴ�
	void rentalbook(int count) {
		if( count > this.count ) {
			System.out.println(bookName + "����� �����մϴ�." + "�������:" + this.count);
		}else {
			this.count = this.count  - count ;
			System.out.println(bookName + ":" + count + "�� ����");
			printbookcount();
		}
	}
	//å�� �ݳ��ϴ�
	void returnbook(int count) {
		this.count += count;
		System.out.println(bookName + ":" + count + "�� �ݳ�");
		printbookcount();
	}
}
