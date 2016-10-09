/*
import java.util.*;

public class BinaryTreeLevelOrderTraversalII_107{
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }

    public void helper(TreeNode root, List<List<Integer>> res, int level){
        if(null == root)
            return;

        helper(root.left, res, level + 1);
        helper(root.right, res, level + 1);
        if(res.size() - 1 < level)
            res.add(new ArrayList<Integer>(Arrays.asList(root.val)));
        else
            res.get(level).add(root.val);
    }
    public static void main(String args[]){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        List<List<Integer>> res = new BinaryTreeLevelOrderTraversalII_107().levelOrderBottom(t1);
        System.out.println(res);
    }
}
*/
import java.util.*;

public class BinaryTreeLevelOrderTraversalII_107{
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        Collections.reverse(res);
        return res;
    }

    public void helper(TreeNode root, List<List<Integer>> res, int level){
        if(null == root)
            return;

        if(res.size() - 1 < level)
            res.add(new ArrayList<Integer>(Arrays.asList(root.val)));
        else
            res.get(level).add(root.val);
        
        helper(root.left, res, level + 1);
        helper(root.right, res, level + 1);
    }

    public static void main(String args[]){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        List<List<Integer>> res = new BinaryTreeLevelOrderTraversalII_107().levelOrderBottom(t1);
        System.out.println(res);
    }
}
