import java.util.Scanner;

public class Circular_Queue {
    public static void main(String[] args) {
        Main queue = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Circular queue");
        int size = sc.nextInt();
        queue.create_Queue(size);

        while(true){
            System.out.println("1. Add element to the queue");
            System.out.println("2. Remove element from the queue");
            System.out.println("3. Check queue is empty or not");
            System.out.println("4. Check queue is full or not");
            System.out.println("5. Return the top element element of the queue");
            System.out.println("6. Print the queue");
            System.out.println("7. Exit the loop");
            
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter element to add to the queue");
                    if(!queue.isFull()){
                        queue.enqueue(sc.nextInt());
                    }
                    else{
                        System.out.println("Queue is full");
                    }
                break;
                case 2: 
                    if(!queue.isEmpty()){
                        System.out.println(queue.dequeue() + " removed");
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
                    sc.close();
                    return;
                default :
                    System.out.println("Invalid option selected ,please select valid option");
                    break;
                }
                
            }
        }
    }

class Main{
    int[] queue;
    int front,rear,count,Maxsize;

    void create_Queue(int size){
        front = 0;
        rear = -1;
        count = 0;
        Maxsize = size;
        queue = new int[Maxsize];
    }

    void enqueue(int element){
        rear= (rear+1)%Maxsize;
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
    int peek(){
        return queue[front];
    }

    void printQueue(){
        for(int i=0;i<count;i++){
            int index = (front+i)%Maxsize;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}