package Basic;

import java.util.Arrays;

public class AscendingDescending {
	public static void main(String[] args) {

		int a[] = { 50, 30, 60, 10, 90, 40 };

		System.out.println("##All Data of array##");

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

		Arrays.sort(a);// 10,30,40,50,60,90
		System.out.println("##All Data of array in Ascending order##");

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

		System.out.println("##All Data of array in Descending order##");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

}
