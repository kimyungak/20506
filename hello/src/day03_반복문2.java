
public class day03_반복문2 {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		int even_sum = 0, odd_sum = 0 ;
		for(int i = 1 ; i <= 10 ; i++)
			if(i % 2 == 0) even_sum += i ;
			else odd_sum += i ;
		System.out.println("짝수의 합 : " + even_sum);
		System.out.println("홀수의 합 : " + odd_sum);
	}

}
