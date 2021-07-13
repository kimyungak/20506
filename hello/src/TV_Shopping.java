
public class TV_Shopping extends ShoppingMall {
	//방송시간 추가
	String time;
	
	//코드, 수량, 방송시간을 기본으로 주고 생성하는 생성자를 만드시오.
	TV_Shopping(String code, int total, String time){
		this.code = code;
		this.total = total;
		this.time = time;
		addtotal(total);
	}
}
