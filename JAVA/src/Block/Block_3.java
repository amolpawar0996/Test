package Block;

public class Block_3 {
	
	Block_3(){
		System.out.println("constructor is running");
	}
	{
		System.out.println("Non static block running");
	}

	public static void main(String[] args) {
		System.out.println("main method is running");
		Block_3 c = new Block_3();

	}
	
	
	static {
		System.out.println("static block running");
	}

}
