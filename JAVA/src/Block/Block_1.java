package Block;

public class Block_1 {
	
	static {
		System.out.println("static block running");
	}
	
	{
		System.out.println("Non static block running");
	}
	
	public static void main(String[] args) {
		System.out.println("main method is running");
	}

}
