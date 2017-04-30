public class InvertBinaryTree_226{
    public TreeNode invertTree(TreeNode root){
        if(root != null){
            if(root.left != null && root.right != null){
                TreeNode tmp = root.left;
                root.left = root.right;
                root.right = tmp;
            }
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(1);
        TreeNode left3 = new TreeNode(6);
        TreeNode right1 = new TreeNode(7);
        TreeNode right2 = new TreeNode(3);
        TreeNode right3 = new TreeNode(9);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.right.left.val);
        System.out.println(root.right.right.val);
        new InvertBinaryTree_226().invertTree(root);
        System.out.println("#######");
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.right.left.val);
        System.out.println(root.right.right.val);
    }
}
