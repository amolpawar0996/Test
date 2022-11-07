package CommonPractice;

public class SumOfDigitsofNumber {
	public static void main(String[] args) {
		int a =123;
		int res=0;
		int mod;
		while(a>0) {
			mod = a%10;  //123%10=3,12%10=2,1%10=1
			res=res+mod;  //0+3=3,3+2=5,5+1=6
			a=a/10;  //12,1,0
		}
		System.out.println("Sum of digit of number: "+res);
		
	}

}
