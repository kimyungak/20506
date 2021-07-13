
public class day04_반복문3 {

	public static void main(String[] args) {
		System.out.println("문제1===============");
		for(int i = 1; i<=3 ; i++) {
			for(int j=1; j<=5 ; j++)
				System.out.print(j);
		System.out.println();
		}
		System.out.println("문제2===============");
		for(int i = 1; i<=3 ; i++) {
			for(int j=1; j<=4 ; j++)
				System.out.print(i);
			System.out.println();
		}
		System.out.println("문제3===============");
		for(int i = 1; i<=4 ; i++) {
			for(int j=1; j<=i ; j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("문제4===============");
		for(int i = 4; i>=1 ; i--) {
			for(int j=i; j>=1 ; j--)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("문제5===============");
		for(int i = 3; i>=1 ; i--) {
			for(int j=i+1 ; j>=1 ; j--) 
				System.out.print("*");
			System.out.println();
		}
		
	}
}
