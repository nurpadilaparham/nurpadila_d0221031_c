import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int lA = A.length();
        int lB = B.length();
        int l = lA + lB;
        System.out.println(l);
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String newA1 = A.substring(0,1).toUpperCase();
        String newA2 = A.substring(1);
        String newA = newA1 + newA2;
        String newB1 = B.substring(0,1).toUpperCase();
        String newB2 = B.substring(1);
        String newB = newB1 + newB2;
        
        System.out.println(newA+" "+newB);
    }
}