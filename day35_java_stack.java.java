import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
		    Stack<Character>myStack = new Stack<>();
            for(int i=0;i<input.length();i++){
                if (myStack.isEmpty()){
                    myStack.push(input.charAt(i));
                }else{
                    char ci = input.charAt(i);
                    if(ci=='}'){
                        if(myStack.peek()=='{'){
                            myStack.pop();
                        }
                    }else if(ci==']'){
                        if(myStack.peek()=='['){
                            myStack.pop();
                        }
                    }else if(ci==')'){
                        if(myStack.peek()=='('){
                            myStack.pop();
                        }
                    }else{
                        myStack.push(input.charAt(i));
                    }
                }   
            }boolean seimbang = myStack.isEmpty();
            System.out.println(seimbang);
        }         
		
	}
}


