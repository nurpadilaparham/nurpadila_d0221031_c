
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   public <T> void printArray(T[] array){
      for(T x:array){
          System.out.println(x);
     
         }
     }
     
}

public class Solution {