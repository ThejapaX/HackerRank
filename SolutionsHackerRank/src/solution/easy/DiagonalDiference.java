package solution.easy;
import java.util.*;

public class DiagonalDiference {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sum=0,sum2=0,dif=0;
        for(int l=0;l<a.length;l++){
            for(int c=0;c<a[0].length;c++){
                if(l==c){ // se linha é igual a coluna
                   sum+=a[l][c]; //soma a posição de a atual com a variavel sum
                }if(l+c==a[0].length-1) // se linha + coluna atuais forem igual ao tamanho de colunas da linha 0 , 3, 3-1=2, ou seja o ponto central de uma matriz
                    sum2+=a[l][c];// soma o valor matriz da linha e coluna que atende a condição anterior com sum2 
                
              }
        }
          dif=sum2-sum; 
          return dif;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// input do tamanho da matriz, para linha e coluna
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt(); // input dos numeros na matriz a
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
