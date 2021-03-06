/*
 *  _
 * ^_^
 * / /
 *
 * Tis is the Iterable version without no nested class
 * The Iterable use the generics <>, if don't use the genreic <>, the default will be Object
 *  _
 * ^_^
 * \ \
 */
package org.fmz.awesome;

import java.util.Iterator;

public class BinarySearchTreeIterable implements Iterable<TreeNode>{

    private int num_items = 0;
    private TreeNode root;

    public TreeNode getRoot(){
        return root;
    }

    public int size(){
        return num_items;
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
            num_items--;
            return;
        }

        if(node.compareTo(node_parent) < 0)
            node_parent.setLeft(node);
        else
            node_parent.setRight(node);

        node.setParent(node_parent);
        num_items++;
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
        num_items--;
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

    public Iterator<TreeNode> iterator(){
        return new Iterator<TreeNode>(){
            private int count = num_items;
            public boolean hasNext(){
                return count-- > 0;
            }

            private TreeNode minimum = BinarySearchTreeIterable.this.findMin(root);
            public TreeNode next(){
                TreeNode res = minimum;
                minimum = BinarySearchTreeIterable.this.findSuccessor(minimum);
                return res;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
