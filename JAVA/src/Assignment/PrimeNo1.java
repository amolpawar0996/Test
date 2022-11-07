
// To check the given no. is Prime or not

package Assignment;

public class PrimeNo1 {
	public static void main(String[] args) {
		
		int num= 18;
		int j=0;
		
		for(int i=2; i<=num-1; i++) {
			if(num%i==0) {
				j=j+1;
			}
		}
		if(j==0) {
			System.out.println("Prime no. is="+num);
		}	
		else {
			System.out.println("Not a prime no.="+num);
		}
	}

}
