package org.fmz.autumn;

import java.util.*;

public abstract class BinaryTree<T> extends TreeContainer<T>{
    protected static class TreeNode<U> extends Node<U>{
        public TreeNode<U> left,
                           right;
        public TreeNode(U dt){
            super(dt);
        }

        public TreeNode(U dt, TreeNode<U> lt, TreeNode<U> rt){
            super(dt);
            left = lt;
            right = rt;
        }
    }

    protected TreeNode<T> root; 

    public int height(){
        //return heightHelper(root, 0);
        return heightHelper(root);
    }

    protected int heightHelper(TreeNode<T> current, int h){
        if(null == current)
            return h;
        return Math.max(heightHelper(current.left, h + 1), heightHelper(current.right, h + 1));
    }

    protected int heightHelper(TreeNode<T> node){
        if(null == node)  
            return 0;

        LinkedList<TreeNode<T>> q = new LinkedList<>();
        q.add(node);
        int h = 0;

        while(true){
            int nodeCount = q.size();
            if(nodeCount == 0)
                return h;
            h++;
            while(nodeCount > 0){
                TreeNode<T> newNode = q.remove();
                if(newNode.left != null)
                    q.add(newNode.left);
                if(newNode.right != null)
                    q.add(newNode.right);
                nodeCount--;
            }
        }
    }

    public void inorderTraverse(){
        inorder(root);
    }

    protected void inorder(TreeNode<T> root){
        if(root != null){
            if(root.left != null)
                System.out.println(root.left.data);
            System.out.println(root.data);
            if(root.right!= null)
                System.out.println(root.right.data);
        }
    }

    public void preorderTraverse(){
        preorder(root);
    }

    protected void preorder(TreeNode<T> root){
        if(root != null){
            System.out.println(root.data);
            if(root.left != null)
                System.out.println(root.left.data);
            if(root.right != null)
                System.out.println(root.right.data);
        }
    }
    
    public void postorderTraverse(){
        postorder(root);
    }

    protected void postorder(TreeNode<T> root){
        if(root != null){
            if(root.left != null)
                System.out.println(root.left.data);
            if(root.right != null)
                System.out.println(root.right.data);
            System.out.println(root.data);
        }
    }
}
