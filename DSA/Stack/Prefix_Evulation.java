import java.util.Scanner;
import java.util.Stack;

public class Prefix_Evulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix operation to evulate");
        String infix = sc.next();

        int result = Evulate.evulate(infix);
        System.out.println("Evualated operation is = " + result);
    }
}

class Evulate{
   
    static int evulate(String str){
        Stack<Integer>stack = new Stack<>();
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            // inbuilt method to check the character is digit or not
            if(Character.isDigit(ch)){  // means if it is operand
                int num = ch - '0';  //char converted to int
                stack.push(num);
            }
            else{ // means scanned character is not operand rather it is operator
                int opr1 = stack.pop();
                int opr2 = stack.pop();

                int res = 0;

                switch(ch){
                    case '+': res = opr1+opr2;
                    break;

                    case '-': res = opr1-opr2;
                    break;

                    case '*': res = opr1*opr2;
                    break;

                    case '/': res = opr1/opr2;
                    break;

                    case '%': res = opr1%opr2;
                    break;
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }

}
