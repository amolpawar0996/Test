/*"Constructor in a JAVA is a special member of class which is used 
 to initialized the variables and initialized the object.*/

/*DEFAULT CONSTRUCTOR :- The constructor provided by compiler at a 
  time of compilation is called as a Default constructor.*/


package Constructor;

public class Default {
	
	int a;
	String b;
	
	public static void main(String[] args) {
		
		Default d = new Default();
		System.out.println(d.a);
		System.out.println(d.b);
	}

}
