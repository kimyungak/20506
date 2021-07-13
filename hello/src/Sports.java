
public class Sports {
		String name;
		int player;

		public Sports() {}
		public Sports(String name, int player){
			this.player = player;
			this.name = name;
		}

		public int getPlayer(){
			return player;
		}

		public String getName(){
			return name;
		}

		public void rule(){
		System.out.println(" 경기 규칙은 해당 클래스에서 작성한다.");
		}
	}

