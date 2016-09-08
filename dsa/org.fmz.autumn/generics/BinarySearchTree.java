/*
 *  _
 * ^_^
 * / /
 *  
 * Use a static nested class BSTNode to formulate the BinarySearchTree
 * If I use the nested class, so I can't implement the Iterable version
 *  _
 * ^_^
 * \ \
 */
package org.fmz.autumn;

import java.util.Iterator;

public class BinarySearchTree<T> extends BinaryTree<T>{

    static class BSTNode<U> extends BinaryTreeNode<U> implements Comparable<BSTNode>{

        public BSTNode(U dt){
            super(dt);
            parent = left_child = right_child = null;
        }

        @SuppressWarnings("unchecked")
        public int compareTo(BSTNode another){
            return ((Comparable)data).compareTo((Comparable)another.data);
        }

        public String toString(){
            return data.toString();
        }

        // I provide a series of getMethod() is to avoid plenty of trivial downcast operation
        public BSTNode<U> getLeft(){
            return (BSTNode<U>)left_child;
        }

        public BSTNode<U> getRight(){
            return (BSTNode<U>)right_child;
        }

        public BSTNode<U> getParent(){
            return (BSTNode<U>)parent;
        }
    };

    public BSTNode<T> getRoot(){
        return (BSTNode<T>)root;
    }

    // This method is use for given an element to find the node in the tree, and used to be deleted
    protected BSTNode<T> findNode(T element){
        BSTNode<T> target = new BSTNode<T>(element);
        BSTNode<T> current = getRoot();
        while(current != null){
            if(target.compareTo(current) == 0)
                return current;
            if(target.compareTo(current) < 0)
                current = current.getLeft();
            else
                current = current.getRight();
        }
        return current;
    }

    public void insert(T elelement){
        BSTNode<T> node = new BSTNode<T>(elelement);
        insert(node);
    }

    @SuppressWarnings("unchecked")
    protected void insert(BSTNode node){
        BSTNode<T> current;
        BSTNode<T> node_parent; // The node will be the inserted node's parent
        current = node_parent = getRoot();
        while(current != null){
            if(node.compareTo(current) < 0){
                node_parent = current;
                current = current.getLeft();
            }else{
                node_parent = current;
                current = current.getRight();
            }
        }

        // Check the node_parent whether to be null
        // if null, the inserted tree is null, and the node inserted node will be root
        if(node_parent == null){
            root = node;
            num_items++;
            return;
        }

        if(node.compareTo(node_parent) < 0)
            node_parent.left_child = node;
        else
            node_parent.right_child= node;

        node.parent = node_parent;
        num_items++;
    }

    public void delete(T element){
        BSTNode<T> node = findNode(element);
        if(node == null)
            return;
        else
            delete(node);
    }

    protected void delete(BSTNode<T> node){

        BSTNode<T> parent = node.getParent();
        // case 1: node doesn't have a child, just delete it
        if(node.isLeaf()){
            if(parent != null){
                node.parent = null;
                if(parent.getLeft() == node)
                    parent.left_child = null;
                if(parent.getRight() == node)
                    parent.right_child = null;
            }else 
                root = null;
        }

        // case 2: node has only one child, splice the child with its parent
        else if(node.getLeft() == null || node.getRight() == null){
            BSTNode<T> current = node.getLeft() == null ?
                node.getRight(): node.getLeft();
            if(parent != null){
                if(parent.getLeft() == node)
                    parent.left_child = current;
                else
                    parent.right_child = current;
                
                // don't forgect set the parent
                if(current != null)
                    current.parent = parent; 
            }else{
                // the to be deleted node is root
                if(getRoot().getLeft() == node)
                    getRoot().left_child = null;
                if(getRoot().getRight() == node)
                    getRoot().right_child = null;
                root = node;
            }
        }

        // case 3: node has both children, set the successor of the node to its parent 
        /**
         * The successor will have at most one child 
         * The child must be a right child
         * Because if the child is left child
         * it will less than the successor
         * the successor will not be the mimnum of the right subtree
         */
        else{
            BSTNode<T> successor = findSuccessor(node);
            node.data = successor.data;// update the data portion

            // current can be null or not
            BSTNode<T> current = successor.getLeft() == null ?
                successor.getRight(): successor.getLeft();

            if(successor.getParent().getLeft() == successor){
                successor.parent.left_child = current;
            }
            else{
                successor.parent.right_child = current;
            }
            // don't  forgect set the parent
            if(current != null)
                current.parent = successor.parent;
        }

        num_items--;
    }
    
    public BSTNode<T> findMax(BSTNode<T> root){
        if(root == null)
            return null;
        if(root.getRight() != null)
            return findMax(root.getRight());
        return root;
    }

    public BSTNode<T> findMin(BSTNode<T> root){
        if(root == null)
            return null;
        if(root.getLeft() != null)
            return findMin(root.getLeft());
        return root;
    }

    public BSTNode<T> findSuccessor(BSTNode<T> node){
        if(node == null)
            return null;
        if(node.getRight() != null)
            return findMin(node.getRight());

        BSTNode<T> current = node;
        BSTNode<T> parent = node.getParent();
        while(parent != null && current == parent.getRight()){
            current = parent;
            parent = parent.getParent();
        }
        return parent;
    }

    public BSTNode<T> findPredecessor(BSTNode<T> node){
        if(node == null)
            return null;
        if(node.getLeft() != null)
            return findMax(node.getLeft());

        BSTNode<T> parent = node.getParent();
        BSTNode<T> current = node;
        while(parent != null && current == parent.getLeft()){
            current = parent;
            parent = parent.getParent();
        }
        return parent;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private int count = num_items;
            private BSTNode<T> root = BinarySearchTree.this.getRoot();

            public boolean hasNext(){
                return count-- > 0;
            }

            BSTNode<T> mimnum = BinarySearchTree.this.findMin(root);
            public T next(){
                BSTNode<T> res = mimnum;
                mimnum = BinarySearchTree.this.findSuccessor(mimnum);
                return res.data;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
