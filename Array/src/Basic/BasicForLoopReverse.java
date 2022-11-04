package Basic;

public class BasicForLoopReverse {
	
public static void main(String[] args) {
		
		String a []= new String [5];
		
		a[0]= "Amol";
		a[1]= "Dimpal";
		a[2]= "Minal";
		a[3]= "Sagar";
	    a[4]= "Sumit";
		
		System.out.println("##Print all information of array##");
		
		for(int i=4; i>=0;i--) 
	
		{
			System.out.println(a[i]);
			
		}
	}


}
