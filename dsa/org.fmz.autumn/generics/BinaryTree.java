/*
 * what is the difference between static and non-static nested classes;
 *
 * A non-static nested class has full access to the members of the class within it is nested
 * A static nested class does not have reference to a nesting instance
 * So a static nested class can not invoke non-static methods... 
 * or access non-static fields of an instance of the class within which it is nested
 * 
 *
 * A non-static nested class is also called inner clas
 *
 * When you want to create an object of innner class, you must use the syntax:
 * OuterClass.InnerClass obj = OuterClass.new InnerClass();// use the "OuterClass.new"
 *
 * When you want to invoke method of OuterClass from InnerClass, you must use the syntax to...
 * get the OuterClas reference:
 * OuterClas.this.method();// "OuterClas.this" is the reference of the OuterClas
 *
 */
package org.fmz.autumn;

public abstract class BinaryTree<T> extends TreeContainer<T>{

    protected static abstract class BinaryTreeNode<U> extends Node<U>{

        public BinaryTreeNode<U> left_child,
                                 right_child,
                                 parent;

        public BinaryTreeNode(U data){
            super(data);
        }

        public BinaryTreeNode(U data, BinaryTreeNode<U> lc,
                                      BinaryTreeNode<U> rc,
                                      BinaryTreeNode<U> par){
            super(data);
            left_child = lc;
            right_child = rc;
            parent = par;
        }

        public boolean isLeaf(){
            return left_child == null && right_child == null;
        }

        public String toString(){
            return data.toString();
        }
    };

    public interface NodeProcessor<E>{
        void processNode(BinaryTreeNode<E> node);
    }

    protected int heightHelper(BinaryTreeNode<T> current, int ht){
        if(current == null)
            return ht;
        return Math.max(heightHelper(current.left_child, ht + 1),
                        heightHelper(current.right_child, ht + 1));

    }

    public int height(){
        return heightHelper((BinaryTreeNode<T>)root, -1);
    }

    protected void inorder(BinaryTreeNode<T> node, 
                           NodeProcessor<T> processor){
        if(node != null)
            //System.out.println("node.left_child: " + node.left_child + " ####");
            inorder(node.left_child, processor);
        processor.processNode(node);
        if(node != null)
            inorder(node.right_child, processor);
    }

    public void inorderTraverse(NodeProcessor<T> processor){
        //System.out.println("root: " + (BinaryTreeNode<T>)root + " ####");
        inorder((BinaryTreeNode<T>)root, processor);
    }

    protected void postorder(BinaryTreeNode<T> node,
                             NodeProcessor<T> processor){
        if(node != null){
            postorder(node.left_child, processor);
            postorder(node.right_child, processor);
        }
        processor.processNode(node);
    }

    public void postorderTraverse(NodeProcessor<T> processor){
        postorder((BinaryTreeNode<T>)root, processor);
    }

    protected void preorder(BinaryTreeNode<T> node,
                            NodeProcessor<T> processor){
        processor.processNode(node);
        if(node != null){
            preorder(node.left_child, processor);
            preorder(node.right_child, processor);
        }
    }

    public void preorderTraverse(NodeProcessor<T> processor){
        preorder((BinaryTreeNode<T>)root, processor);
    }

}
