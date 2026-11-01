public class Dynamic_Stack {
    Node tos;
    public static void main(String[] args) {
        Dynamic_Stack stack = new Dynamic_Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printStack();
        stack.peek();
        stack.pop();
        stack.printStack();
    }
    void push(int element){
        Node n = new Node(element);
        if(tos == null){
            tos = n;
        }
        else{
            n.next = tos;
            tos = n;
        }
    }
    void pop(){
        Node t = tos; // reference
        if(tos == null){
            System.out.println("Stack is empty");
        }
        else{
            tos = tos.next;
            System.out.println("Element popped = " + t.data);
        }
    }
    void peek(){
        if(tos == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(tos.data);
        }
    }
    void printStack(){
        if(tos == null){
            System.out.println("Stack is empty");
        }
        else{
            Node t = tos;
            while(t != null){
                System.out.print(t.data + " ");
                t=t.next;
            }
        }
    }

}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next=null;
        this.prev = null;
    }
}
