
//Print Left side triangle star pattern by using for loop(Dynamic)

package StarPattern;

public class LeftSideTriangle {
	public static void main(String[] args) {
		int num=3;
		//int j,k=1;
		for( int i=1;i<=num;i++)
		{
			for(int k=1;k<=num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for( int i=num;i>0;i--)
		{
			for(int k=1;k<=num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


}
}