
public class leader extends student {
	
	boolean leader = false;
	
	leader(String name, String hakbun, boolean leader){
		this.name = name;
		this.hakbun = hakbun;
		this.leader = leader;
	}
	
	boolean isleader() {
		if(this.leader == true) {
			System.out.println(name + "은(는) 리더입니다.");
		}
		else {
			System.out.println(name + "은(는) 리더가 아닙니다.");
		}
		
		return this.leader;
	}
}
