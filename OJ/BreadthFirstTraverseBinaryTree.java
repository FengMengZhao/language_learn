import java.util.*;

public class BreadthFirstTraverseBinaryTree{
    public void breadth(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(queue.size() != 0){
            TreeNode node = queue.poll();
            System.out.print(node.val + " --> ");
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
    }
}
