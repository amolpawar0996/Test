
/*Factorial of a positive integer (number) is the sum of multiplication 
  of all the integers smaller than that positive integer.*/

/* FORMULA:- n! = n * (n-1)!*/ 

/* For example, factorial of 5 is 5 * 4 * 3 * 2 * 1 which equals to 120.*/

package Assignment;

public class Factorial {
	public static void main(String[] args) {
		
		int a= 6;
		
		int factorial = 1;
		
		for(int i=a; i>=1; i--) {//6*5*4*3*2*1
			
			factorial = factorial * i;
		}
		System.out.println(factorial);
		
	}

}
