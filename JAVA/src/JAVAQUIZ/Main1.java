package JAVAQUIZ;
/*Explanation:- 
 * Print statement is outside for loop. Loop runs from 
 * i=1 till i=6 does not satisfy the given condition in for loop it comes out
  of the loop and prints 6 is an output. 
 */
public class Main1 {
	public static void main(String[] args) {
		int i;
		for(i=1;i<6;i++) {   
			if(i>3) continue;
		}
		System.out.println(i);
	}
}


//   OUTPUT:-
//            A)5
//            B)4
//            C)3
//            D)6
