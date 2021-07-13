
public class day03_¹Ýº¹¹®_foreach {

	public static void main(String[] args) {
		int a[] = new int[] {1,2,3,4,5};
		for (int i : a)
			System.out.println(i);
		float b[] = new float[] {1.1f, 2.1f, 3.1f};
		float sum=0;
		for(float val : b) {
			System.out.println(val);
			sum = sum + val;
		}
		System.out.println("SUM:" + sum);
		
		//------------------------------------------------
		
		String[]c = {"Seoul", "ROBOT", "HIGH", "SCHOOL"};
		for(String str : c) {
			str = "TTTT";
			System.out.println(str);
		}
		for(String str : c)
			System.out.println(str);

	}

}
