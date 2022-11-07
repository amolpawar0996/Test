package CommonPractice;

public class CountOddandEvenNo {
	public static void main(String[] args) {
		
		int[] a= {10,13,29,50,10,27,44,85,25,91};
		
		System.out.println("Length of String: "+a.length);
		int even=0;
		int odd=0;
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even no.is: "+even);
		System.out.println("Odd no.is: "+odd);
	}

}
