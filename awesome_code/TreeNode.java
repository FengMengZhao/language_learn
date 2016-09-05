package org.fmz.awesome;

public class TreeNode implements Comparable<TreeNode>{
    private Object data;
    private TreeNode parent;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Object dt){
        data = dt;
        parent = left = right = null;
    }

    public void setData(Object dt){
        data = dt;
    }

    public void setLeft(TreeNode lc){
        left = lc;
    }

    public void setRight(TreeNode rc){
        right = rc;
    }

    public void setParent(TreeNode par){
        parent = par;
    }

    public Object getData(){
        return data;
    }

    public TreeNode getParent(){
        return parent;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    @SuppressWarnings("unchecked")
    public int compareTo(TreeNode another){
        return ((Comparable)data).compareTo((Comparable)another.data);
    }

    public String toString(){
        return data.toString();
    }

    public static void main(String... args){
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(1);
        System.out.println(tn1.equals(tn2));
        System.out.println(tn1.compareTo(tn2));
    }
}
