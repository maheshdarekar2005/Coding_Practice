import java.util.Scanner;

class Node{
    int data;
    Node next;
    // int right;
    Node(int data){
        this.data = data;
        this.next = null;
        // this.right = null;
    }
}
public class Circular_Linked_List {
    Node root,last;
    void insertLeft(int data){
        Node n = new Node(data);
        if(root == null){
            root = last = n;
        }
        else{
            n.next = root;
            root = n;
        }
        last.next = root;
    }

    void deleteLeft(){
        if(root == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node t = root;
            if(root == last){
                root = last = null;
            }
            else{
                root = root.next;
                last.next = root;
            }
            System.out.println("Element deleted = " + t.data);
        }
    }

    void insertRight(int data){
        Node n = new Node(data);
        if(root == null){
            root = last = n;
        }
        else{
            last.next = n;
            last = n;
        }
        last.next = root;
    }
    void deleteRight(){
        if(root == null){
            System.out.println("Linked List is empty");
        }
        else{
            Node t = root;
            Node t2 = root;

            while(t!= null){
                t2 = t;
                t=t.next;
            }
            if(root == last){
                root = last = null;
            }
            else{
                last = t2;
                last.next = root;
            }
            System.out.println("Element deleted = " + t.data);
        }
    }

    void printList(){
        if(root == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node t = root;
             do {
            	 System.out.print("|" + t.data + "|->");
            	 t = t.next;//move
			} 
            while (t!=root);
        }
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circular_Linked_List list = new Circular_Linked_List();

        int choice, data, key;

        do {
            System.out.println("\n===== LINEAR LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display List");
            System.out.println("6. Search Element");
            System.out.println("7. Insert After");
            System.out.println("8. Delete Element");
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
                    System.out.println("Linked List:");
                    list.printList();
                    break;

//                case 6:
//                    System.out.print("Enter element to search: ");
//                    key = sc.nextInt();
//
//                    if (list.searchList(key)) {
//                        System.out.println("Element found.");
//                    } else {
//                        System.out.println("Element not found.");
//                    }
//                    break;
//                    
//                case 7:
//                	System.out.println("Enter the reference");
//                	int ref = sc.nextInt();
//                	System.out.println("Enter the data");
//                	int new_data = sc.nextInt();
//                	
//                	list.insertAfter(ref, new_data);
//                	System.out.println("Element inserted");
//                	break;
//                	
//                case 8:
//                	System.out.println("Enter a element to delete");
//                	int element = sc.nextInt();
//                	
//                	list.deleteElement(element);
//                	break;

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
