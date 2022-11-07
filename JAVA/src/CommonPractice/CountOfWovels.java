package CommonPractice;

public class CountOfWovels {
	public static void main(String[] args) {
		String str = "Welcome";
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.print(count);
	}
}
