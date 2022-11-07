package CommonPractice;

public class RightTriangle {
	public static void main(String[] args) {
		int star=1;
		for (int i= 1; i<=9;i++) {
			for(int j=1;j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=4) {
				star++;
			}
			else {
				star--;
			}
		}
	}

}
