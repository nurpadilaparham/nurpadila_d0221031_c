import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class day29_java_2D_array {
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner (System.in);
      int[][] arr = new int[6][6];
      
      for(int i=0;i<6;i++){
            String baris = sc.nextLine();
            String[] arrRowItems = baris.split(" ");
            for(int j=0;j<6;j++){
                int value = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = value;
            }
        }
        sc.close();
        int max_sum = Integer.MIN_VALUE;
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                int a = arr[ i-1][ j -1];
                int b = arr[ i-1][ j ];
                int c = arr[ i -1][ j+1];
                int d = arr[ i ][ j ];
                int e = arr[ i+1][ j-1];
                int f = arr[ i+1][ j ];
                int g = arr[ i +1][ j+1];
                int jumlah = a+b+c+d+e+f+g;
                if(jumlah>max_sum){
                    max_sum = jumlah;
                }   
            }
        }
        System.out.println(max_sum);   
    }
}