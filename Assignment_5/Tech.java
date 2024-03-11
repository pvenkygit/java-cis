//multiple


class Facebook{
	void social_media() {
		System.out.println("Best ");
	}
	
}

class Instagram{
	void social_media() {
		System.out.println("media");
	}
	
}

class Meta extends Facebook, Instagramn{
	void latest() {
		System.out.println("ever");
	}
}


class Tech {
	public static void main(String[] args) {
		Meta m = new Meta();
		m.latest();
		m.social_media();
		
	}
}