package Try_Catch;

public class Try_Caatch_finally {
	
	public static void main(String[] args) {
		int a=47;
		int b= 0;
		int c=0;
		int d[] = {34,54, 76,24,53};
		System.out.println("Main started");
		
		try {
			System.out.println("try");
			c=a/b; //risky code
			System.out.println("risk");
		}
		catch(ArithmeticException a1){
			
			System.out.println("catch");
		}
		
		finally {
			System.out.println("finally");
		}
		
		System.out.println("normal flow");
	}

}
