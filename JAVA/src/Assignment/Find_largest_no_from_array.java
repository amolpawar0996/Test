package Assignment;

public class Find_largest_no_from_array {
	 
    public static void main(String[] args){
    	
	    int arr[] = {10, 324, 45, 90, 9808};
	    
	    int max = arr[0];
	    
	    for (int i = 1; i < arr.length; i++) { 
	    	
	    	if (arr[i] > max) { 
	        max = arr[i];
	        }
	    }
	    System.out.println("Largest in given array is " +max);
	            
	}
}	    
	     
	   
	    
	        
	        
	     

	
