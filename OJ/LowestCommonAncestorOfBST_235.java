import java.util.*;

public class LowestCommonAncestorOfBST_235{
    protected static List<TreeNode> findTreeNode(TreeNode root, TreeNode target){
        List<TreeNode> node_ls = new ArrayList<>();
        TreeNode current = root;
        while(current != null){
            node_ls.add(current);
            if(target.val < current.val){
                current = current.left;
            }else if(target.val > current.val)
                current = current.right;
            else break;
        }
        return node_ls;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        List<TreeNode> p_ls = findTreeNode(root, p);
        List<TreeNode> q_ls = findTreeNode(root, q);
        ListIterator<TreeNode> p_iter = p_ls.listIterator(p_ls.size());
        TreeNode node = null;
        while(p_iter.hasPrevious()){
            node = p_iter.previous();
            if(q_ls.contains(node))
                return node;
        }
        return node;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(6);
        TreeNode node_1 = new TreeNode(2);
        TreeNode node_2 = new TreeNode(8);
        TreeNode node_3 = new TreeNode(0);
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_5 = new TreeNode(7);
        TreeNode node_6 = new TreeNode(9);
        TreeNode node_7 = new TreeNode(3);
        TreeNode node_8 = new TreeNode(5);

        root.left = node_1;
        root.right = node_2;
        node_1.left = node_3;
        node_1.right = node_4;
        node_2.left = node_5;
        node_2.right = node_6;
        node_4.left = node_7;
        node_4.right = node_8;
        System.out.println(new LowestCommonAncestorOfBST_235().lowestCommonAncestor(root, node_1, node_2).val);
        System.out.println(new LowestCommonAncestorOfBST_235().lowestCommonAncestor(root, node_1, node_4).val);
        System.out.println(new LowestCommonAncestorOfBST_235().lowestCommonAncestor(root, node_7, node_8).val);
        System.out.println(new LowestCommonAncestorOfBST_235().lowestCommonAncestor(root, node_3, node_7).val);
    }
}
