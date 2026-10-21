import java.util.Scanner;

class Dnode{
    int data;
    Dnode next;
    Dnode prev;
    Dnode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Doubly_Circular_Linked_List {
    Dnode root,last;
    void insertLeft(int data){
        Dnode n = new Dnode(data);
        if(root == null && last == null){
            root = last = n;
            n.next = n;
            n.prev =n;
        }
        else{
            n.next = root;
            root.prev = n;
            root = n;
            root.prev = last;
            last.next = root;
        }
    }

    void deleteLeft(){
        if(root == null && last == null){
            System.out.println("Circular Doubly Linked List is Empty");
        }
        else{
            Dnode t = root;
            if(root == last){
                root = last = null;
            }
            else{
                root = root.next;
                last.next = root;
                root.prev = last;
            }
            System.out.println("Element deleted = " + t.data);
        }
    }

    void insertRight(int data){
        Dnode n = new Dnode(data);
        if(root == null && last == null){
            root = last = n;
            n.next = n;
            n.prev =n;
        }
        else{
            n.prev = last;
            n.next = root;
            last.next = n;
            root.prev = n;
            last =n;
        }
    }

    void deleteRight(){
        if(root == null && last == null){
            System.out.println("Circular Doubly Linked List is Empty");
        }
        else{
            Dnode t = last;
            // Dnode t2 = root;
            if(root == last){
                root = last = null;
            }
            else{
                last = last.prev;
                last.next = root;
                root.prev = last;
            }
            System.out.println("Element Deleted = " + t.data);
        }
    }

    void printList(){
        if(root == null && last == null){
            System.out.println("Circular Doubly Linked List is Empty");
        }
        else{
            Dnode t = root;
            do{
                System.out.print("|" + t.data + "|>");
                t=t.next;
            }
            while(t!= root);
        }
    }

    void printReverseList(){
        if(root == null && last == null){
            System.out.println("Circular Doubly Linked List is Empty");
        }
        else{
            Dnode t = last;
            do{
                System.out.print("|" + t.data + "|>");
                t = t.prev;
            }
            while(t!=last);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Doubly_Circular_Linked_List list = new Doubly_Circular_Linked_List();

        int choice, data;

        do {
            System.out.println("\n===== LINEAR LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display List");
            System.out.println("6. Display Reverse List");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.insertLeft(data);
                    System.out.println("Inserted at left.");
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.insertRight(data);
                    System.out.println("Inserted at right.");
                    break;

                case 3:
                    list.deleteLeft();
                    break;

                case 4:
                    list.deleteRight();
                    break;

                case 5:
                    System.out.println("Doubly Circular Linked List:");
                    list.printList();
                    break;
                
                case 6:
                    System.out.println("Reverse Doubly Circular Linked List:");
                    list.printReverseList();
                    break;


                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice!=0);

        sc.close();
    }
}
