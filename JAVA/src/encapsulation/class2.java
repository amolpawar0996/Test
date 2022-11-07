/*It is one of the OOPs principle where in which data members or variables 
 are Wrapped with the method functions working as a single unit.*/

/*Hiding the data members or variables of a class from another class
 using private access specifier is called as ENCAPSULATION*/

package encapsulation;

public class class2 {
	
	public static void main(String[] args) {
		
		class1 j =new class1();
		
		j.amol();
		
		class1 k = new class1(10, 20);
		
		k.amol();
	}

}
