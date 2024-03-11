//multilevel 

class Apple {
	void pro() {
		System.out.println("Ever");
	}
}


class IOS extends Apple {
	void promax() {
		System.out.println("Devices");
	}
}


class Mac extends IOS {
	void ultra() {
		System.out.println("Best");
	}
}




class Brand{
	public static void main(String[] args) {

	Mac m = new Mac();
		m.ultra();
		m.promax();
		m.pro();
		
	}
}
