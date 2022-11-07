package Block;

public class Block_2 {

	static {
		System.out.println("static block running");
	}
	
	{
		System.out.println("Non static block running");
	}

	public static void main(String[] args) {
		System.out.println("main method is running");
		Block_2 b = new Block_2();

	}


}
