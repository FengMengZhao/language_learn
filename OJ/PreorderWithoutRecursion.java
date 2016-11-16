import java.util.*;

public class PreorderWithoutRecursion{
    public void preorder(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while(stack.size() != 0){
            TreeNode node = stack.pop();
            System.out.print(node.val + " --> ");
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);
        }
    }
}
