package Assignment;

public class prime {
	public static void main(String[] args) {
		int i;   //declare variable
		int count=0;
		
		for(i=1; i<=100; i++) {
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
				count++;
			}
		    
			if(count==2) {
        	System.out.println(i);	
		
			}
		}
		
		
	}
}
}
	
