public class Binary_Search_Tree {
    static Node root;

    static void insert(Node r,Node n){
        if(root == null){
            root = n;
        }
        else{
            if(n.data < r.data){
                if(r.left == null){
                    r.left = n;
                }
                else{
                    insert(r.left, n); // recursion
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

    static void inorder(Node r){  // inorder = LPR
        if(r != null){
            inorder(r.left); // left
            System.out.print(r.data + "-"); // print
            inorder(r.right); // right
        }
    }
    static void preorder(Node r){  // preorder = PLR
        if(r != null){ 
            System.out.print(r.data + "-");  //print
            preorder(r.left);  // left
            preorder(r.right); // right
        }
    }
    static void postorder(Node r){ // postorder = LRP
        if(r != null){
            postorder(r.left); //left
            postorder(r.right); // right
            System.out.print(r.data + "-"); // print
        }
    }
    static boolean searchTree(Node r, int key){
        if(r == null){
            return false;
        }
        if(r.data == key){
            return true;
        }
        if(key < r.data){
            return searchTree(r.left, key);
        }
        else{
            return searchTree(r.right, key);
        }
    }

    
}
