import java.util.Scanner;
import java.util.Stack;

public class Infix_to_Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation to convert it into the postfix");
        String infix = sc.next();

        String postfix = Convert_String.convert(infix);
        System.out.println("Postfix operation is = " + postfix);
        sc.close();
    }   
}
class Convert_String{
    static int precedence(char ch){
        if(ch == '+'|| ch== '-'){
            return 1;
        }
        if(ch == '*' || ch=='/' || ch=='%'){
            return 2;
        }
        // if(ch == '^'){
        //     return 3;
        // }
        return 0;
    }

    public static String convert(String str){
        Stack<Character>stack = new Stack<>();
        String postfix = "";

        for(int i=0;i<str.length();i++){  // step1 of algorithm, till infix not over
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek()!='('){  // step 2 of algorithm
                    postfix = postfix + stack.pop();
                }
                // next step to remove the remaining open brackets i.e. '('
                if(!stack.isEmpty() && stack.peek()== '('){
                    stack.pop();
                }
            }

            else if(ch == '+'|| ch== '-'||ch == '*' || ch=='/' || ch=='%'||ch=='^'){ // 3rd step of the algorithm
                while(!stack.isEmpty()&& stack.peek()!= '(' && precedence(ch)<=precedence(stack.peek())){
                    postfix = postfix + stack.pop();
                }
                stack.push(ch);
            }
            else{ // 4th step of the algorithm
                postfix = postfix + ch;
            }  
        }

        // and at last copy the remaining things from the stack to the postfix

        while(!stack.isEmpty()){
            postfix = postfix + stack.pop();
        }
        return postfix;
    }
    
}