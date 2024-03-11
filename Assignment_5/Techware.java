//hybrid
//Multilevel and multiple



class App {
	void A_pro() {
		System.out.println("Ever");
	}
}


class Ios extends App {
	void A_promax() {
		System.out.println("Devices");
	}
}


class MAC extends Ios {
	void A_ultra() {
		System.out.println("Best");
	}
}

class FB{
	void social_media() {
		System.out.println("Best ");
	}
	
}

class Insta{
	void social_media() {
		System.out.println("media");
	}
	
}

class META extends FB,Insta{
	void latest() {
		System.out.println("ever");
	}
}


class BTF {
	public static void main(String[] args) {
		MAC m = new MAC();
		m.A_ultra();
		m.A_promax();
		m.A_pro();
		META m = new META();
		m.latest();
		m.social_media();
		
	}
}