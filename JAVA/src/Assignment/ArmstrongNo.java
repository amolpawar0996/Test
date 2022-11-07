
/*An Armstrong number is one whose sum of digits raised to the 
  power three equals the number itself. 
  153,371, for example, is an Armstrong number because 
  3**3 + 7**3 + 1**3 = 371.[(3*3*3)+(7*7*7)+(1*1*1)=371]*/
package Assignment;

public class ArmstrongNo {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int rem;
		int result=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			result = result +(rem*rem*rem);
		}
		if(temp==result) {
			System.out.println(temp+" is Armstrong no.");
		}
		else {
			System.out.println(temp+" is not Armstrong no.");
		}
	}
}

