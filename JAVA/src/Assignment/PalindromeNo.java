
/* A palindrome number is a number that is same after reverse.
   For example 545, 151, 34543, 343, 171,*/

package Assignment;

public class PalindromeNo {
	public static void main(String[] args) {
		int num = 16161;
		int org_num = num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num+" is Palindrome no.");
		}
		else {
			System.out.println(org_num+" is not Palindrome no.");
		}
	}

}
