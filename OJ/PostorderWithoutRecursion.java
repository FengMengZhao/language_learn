import java.util.*;

public class PostorderWithoutRecursion{
    public void postorder(TreeNode root){
        LinkedList<TreeNode> stack1 = new LinkedList<>(),
                             stack2 = new LinkedList<>(); 
        stack1.push(root); 
        while(stack1.size() != 0){
            TreeNode node = stack1.pop();
            stack2.push(node);

            if(node.left != null)
                stack1.push(node.left);
            if(node.right!= null)
                stack1.push(node.right);
        }

        for(TreeNode node : stack2)
            System.out.print(node.val + " --> ");
    }
}
