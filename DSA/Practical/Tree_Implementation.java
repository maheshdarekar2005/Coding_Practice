public class Tree_Implementation {
    Node root;
    void insert(Node r, Node n){
        if(root == null){
            root = n;
        }
        else{
            if(n.data<r.data){
                if(r.left == null){
                    r.left = n;
                }
                else{
                    insert(r.left, n);
                }
            }
            else{
                if(r.right == null){
                    r.right = n;
                }
                else{
                    insert(r.right, n);
                }
            }
        }
    }
    void inorder(Node r){
        //LPR
        if(r!=null){
            inorder(r.left);
            System.out.print(r.data + "-");
            inorder(r.right);
        }
    }
    void preorder(Node r){
        //PLR
        if(r!=null){
            System.out.print(t.data + "-");
            preorder(r.left);
            preorder(r.right);
        }
    }
    void postorder(Node r){
        //LRP
        if(r!=null){
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data);
        }
    }
    boolean searchkey(Node r,int element){
        if(r == null){
            return false;
        }
        if(r.data == element){
            return true;
        }
        if(key < r.data){
            searchkey(r.left, element);
        }
        else{
            searchkey(r.right, element);
        }
    }
    int countNodes(Node r){
        if(r == null){
            return 0;
        }
        else{
            return 1+countNodes(r.left)+countNodes(r.right);
        }
    }
    int countDepth(Node r){
        if(r == null){
            return 0;
        }
        else{
            int left = countDepth(r.left);
            int right = countDepth(r.right);
            return 1+ Math.max(left, right);
        }
    }
    int countLeafNode(Node r){
        if(r == null){
            return 0;
        }
        else if(r.left == null && r.right == null){
            return 1;
        }
        else{
            return countNodes(r.left)+countDepth(r.right);
        }
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}