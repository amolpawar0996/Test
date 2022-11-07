package CommonPractice;

public class CheckStringIsPalindromeOrNot {
	public static void main(String[] args) {
		String a ="amol";
        String rev = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			rev = rev + a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("String is Palindrome; ");
			}
		else {
			System.out.println("String is not Palindrome; ");
			}
		}
		
	}



