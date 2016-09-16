public class MaxDepthBTree_104{
    public int maxDepth(TreeNode root){
        return maxDepthHelper(root, 0);
    }

    protected int maxDepthHelper(TreeNode current, int i){
        if(current == null)
            return i;
        return Math.max(maxDepthHelper(current.left, i + 1),
                        maxDepthHelper(current.right, i + 1));
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        root.left = left1;
        root.right = right1;
        left1.right = new TreeNode(4);
        System.out.println(new MaxDepthBTree_104().maxDepth(root));
    }
}
