
/*Fibonacci sequence, in which each number is the sum of the two preceding 
  ones.*/
/*The sequence commonly starts from 0 and 1*/

/*0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...*/

package Assignment;

public class FibancciSeries {
	
	public static void main(String[] args) {
		
		int a=0,b=1,c,i,count=10;  
		 System.out.print(a+" "+b);//printing 0 and 1  
		  
		 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed  
		 {  
		  c=a+b;  
		  System.out.print(" "+c);  
		  a=b;  //swapping
		  b=c;  //swapping
	}
  }
}

