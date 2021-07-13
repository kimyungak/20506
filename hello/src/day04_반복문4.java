import java.util.Scanner;

public class day04_¹Ýº¹¹®4 {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N:");
		N = sc.nextInt();
		
		int i = 1, sum = 0;
		while(i<=N) {
			if(i%2==1) {
				sum += i;
				System.out.print("+" + i);
			}else {
				sum -= i ;
				System.out.print("-" + i);
			}
			i++;
		}
		System.out.println("=" + sum);
	}
}
