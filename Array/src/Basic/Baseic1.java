/*Array is a Data Structure used to store multiple data of 
  same data type.(Homogeneous in nature)*/

/*Array declaration need to be done with capasity*/
/*Size is fixed (Not growable in nature)*/
/*Once size is fixed can't change latter or cant be increased.*/
// Array Index always start from Zero.

//Syntax: [Declaration and Initialization of array is at same time]

//Syntax:- Data type Ref.variable[] = new Data type [Size].

package Basic;

public class Baseic1 {
	public static void main(String[] args) {
		
		String a []= new String [5];
		
		a[0]= "Amol";
		a[1]= "Dimpal";
		a[2]= "Minal";
		a[3]= "Sagar";
	    a[4]= "Sumit";
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}

}
