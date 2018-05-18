import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote2_0 {



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
        int magazineCount =0;  
        int sameCount = 0;
        int ransomCount = 0;
        boolean valid = true;
            for (int l = 0; l < n; l++) {
		     	for (int i = 0; i < m; i++) {
				    if (ransom[l].equals(magazine[i])) {
                    sameCount++;
                        if(sameCount<2){
                          for(int i2=0;i2<m;i2++){
                            if(magazine[i].equals(magazine[i2])){
                                magazineCount++;
                            }
                          }
                            for(int l2=0; l2<n;l2++){ 
                            if(ransom[l].equals(ransom[l2])){
                                ransomCount++;
                            }
                        }
                       }
                        magazine[i] = "";    
                    }
                      }
				    if((sameCount>magazineCount)||(ransomCount>magazineCount)){
                        valid = false;
                        break;
                    }
				    sameCount =0;
                    magazineCount = 0;
                    ransomCount = 0;
            }
		if (valid) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
}
        scanner.close();
    }
}
