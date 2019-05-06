package solution.easy;

import java.util.Scanner;

/**@author Yudi
 * @since 05/05/2019
 * */
public class JavaStringTokens {

	public static void main(String[] args) {
	
		  Scanner scan = new Scanner(System.in);
 	      String s = scan.nextLine();
	      String [] tokens = s.trim().split("[\\s!,?._'@ ]+");
	
	      System.out.println(tokens.length == 0 || tokens.length == 1 & tokens[0].isEmpty() ? "0" : tokens.length);
	      
	      for (int i = 0; i < tokens.length; i++) {
	    	  System.out.println(tokens[i]);
		}
	      scan.close();
		
	}
}
