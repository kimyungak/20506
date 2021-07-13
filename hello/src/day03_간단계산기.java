import java.util.Scanner;

public class day03_간단계산기 {
	public static void main(String[] args) {
		int a , b;
		String op;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자:");
		a = sc.nextInt();
		
		if(a==0) {
			System.out.println("프로그램 종료"); break;
		}
		System.out.print("숫자:"); b = sc.nextInt();
		
		System.out.print("연산자:"); op = sc.next();
		
		if(op.equals("+"))
			System.out.println(a + op + b + "=" + (a+b));
		else if(op.equals("-"))
			System.out.println(a + op + b + "=" + (a-b));
		else if(op.equals("*"))
			System.out.println(a + op + b + "=" + (a*b));
		else if(op.equals("/"))
			System.out.println(a + op + b + "=" + (a/b));
		
		
	}
}
