package org.fmz.autumn;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
    protected static class BSTNode<U extends Comparable<U>> extends TreeNode<U>{
        public BSTNode<U> left,
                          right;
        public BSTNode(U dt){
            super(dt);
        }

        public BSTNode(U dt, BSTNode<U> lt, BSTNode<U> rt){
            super(dt);
            left = lt; 
            right = rt;
        }
    }

    protected BSTNode<T> root;

    public void insert(T element){
        /*
        BSTNode<T> current = root,
                   nodePar = root,
                   node = new BSTNode<T>(element);
        if(null == root){
            root = node;
            return;
        }

        while(current != null){
            if(element.compareTo((Comparable)current.data) < 0){
                nodePar = current;
                current = current.left;
            }else{
                nodePar = current;
                current = current.right;
            }
        }

        if(element.compareTo((Comparable)nodePar.data) < 0)
            nodePar.left = node;
        else 
            nodePar.right = node;
        numItems++;
        */
        numItems++;
        insertHelper(root, element);
    }

    protected BSTNode<T> insertHelper(BSTNode<T> node, T element){
        if(node == null)
            node = new BSTNode<T>(element);
        if(element.compareTo((Comparable)node.data) < 0)
            node.left = insert(node.left, element);
        else
            node.right = insert(node.right, element);
        return node;
    }

    public T delete(T element){
    }

    protected BSTNode<T> deleteHelper(BSTNode<T> node, T element){
        if(null == node) throw new RuntimeException("Cann't delete.");
        else{
            if(element.compareTo((Comparable)node.data) < 0)
                node.left = deleteHelper(node.left, element);
            else{
                if(element.compareTo((Comparable)node.data) > 0)
                    node.left = deleteHelper(node.right, element);
                else{
                    if(node.left == null) return node.right;
                    else{
                        if(node.right == null) return node.left;
                        else{
                            node.data = retriveData(node.left);
                            node.left = deleteHelper(node.left, node.data);
                        }
                    }
                }
            }
        }
    }

    private T retriveData(BSTNode<T> node){
        while(node.right != null)
            node = node.right;
        return node.data;
    }
}
