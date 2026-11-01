public class Dynamic_Queue {
   Node front,rear;
   public static void main(String[] args) {
        Dynamic_Queue queue = new Dynamic_Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
   }
   void enqueue(int element){
        Node n = new Node(element);
        if(front==null && rear ==null){
            front=rear=n;
        }
        else{
            rear.next = n;
            rear = n;
        }
   }
   void dequeue(){
    if(front==null && rear == null){
        System.out.println("Queue is empty");
    }
    else{
        Node t = front;
        if(front == rear){
            front=rear=null;
        }
        else{
        front = front.next;
        }
        System.out.println("Deleted = " + t.data);
    }
   } 
   void peek(){
        if(front == null && rear == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(front.data);
        }
   }
   void printQueue(){
        if(front == null && rear == null){
            System.out.println("Queue is empty");
        }
        else{
            Node t = front;
            while(t!=null){
                System.out.println(t.data);
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
        this.data= data;
        this.next=null;
        this.prev=null;
    }
}
