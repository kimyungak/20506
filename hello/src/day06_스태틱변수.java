
public class day06_스태틱변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		학생 a = new 학생();
		a.grade = 1 ; a.name = "홍길동";
		a.print();
		
		학생 b = new 학생();
		b.grade = 2 ; b.name = "김청";
		b.print();
		
		학생 c = new 학생();
		c.grade = 3 ; c.name = "이현수";
		c.print();
	}

}
