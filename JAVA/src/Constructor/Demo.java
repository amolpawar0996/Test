/*User defined constructor:- The constructor provided/declared by 
 user/programmer at a time of compilation is known as a user define
 constructor.*/

package Constructor;

public class Demo{
		public static void Sagar(){//Static Method
			System.out.println("Nimase");
		}
		
		public void Minal() { //Non Static Method
			System.out.println("Minal");
		}
	   static int i= 10;  //static variable
		int j= 20;//Non static variable
		Demo(int i, int j){
			int a=11;
			int b=12;
		}
	  
	public Demo() {
	
		}

	public static void main(String[] args) {
		Demo.Sagar();
		System.out.println(i);
		Demo t= new Demo(); //Object Creation
		
		t.Minal();
		
		System.out.println(t.i);
		System.out.println(t.j);
	}
	

}
