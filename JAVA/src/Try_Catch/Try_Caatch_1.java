package Try_Catch;

public class Try_Caatch_1 {

	public static void main(String[] args) {
		int a=47;
		int b= 0;
		int c=0;
		System.out.println("Main started");
		
		try {
			
			c=a/b; //risky code
		}
		catch(ArithmeticException a1){
			
			System.out.println("catch");
			
		}
	}

}
