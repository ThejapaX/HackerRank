package solution.easy;

import java.util.*;

public class Min_Max_Sum {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}

	static void miniMaxSum(int[] num) {
		int x = 4;
		long sum = 0;
		long max = 0;
		long min = 0;
		while (x > -1) {
			c: for (int i = 0; i < num.length; i++) {
				if (i == x) {
					continue;
				} else {
					sum += num[i];
				}
			}
			x--;
			if (sum > max) {
				max = sum;
			} else if (x == 3 || sum < min) {
				min = sum;
			}
			sum = 0;
		}
		System.out.print(min + " ");
		System.out.print(max);
	}
}
