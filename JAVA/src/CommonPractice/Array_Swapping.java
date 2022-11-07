package CommonPractice;

public class Array_Swapping {
	public static void main(String[] args) {

		int a[] = { 23, 454, 433, 543, 6, 433 };

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {
					int swapp = a[i];
					a[i] = a[j];
					a[j] = swapp;
				}
			}

		}
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
