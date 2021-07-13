
public class 변수 {

	public static void main(String[] args) {
		System.out.println("변수의 형변환");
		
		int a = 100;
		byte b = 1;
		
		a = b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		a = 300;
		b = (byte)a ;
		System.out.println("b:" + b);
		

	}

}
