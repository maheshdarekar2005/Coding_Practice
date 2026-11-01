public class Queue_Implementation {
    int[] queue;
    int Maxsize,front,rear;
    public static void main(String[] args) {
        Queue_Implementation queue = new Queue_Implementation();
        queue.create_Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
    void create_Queue(int size){
        front = 0;
        rear = -1;
        Maxsize = size;
        queue = new int[Maxsize];
    }

    void enqueue(int element){
        queue[++rear]= element;
    }
    int dequeue(){
        if(!isEmpty()){
            System.out.println("Queue is empty");
        }
        return queue[front++];
    }
    boolean isEmpty(){
        return front>rear;
    }
    boolean isFull(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return rear == (Maxsize-1);
    }
    void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
    }
}
