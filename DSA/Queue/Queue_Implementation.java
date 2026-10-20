import java.util.Scanner;

public class Queue_Implementation {
    int[] queue;
    int front,rear,Maxsize;

    void create_Queue(int size){
        front = 0;
        rear = -1;
        Maxsize = size;
        queue = new int[Maxsize];
    }
    void enqueue(int element){
        // rear +=1;
        queue[++rear] = element;
    }
    int dequeue(){
        return queue[front++];
    }
    boolean isEmpty(){
        return front>rear;
    }
    boolean isFull(){
        return rear == Maxsize-1;
    }
    int peek(){
        return queue[front];
    }
    void printQueue(){
        // for(int i:queue){
        //     System.out.print(i + " ");
        // }
        for(int i = front;i<=rear;i++){
            System.out.print(queue[i] + " ");
            // System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue_Implementation queue = new Queue_Implementation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        
        int size = sc.nextInt();
        queue.create_Queue(size);
        int choice;
        
        do{
            System.out.println("1. Add element to the queue");
            System.out.println("2. Remove element from the queue");
            System.out.println("3. Check queue is empty or not");
            System.out.println("4. Check queue is full or not");
            System.out.println("5. Return the top element element of the queue");
            System.out.println("6. Print the queue");
            System.out.println("7. Exit the loop");
            choice = sc.nextInt();
            
            switch(choice){
                case 1: System.out.println("Enter the element to add to the queue");
                if(!queue.isFull()){
                    queue.enqueue(sc.nextInt());
                }
                else{
                    System.out.println("Cannot add queue is full");
                }
                break;
                case 2: 
                    if(!queue.isEmpty()){
                        System.out.println(queue.dequeue());
                        System.out.println("Element removed");
                    }
                    else{
                        System.out.println("Queue is empty");
                    }
                break;
                case 3:
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty");
                    }
                    else{
                        System.out.println("Queue is not empty");
                    }
                break;
                case 4:
                    if(queue.isFull()){
                        System.out.println("Queue is full");
                    }
                    else{
                        System.out.println("Queue is not full");
                    }
                break;
                case 5:
                    if(!queue.isEmpty()){
                        System.out.println(queue.peek());
                    }
                    else{
                        System.out.println("Queue is empty");
                    }
                break;
                case 6:
                    if(!queue.isEmpty()){
                        queue.printQueue();
                    }
                    else{
                        System.out.println("Queue is empty");
                    }
                break;
                case 7: 
                    System.out.println("Program terminated");
                    break;
                default :
                    System.out.println("Invalid option selected ,please select valid option");
            }
        } while(choice != 7);
        sc.close();
    }
}
