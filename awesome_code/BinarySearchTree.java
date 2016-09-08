/*
 *  _
 * ^_^
 * / /
 *  
 * Use a static nested class TreeNode to formulate the BinarySearchTree
 * If I use the nested class, so I can't implement the Iterable version
 *  _
 * ^_^
 * \ \
 */
package org.fmz.awesome;

public class BinarySearchTree {

    static class TreeNode implements Comparable<TreeNode>{
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

    }

    private TreeNode root;

    public TreeNode getRoot(){
        return root;
    }

    public void insert(TreeNode node){
        TreeNode current;
        TreeNode node_parent;
        current = node_parent = root;
        while(current != null){
            if(node.compareTo(current) < 0){
                node_parent = current;
                current = current.getLeft();
            }else{
                node_parent = current;
                current = current.getRight();
            }
        }

        if(node_parent == null){
            root = node;
            return;
        }

        if(node.compareTo(node_parent) < 0)
            node_parent.setLeft(node);
        else
            node_parent.setRight(node);

        node.setParent(node_parent);
    }

    public void delete(TreeNode node){

        TreeNode parent = node.getParent();
        // case 1: node doesn't have a child, just delete it
        if(node.getLeft() == null && node.getRight() == null){
            if(parent != null){
                node.setParent(null);
                if(parent.getLeft() == node)
                    parent.setLeft(null);
                if(parent.getRight() == node)
                    parent.setRight(null);
            }else 
                root = null;
        }

        // case 2: node has only one child, splice the child with its parent
        else if(node.getLeft() == null || node.getRight() == null){
            TreeNode current = node.getLeft() == null ?
                node.getRight() : node.getLeft();
            if(parent != null){
                if(parent.getLeft() == node)
                    parent.setLeft(current);
                else
                    parent.setRight(current);
                
                // don't forgect set the parent
                if(current != null)
                    current.setParent(parent); 
            }else{
                // The to be deleted node is root
                if(root.getLeft() == node)
                    root.setLeft(null);
                if(root.getRight() == node)
                    root.setRight(null);
                root = node;
            }
        }

        // case 3: node has both children, set the successor of the node to its parent 
        /* The successor will have at most one child 
         * The child must be a right child
         * Because if the child is left child
         * it will less than the successor
         * the successor will not be the mimnum of the right subtree
         */
        else{
            TreeNode successor = findSuccessor(node);
            node.setData(successor.getData());// update the data portion

            // current can be null or not
            TreeNode current = successor.getLeft() == null ?
                successor.getRight() : successor.getLeft();

            if(successor.getParent().getLeft() == successor){
                successor.getParent().setLeft(current);
            }
            else{
                successor.getParent().setRight(current);
            }
            // don't  forgect set the parent
            if(current != null)
                current.setParent(successor.getParent());
        }
    }
    
    public TreeNode findMax(TreeNode root){
        if(root == null)
            return null;
        if(root.getRight() != null)
            return findMax(root.getRight());
        return root;
    }

    public TreeNode findMin(TreeNode root){
        if(root == null)
            return null;
        if(root.getLeft() != null)
            return findMin(root.getLeft());
        return root;
    }

    public TreeNode findSuccessor(TreeNode node){
        if(node == null)
            return null;
        if(node.getRight() != null)
            return findMin(node.getRight());

        TreeNode current = node;
        TreeNode parent = node.getParent();
        while(parent != null && current == parent.getRight()){
            current = parent;
            parent = parent.getParent();
        }
        return parent;
    }

    public TreeNode findPredecessor(TreeNode node){
        if(node == null)
            return null;
        if(node.getLeft() != null)
            return findMax(node.getLeft());

        TreeNode parent = node.getParent();
        TreeNode current = node;
        while(parent != null && current == parent.getLeft()){
            current = parent;
            parent = parent.getParent();
        }
        return parent;
    }
}
