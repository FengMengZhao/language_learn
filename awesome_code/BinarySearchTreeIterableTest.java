package org.fmz.awesome;

import java.util.Random;

public class BinarySearchTreeIterableTest{

    private static Random rnd = new Random(26);

    public static void display(BinarySearchTreeIterable bst){
        TreeNode root = bst.getRoot();
        TreeNode minimum = bst.findMin(root);
        TreeNode maximum = bst.findMax(root);
        System.out.println("Root: " + root);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }

    /*
    public static void inorder(BinarySearchTreeIterable bst){
        TreeNode minimum = bst.findMin(bst.getRoot());
        while(minimum != null){
            System.out.print(minimum + ", ");
            minimum = bst.findSuccessor(minimum);
        }
        System.out.println();
    }
    */
    public static void main(String... args){
        BinarySearchTreeIterable bst = new BinarySearchTreeIterable();
        bst.insert(new TreeNode(12));
        bst.insert(new TreeNode(5));
        bst.insert(new TreeNode(3));
        bst.insert(new TreeNode(1));
        bst.insert(new TreeNode(7));
        bst.insert(new TreeNode(6));
        bst.insert(new TreeNode(9));
        bst.insert(new TreeNode(8));
        bst.insert(new TreeNode(11));
        bst.insert(new TreeNode(15));
        TreeNode element_13 = new TreeNode(13);
        TreeNode element_14 = new TreeNode(14);
        bst.insert(element_13);
        bst.insert(element_14);
        bst.insert(new TreeNode(17));
        bst.insert(new TreeNode(20));
        bst.insert(new TreeNode(18));

        System.out.println("Display the whole tree:");
        display(bst);
        for(TreeNode tn : bst)
            System.out.print(tn + ", ");
        System.out.println("***************");

        bst.delete(element_13);
        System.out.println("After delete element_13:");
        display(bst);
        for(TreeNode tn : bst)
            System.out.print(tn + ", ");
        System.out.println("***************");

        bst.delete(element_14);
        System.out.println("After delete element_14:");
        display(bst);
        //inorder(bst);
        for(TreeNode tn : bst)
            System.out.print(tn + ", ");
        System.out.println("***************");

        bst.delete(bst.getRoot());
        System.out.println("After delete root:");
        display(bst);
        for(TreeNode tn : bst)
            System.out.print(tn + ", ");
        //inorder(bst);
        System.out.println("***************");

        bst.delete(bst.getRoot());
        System.out.println("After delete root:");
        display(bst);
        for(TreeNode tn : bst)
            System.out.print(tn + ", ");
        //inorder(bst);
        System.out.println("***************");

        bst = new BinarySearchTreeIterable();
        for(int i = 0; i < 10; i++)
            bst.insert(new TreeNode(rnd.nextInt(5)));
        display(bst);
        for(TreeNode tn : bst)
            System.out.print(tn + ", ");
        //inorder(bst);
    }
}
