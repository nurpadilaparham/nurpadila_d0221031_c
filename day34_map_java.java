//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();//key
            int phone=in.nextInt();//value
            phonebook.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())//While NOT EOF
        {
            String s=in.nextLine();//s = kunci yang dicari = nama yang dicari
            if(phonebook.containsKey(s)){
                System.out.println(s+"="+phonebook.get(s));
            }else{
                 System.out.println("Not found");
            }
        }
    }
}




