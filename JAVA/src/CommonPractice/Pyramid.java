package CommonPractice;

public class Pyramid {

	public static void main(String[] args) {
		int space=4;//3,2,1,0,1,2,3,4
		int star=1;//3,5,7,9,7,5,3,1
		for(int i=1; i<=9; i++) {//1,2,3,4,5
			for(int j=1; j<=space; j++) {//4,3
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) {//3
				System.out.print("*");
			}
			System.out.println();
			
			if (i<=4) {
				space--;
				star=star+2;
			}
			
			else {
				  space++;
				star= star-2;
			}
			
		}
	}

}
