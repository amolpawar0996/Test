package CommonPractice;

public class CountofDigit {
	public static void main(String[] args) {
		String a="Amol@0996";
		int count = 0;
		System.out.println(a.length());
		
		for(int i=0; i<=a.length()-1;i++) {
			char ch = a.charAt(i);
			if(ch>='0' && ch<='9') {
				count++;
			}
		}
		System.out.println(count);
		
		
		int b = 1998;
		int digit=0;
		while(b>0) {
			b=b%10;
			digit++;
		}
		System.out.println(digit);
		}
}