
// PRIME NO. from 1 to 100
// The no. which are divisible by itself and one only.
// 0,1,2,3,5,7,11,13,17,19....


package Assignment;

public class PrimeNo {
	
	public static void main(String[] args) {
		int i;   //declare variable
		int j;   //declare variable
		
		for(i=1; i<=100; i++) //for loop for 1 to 100
		{
			
			for( j=2; j<=i-1; j++) //for loop for 2 to i-1 value
			{
				if( i%j == 0 ) // If false then loop break and go to next for loop
				{
					break;
				}
				 if(j==(i-1))// loop is always true and print Prime no.
				{
					System.out.println(i);
				}
			}
		}
	}

}
