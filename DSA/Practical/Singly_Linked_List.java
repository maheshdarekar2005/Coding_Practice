public class Singly_Linked_List {
    Node root;
    public static void main(String[] args) {
        Singly_Linked_List ll = new Singly_Linked_List();
        ll.insertLeft(10);
        ll.printList();
    }
    void insertLeft(int element){
        Node n = new Node(element);
        if(root == null){
            root = n;
        }
        else{
            n.next = root;
            root = n;
        }
    }
    void deleteLeft(){
        if(root == null){
            System.out.println("List is empty");
        }
        else{
            Node t = root;
            root = root.next;
            System.out.println("Deleted = "+ t.data);
        }
    }
    void insertRight(int element){
        Node n = new Node(element);
        if(root == null){
            root = n;
        }
        else{
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
    }
    void deleteRight(){
        if(root == null){
            System.out.println("List is empty");
        }
        else{
            Node t = root;
            Node t2 = root;
            while (t.next != null) {
                t2 = t;
                t=t.next;
            }
            if(t == root){
                root = null;
            }
            else{
                t2.next = null;
            }
            System.out.println("Element deleted = " + t.data);
        }
    }
    void printList(){
        if(root == null){
            System.out.println("List is empty");
        }
        else{
            Node t = root;
            while (t!=null) {
                System.out.println("|"+t.data+"|>");
                t=t.next;
            }
            System.out.print("null");
        }
    }
    boolean searchKey(int key){
        if(root == null){
            System.out.println("List is empty");
            return false;
        }
        else{
            Node t = root;
            while (t!=null) {
                if(key == t.data){
                    return true;
                }
                t=t.next;
            }
        }
        return false;
    }
    void insertAfter(int ref,int newdata){
        
        if(root == null){
            System.out.println("List is empty");
        }
        else{
            Node t = root;
            while(t != null){
                if(t.data == ref){
                    Node n = new Node(newdata);
                    n.next = t.next;
                    t.next = n;
                }
                t=t.next;
            }
            if(t==null)
                System.out.print("\n"+ref+" not found");
        }
        
    }
    void deleteElement(int element){
        if(root == null){
            System.out.println("List is empty");
        }
        else{
            Node t = root;
            Node t2 = root;
            while (t!=null) {
                if(t.data == element){
                    if(t==root){
                        root=root.next;
                    }
                    else if(t.next == null){
                        t2.next = null;
                    }
                    else{
                        t2.next=t.next;
                    }
                    System.out.println("Deleted = " + t.data);
                }
                t2 =t;
                t=t.next;
            }
            if(t==null)
                System.out.print("\n"+element+" not found");
        }
    }
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
