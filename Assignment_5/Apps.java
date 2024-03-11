//hierarchical


class Games{
	void apps_games() {
		System.out.println("To Play");
	}
}

class Pubg extends Games{
	void play() {
		System.out.println("Pubg-Best game");
	}
}

class COD extends Games{
	void dont_play() {
		System.out.println("COD-Bad game");
	}
}




public class Apps{
	
	public static void main(String[] args) {
		
		Pubg p = new Pubg();
		p.play();
		p.apps_games();
		
		COD c = new COD();
		c.dont_play();
		c.apps_games();

	}

}





