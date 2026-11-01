public class Stack_Implementation {
    int tos , Maxsize;
    int stack[];
    public static void main(String[] args){
        Stack_Implementation stack = new Stack_Implementation();
        stack.createStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        System.out.println();
        System.out.println(stack.pop());
        stack.printStack();
        stack.push(60);
        stack.printStack();
    }
    void createStack(int size){
        Maxsize=size;
        tos = -1;
        stack = new int[Maxsize];
    }
    void push(int element){
        stack[++tos] = element;
    }
    int pop(){
        return stack[tos--];
    }
    int peek(){
        return stack[tos];
    }
    boolean isEmpty(){
        return tos == -1;
    }
    boolean isFull(){
        return tos == Maxsize-1;
    }
    void printStack(){
        for(int i = tos;i>=0;i--){
            System.out.print(stack[i] + " ");
        }
    }
}

