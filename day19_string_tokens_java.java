import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.v
        s = s.replaceAll("[!,?._'@\\s]+"," ");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}
