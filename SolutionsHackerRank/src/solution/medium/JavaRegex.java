package solution.medium;

import java.util.Scanner;

/**@author Yudi
 * @since 05/05/2019
 * */
public class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
	}
	

}
 class MyRegex{
	
	String pattern = "^(?:(?:2[0-5][0-5]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
