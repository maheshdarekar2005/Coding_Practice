public class Circular_Queue_Implementation {
    int[] queue;
    int Maxsize,front,rear,count;

    public static void main(String[] args) {
        Circular_Queue_Implementation queue= new Circular_Queue_Implementation();
        queue.create_Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
    }
    void create_Queue(int size){
        front = 0;
        rear = -1;
        Maxsize = size;
        queue = new int[Maxsize];
        count = 0;
    }

    void enqueue(int element){
        rear = (rear + 1) % Maxsize;
        queue[rear] = element;
        count++;
    }
    int dequeue(){
        int element = queue[front];
        front = (front+1)%Maxsize;
        count--;
        return element;
    }
    boolean isEmpty(){
        return count == 0;
    }
    boolean isFull(){
        return count == Maxsize;
    }

    void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int ct=0;
        int frontelement = front;
        while(ct<count){
            System.out.print(queue[frontelement] + " ");
            frontelement = (frontelement+1)%Maxsize;
            ct++;
        }
    }
}
