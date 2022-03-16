import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bi = new BigInteger(n);
        boolean prima = bi.isProbablePrime(1);
        if(prima){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
