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
    

}
