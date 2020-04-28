package Week3;

public class BinarySearchTreeFromPreOrderTraversal {

    public static void main(String[] args) {
        int [] arr = new int[]{8,5,1,7,10,12};
        TreeNode result = bstFromPreorder(arr);
    }
    
    private static void printBST(TreeNode result) {
        //todo
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        //PreOrder Root - Left - right.
        //  Root
        //Less  GreaterValue
        if(preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1 ; i < preorder.length ; i++){
            root = bst(root,preorder[i]);
        }
        return root;
    }

    private static TreeNode bst(TreeNode root, int i) {
        //Assuming no duplicates
        if(root == null){
            return new TreeNode(i);
        }else if(i < root.val){
            root.left = bst(root.left,i);
            return root;
        }else{
            root.right = bst(root.right,i);
            return root;
        }
    }
}