
public class BaseBall extends Sports{
	BaseBall(String name, int player){
			super(name, player);
	}
	//오버라이딩
	public void rule(){
		System.out.println("야구는 공격과 수비로 이루어지고..");
		}
	
	public static void main(String[] args) {
		BaseBall bb = new BaseBall("야구",9);
		System.out.println("경기종목:" + bb.getName());
		System.out.println("선수인원:" + bb.getPlayer());
		System.out.print("경기규칙:");
		bb.rule();
	}
	
}
