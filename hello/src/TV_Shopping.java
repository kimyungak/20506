
public class TV_Shopping extends ShoppingMall {
	//��۽ð� �߰�
	String time;
	
	//�ڵ�, ����, ��۽ð��� �⺻���� �ְ� �����ϴ� �����ڸ� ����ÿ�.
	TV_Shopping(String code, int total, String time){
		this.code = code;
		this.total = total;
		this.time = time;
		addtotal(total);
	}
}
