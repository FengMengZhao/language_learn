package org.fmz.autumn;

import java.util.Iterator;

public class BinarySearchTree<T> extends BinaryTree<T>{
    protected static class BSTNode<U> extends BinaryTreeNode<U> implements Comparable<BSTNode<U>>{
        public BSTNode(U dt){ super(dt); }

        public BSTNode<U> getLeft(){
            return (BSTNode<U>)left_child;
        }

        public BSTNode<U> getRight(){
            return (BSTNode<U>)right_child;
        }

        public BSTNode<U> getParent(){
            return (BSTNode<U>)parent;
        }

        @SuppressWarnings("unchecked")
        public int compareTo(BSTNode<U> node){
            return ((Comparable)data).compareTo((Comparable)node.data);
        }
    }

    public BSTNode<T> getRoot(){
        return (BSTNode<T>)root;
    }

    public BSTNode<T> findNode(T element){
        BSTNode<T> node = new BSTNode<T>(element);
        BSTNode<T> current = (BSTNode<T>)root;
        for(; current != null; ){
            if(node.compareTo(current) < 0)
                current = current.getLeft();
            else if (node.compareTo(current) > 0)
                current = current.getRight();
            else
                return current;
        }

        return null;
    }

    public void insert(T element){
        BSTNode<T> node = new BSTNode<>(element);
        BSTNode<T> current,
                   node_parent;
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

        if(node_parent == null){
            root = node;
            numItems++;
            return;
        }

        if(node.compareTo(node_parent) < 0)
            node_parent.left_child = node;
        else
            node_parent.right_child = node;
        node.parent = node_parent;
        numItems++;
    }

    public void delete(T element){
        delete(findNode(element));
    }

    public void delete(BSTNode<T> node){
        if(node == null)
            return;

        BSTNode<T> parent = node.getParent();
        /*
         * Case 1: node is a leaf
         * If node has parent
         *   Just set the parent's left child or right child to be null
         * If node has no parent, then tree contains a single root
         *   Just set root to be null 
         */
        if(node.isLeaf()){
            if(parent != null){
                if(parent.getLeft() == node)// The node is a leftChild?
                    parent.left_child = null;
                else// If not, is a right child
                    parent.right_child = null;
            }else root = null;
        }
        /*
         * Case 2: node has a left child or a right child
         * If node has parent
         *   Just set the node's parent's left child or right child to be the node's child
         *   And set the node's child's parent to be node's parent
         * If node has no parent, then the tree only contains a root and the root's one child
         *   Just set node to be root
         */
        else if(node.left_child == null || node.right_child == null){
            BSTNode<T> current = node.left_child == null ? node.getRight()
                                                         : node.getLeft();// must not be null
            if(parent != null){
                if(parent.getLeft() == node)
                    parent.left_child = current;
                else
                    parent.right_child = current;

                current.parent = parent;
            }else node = getRoot();

        /*
         * Case 3: the node has both left child and right child, then the successor is critical point
         * The successor is a left child or a right child
         * First set the node data to be the successor's data
         * Then delete the successor 
         *   If the successor at most only has one right child, not possible has a left child
         *   Then, turn to case 1 or case 2
         */
        }else{
            BSTNode<T> successor = findSuccessor(node);
            T data = successor.data;
            node.data = data;

            BSTNode<T> current = successor.right_child == null ? null
                                                               : successor.getRight();// is null or not
            if(successor.getParent().getLeft() == successor)
                successor.parent.left_child = current;
            else
                successor.parent.right_child = current;
            // Chechk whether the successor has a child or not
            if(current != null)
                current.parent = successor.parent;
        }
        numItems--;
    }
    
    /*
     * Find the tree's rightchild
     * There is some trick, when you want to change the current, use another node keep the current state before change
     */
    public BSTNode<T> findMax(BSTNode<T> node){
        BSTNode<T> current,
                   target;
        current = target = node;
        while(current != null){
            target = current;
            current = current.right_child == null ? null : current.getRight();
        }

        return target;
    }

    /*
     * Find the tree's leftchild
     * There is some trick, when you want to change the current, use another node keep the current state before change
     */
    protected BSTNode<T> findMin(BSTNode<T> node){
        BSTNode<T> current,
                   target;
        current = target = node;
        while(current != null){
            //System.out.println("####");
            target = current;
            current = current.left_child == null ? null : current.getLeft();
        }

        return target;
    }

    public BSTNode<T> minimum(){
        return findMin(getRoot());
    }

    /*
     * In order traverse, the just next node to travel
     * If the node has the right child, then the next node is the right child
     * Otherwise, find the node's parent until the node is not a right child
     */
    protected BSTNode<T> findSuccessor(BSTNode<T> node){
        if(node == null)
            return null;

        if(node.right_child != null)
            return findMin(node.getRight());

        BSTNode<T> current = node;
        BSTNode<T> parent = node.getParent();
        //System.out.println("#### " + node + " ####");
        while(parent != null && parent.getRight() == current){// Check the nod is whether a right child or not
            current = parent;
            parent = parent.getParent();
        }
        return parent;
    }

    public BSTNode<T> maximum(){
        return findMax(getRoot());
    }

    /*
     * In order traverse, the just previous node to travel
     * If the node has the left child, then the next node is the left child
     * Otherwise, find the node's parent until the node is not a left child
     */
    public BSTNode<T> findPredecessor(BSTNode<T> node){
        if(node.left_child != null)
            return findMax(node.getLeft());

        BSTNode<T> current = node;
        BSTNode<T> parent = node.getParent();
        while(parent != null && parent.getLeft() == current){
            current = parent;
            parent = parent.getParent();
        } 
        return parent;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private int count = numItems;

            public boolean hasNext(){
                return count-- > 0;
            }

            private BSTNode<T> minimum = BinarySearchTree.this.findMin((BSTNode<T>)root);
            public T next(){
                BSTNode<T> res = minimum;
                minimum = BinarySearchTree.this.findSuccessor(minimum);
                //System.out.println("#### " + res + "####");
                return res.data;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
