
public class day04_string {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		
		if(str1==str2)
			System.out.println("�ּҵ���");
		else
			System.out.println("�ּҰ� �ٸ���");
		
		if(str1.equals(str2))
			System.out.println("���� ����");
		else
			System.out.println("���� �ٸ���");
		//----------------------------------
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		if(str3==str4)
			System.out.println("�ּҵ���");
		else
			System.out.println("�ּҰ� �ٸ���");
		
		if(str3.equals(str4))
			System.out.println("���� ����");
		else
			System.out.println("���� �ٸ���");
	}

}
