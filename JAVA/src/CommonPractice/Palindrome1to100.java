package CommonPractice;

public class Palindrome1to100 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int rev=0;
			int n=i; //1,10,11,20,33
			while(n>0) {
			rev=(rev*10)+n%10;  //1,01,11,02,22,33
			n=n/10;  //0.1,1,0.1,1,0.1,2,0.2,3,0.3
			}
		    if(rev==i) {
			   System.out.println(i);  //1,11,33
		    }
        }
  }
}