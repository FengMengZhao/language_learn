import java.util.*;

public class BinaryTreeLevelOrderTraversal_102{
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
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
        return;
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
        List<List<Integer>> res = new BinaryTreeLevelOrderTraversal_102().levelOrder(t1);
        System.out.println(res);
    }
}
