package Try_Catch;

public class Try_Caatch_7 {
	
	public static void main(String[] args) {
		int a=47;
		int b= 0;
		int c=0;
		int d[] = {34,54, 76,24,53};
		System.out.println("Main started");
		
		try {
			System.out.println("try");
			try {
				c=a/b;
			}
			
			catch(ArithmeticException a1) {
				System.out.println("catch code for alternative");
			}
			
			//c=a/b; //risky code
			System.out.println(d[1]);
			System.out.println(d[10]); //risky code

			System.out.println("risk");
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("catch");
			
		}
		
		
		System.out.println("normal flow");
	}

}
