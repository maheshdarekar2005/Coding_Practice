import java.util.Scanner;
import java.util.Stack;

public class Infix_to_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation");
        String infix = sc.next();

        String prefix = Convert_String.convert(infix);
        System.out.println("Prefix String = " + prefix);
    }
}

class Convert_String{
    static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        if(ch=='*'||ch=='/'|| ch=='%'){
            return 2;
        }
        return 0;
    }
    static String convert(String str){
        Stack<Character>stack = new Stack<>();
        String prefix = "";

        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            if(ch ==')'){
                stack.push(ch);
            }

            else if(ch == '('){
                while (!stack.isEmpty()&& stack.peek()!=')') {
                    prefix = prefix + stack.pop();
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(ch=='+' || ch=='-'||ch=='*'||ch=='/'|| ch=='%'){
                while (!stack.isEmpty()&& stack.peek()!=')'&& precedence(ch) < precedence(stack.peek())) {
                    prefix = prefix + stack.pop();
                }
                stack.push(ch);
            }
            else{
                prefix = prefix+ch;
            }
        }
        while (!stack.isEmpty()) {
            prefix = prefix+stack.pop();
        }
        String OriginalPrefix="";
        for(int i = 0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            OriginalPrefix = OriginalPrefix + stack.pop();
        }
        return OriginalPrefix;
    }
}
