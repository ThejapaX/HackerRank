package solution.easy;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**@author Yudi
 * @since 05/05/2019**/
public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			
			try {
			Pattern.compile(pattern);

			System.out.println("Valid");
			}catch(PatternSyntaxException p) {
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}

}
