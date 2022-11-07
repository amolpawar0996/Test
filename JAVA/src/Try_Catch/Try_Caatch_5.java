package Try_Catch;

// Catck block within a catch block, block are not allowed.
// They shows syntsx error.
// try block within a try block are not allowed thet shows syntax error.
// 


public class Try_Caatch_5 {
	
	public static void main(String[] args) {
		int a=47;
		int b= 0;
		int c=0;
		int d[] = {34,54, 76,24,53};
		System.out.println("Main started");
		
		try {
			System.out.println("try");
			
//			try {
//				System.out.println("try2");
//			}
			
			//c=a/b; //risky code
			System.out.println(d[1]);
			System.out.println(d[10]); //risky code

			System.out.println("risk");
		}
		catch(ArithmeticException a1){
			
			System.out.println("catch");
			
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("catch code for alternative");
//			}
			
		}
		
		
		System.out.println("normal flow");
	}
	

}
