package CommonPractice;

public class Palindrome {
	public static void main(String[] args) {
		int a=16161;
		int res=0;
		int temp=a;
		int b;
		while(a>0) {
			b= a%10;  //1,6,1
			res=((res*10)+b);  //1,16,161
			a=a/10;  //1616,161,16
		}
		if(temp==res) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Number is Not Palindrome");
		}
		
	}

}
