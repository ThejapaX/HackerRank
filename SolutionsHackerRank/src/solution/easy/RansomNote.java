import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

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

		for (int l = 0; l < m; l++) {
			int cont = 0;
			for (int i = 0; i < n; i++) {
				if (ransom[i].equals(magazine[l])) {
					String wordFound = ransom[i];
					String SameWord = wordFound;
					cont++;
					if (SameWord.equals(wordFound) && cont > 1) {
						valid = false;
						break;
					}
				}
			}
			if (cont == 0) {
				valid = false;
				break;
			}
		}

		if (valid) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();

	}

}
