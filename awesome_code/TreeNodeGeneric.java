/*
 *  _
 * ^_^
 * / /
 * 
 * Now I can't use the generic to implement
 *  _
 * ^_^
 * \ \
 */

package org.fmz.awesome;

public class TreeNodeGeneric<T> implements Comparable<TreeNode>{
    private T data;
    private TreeNode parent;
    private TreeNode left;
    private TreeNode right;

    public TreeNodeGeneric(T dt){
        data = dt;
        parent = left = right = null;
    }

    public void setData(T dt){
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

    public T getData(){
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
        return ((Comparable)data).compareTo((Comparable)another.getData());
    }

    public String toString(){
        return data.toString();
    }
}
