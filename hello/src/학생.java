
public class 학생 {
	//생성자
	학생() {
		count++;
	}
	
	//멤버 변수(속성)
	static int count = 0;
	final static String school = "ROBOT" ;
	String name ;
	int grade ;
	
	//메소드
	void print () {
		System.out.println(count + "번째학생" + school + name + ":" + grade + "학생");
	}
}
