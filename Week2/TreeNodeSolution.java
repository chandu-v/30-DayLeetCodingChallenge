package Week2;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeSolution {

    public static void main(String[] args) {
        int arr[][] = new int[5][3];
        arr[0] = new int[]{1 ,1 ,2};
        arr[1] = new int[]{2 ,3 ,4};
        arr[2] = new int[]{3 ,-1 ,-1};
        arr[3] = new int[]{4 ,-1 ,-1};
        arr[4] = new int[]{5 ,-1 ,-1};
        List<TreeNode> list = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            TreeNode treeNode = new TreeNode(arr[i][0]);
            list.add(treeNode);
        }
        for(int i = 0 ; i < 5 ; i++){
            if(arr[i][1] == -1){
                list.get(i).left = null;
            }else{
                list.get(i).left = list.get(arr[i][1]);
            }
            if(arr[i][2] == -1){
                list.get(i).right = null;
            }else{
                list.get(i).right = list.get(arr[i][2]);
            }  
        }
        bfs(list.get(0),0);
        int result = diameterOfBinaryTree(list.get(0)); 
    }
    
    private static void bfs(TreeNode treeNode) {
        if(treeNode.left == null    &&  treeNode.right ==null){
            System.out.println(treeNode.val);
        }else if(treeNode.left   ==  null){
            dfs(treeNode.right);
            System.out.println(treeNode.val);

        }else if(treeNode.right ==  null){
            dfs(treeNode.left);
            System.out.println(treeNode.val);

        }else{
            dfs(treeNode.left);
            dfs(treeNode.right);
            System.out.println(treeNode.val);
        }
    }

    private static void dfs(TreeNode treeNode){
        if(treeNode ==  null){
            return;
        }
        System.out.println(treeNode.val);
        bfs(treeNode.left);
        bfs(treeNode.right);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        return 0;
        
    }

    private static void bfs(TreeNode treeNode, int height) {
        if(treeNode.left == null    &&  treeNode.right ==null){
            System.out.println(treeNode.val+"\t"+height);
        }else if(treeNode.left   ==  null){
            bfs(treeNode.right,height+1);
            System.out.println(treeNode.val+"\t"+height);

        }else if(treeNode.right ==  null){
            bfs(treeNode.left,height+1);
            System.out.println(treeNode.val+"\t"+height);

        }else{
            bfs(treeNode.left,height+1);
            bfs(treeNode.right,height+1);
            System.out.println(treeNode.val+"\t"+height);
        }
    }

    private static boolean isLeafNode(TreeNode treeNode){
        if(treeNode.left == null && treeNode.right == null){
            return true;
        }else{
            return false;
        }
    }

    private static int distanceBetweenTwoNodes(TreeNode src,TreeNode dst){
        int distance = 0;
        
        return distance;
    }
}