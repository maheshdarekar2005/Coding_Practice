class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Singly_Linked_List {
    Node root;

    void insertLeft(int element){
        Node n = new Node(element);
        if(root == null){
            root = element;
        }
        else{
            n.next = root;
            root = n;
        }
    }

    void deleteLeft(){
        if(root == null){
            System.out.println("Linked List is Empty!!");
        }
        else{
            Node t = root;
            root = root.next;
            System.out.println("Element deleted is = " + t.data);
        }
    }

    void insertRight(int data){
        Node n = new Node(data);
        if(root == null){
            root = n;
        }
        else{
            Node t = root;
            while (t.next != null) {
                t=t.next;
            }
            t.next = n;
        }
    }

    void deleteRight(){
        if(root == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node t = root;
            Node t2 = root;

            while(t.next != null){
                t2 = t;
                t=t.next;
            }
            if(t == root){
                root = null;
            }
            else{
                t2.next = null;
            }
            System.out.println("Element deleted " + t.data);
        }
    }

    void printLinkedList(){
        if(root == null){
            System.out.println("Lineked List is empty!!");
        }
        else{
            Node t = root;
            while(t != null){
                System.out.println("|" + t.data + "|>");
                t =t.next;
            }
        }
    }

    boolean searchList(int key){
        if(root == null){
            System.out.println("Linked List is empty!!");
            return false;
        }
        else{
            Node t = root;
            while(t!=null){
                if(key == t.data){
                    return true;
                }
                t=t.next;
            }
        }
        return false;
    }

    
    
}
