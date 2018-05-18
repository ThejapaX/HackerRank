import java.util.Scanner;

public class RansomNote {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] ransom = new String[n];

		String[] ransomItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String ransomItem = ransomItems[i];
			ransom[i] = ransomItem;
		}

		boolean valid = true;
		test: for (int l = 0; l < n; l++) {
			for (int i = 0; i < m; i++) {
				if (!ransom[l].equals(magazine[i])) {
					valid = false;
				} else {
					magazine[i] = "";
					valid = true;
					continue test;
				}
			}
			valid = false;
			break;
		}
		if (valid) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
	}
}