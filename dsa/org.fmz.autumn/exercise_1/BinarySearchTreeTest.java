package org.fmz.autumn;

import java.util.Random;
import static org.fmz.autumn.BinarySearchTree.BSTNode;

public class BinarySearchTreeTest{

    private static Random rnd = new Random(26);

    public static <T> void display(BinarySearchTree<T> bst){
        BSTNode<T> root = bst.getRoot();
        System.out.println("Root: " + root);
        BSTNode<T> minimum = bst.findMin(root);
        System.out.println("Minimum: " + minimum);
        BSTNode<T> maximum = bst.findMax(root);
        System.out.println("Maximum: " + maximum);
    }

    // Test for iterable
    public static <T> void inorder(BinarySearchTree<T> bst){
        for(T t : bst)
            System.out.print(t + ", ");
        System.out.println();
    }
    public static void main(String... args){
        BinarySearchTree<Integer> bst_I = new BinarySearchTree<>();
        bst_I.insert(new Integer(12));
        bst_I.insert(new Integer(5));
        bst_I.insert(new Integer(3));
        bst_I.insert(new Integer(1));
        bst_I.insert(new Integer(7));
        bst_I.insert(new Integer(6));
        bst_I.insert(new Integer(9));
        bst_I.insert(new Integer(8));
        bst_I.insert(new Integer(11));
        bst_I.insert(new Integer(15));
        bst_I.insert(new Integer(13));
        bst_I.insert(new Integer(14));
        bst_I.insert(new Integer(17));
        bst_I.insert(new Integer(20));
        bst_I.insert(new Integer(18));
        System.out.println("Display the whole tree:");
        display(bst_I);
        inorder(bst_I);
        System.out.println("###############");
        
        // Test for inorder preorder and postorder
        System.out.println("Inorder traverse:");
        bst_I.inorderTraverse(new ConsoleOutput());
        System.out.println();
        System.out.println("***************");

        System.out.println("Preorder traverse:");
        bst_I.preorderTraverse(new ConsoleOutput());
        System.out.println();
        System.out.println("***************");
        
        System.out.println("Postorder traverse:");
        bst_I.postorderTraverse(new ConsoleOutput());
        System.out.println();
        System.out.println("###############");

        BinarySearchTree<Character> bst_C = new BinarySearchTree<>();
        bst_C.insert(new Character('m'));
        bst_C.insert(new Character('E'));
        bst_C.insert(new Character('r'));
        bst_C.insert(new Character('9'));
        bst_C.insert(new Character('d'));
        bst_C.insert(new Character('h'));
        bst_C.insert(new Character('A'));
        bst_C.insert(new Character('2'));
        bst_C.insert(new Character('v'));
        bst_C.insert(new Character('I'));
        bst_C.insert(new Character(' '));
        bst_C.insert(new Character('z'));
        bst_C.insert(new Character('R'));
        bst_C.insert(new Character('4'));
        bst_C.insert(new Character('G'));
        System.out.println("Display the whole tree:");
        display(bst_C);
        inorder(bst_C);
        System.out.println("***************");

        BinarySearchTree<String> bst_S = new BinarySearchTree<>();
        bst_S.insert("fagma");
        bst_S.insert("gaga");
        bst_S.insert("agaga");
        bst_S.insert("Mdaga");
        bst_S.insert("kajga");
        bst_S.insert("oagaga");
        bst_S.insert("pgaga");
        bst_S.insert("tgag");
        bst_S.insert("232534");
        bst_S.insert("Lgalkll");
        bst_S.insert("Naga");
        bst_S.insert("fagma");
        bst_S.insert("Qgaga");
        bst_S.insert("Bbkaga");
        bst_S.insert("Yddaga");
        bst_S.insert("wwww");
        bst_S.insert("Halt");
        System.out.println("Display the whole tree:");
        display(bst_S);
        inorder(bst_S);
        System.out.println("***************");

        bst_I.delete(Integer.valueOf(13));
        System.out.println("After delete Integer_13:");
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");

        bst_I.delete(Integer.valueOf(14));
        System.out.println("After delete Integer_14:");
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");

        bst_I.delete(bst_I.getRoot());
        System.out.println("After delete root:");
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");

        bst_I.delete(bst_I.getRoot());
        System.out.println("After delete root:");
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");

        bst_I = new BinarySearchTree();
        for(int i = 0; i < 30; i++)
            bst_I.insert(Integer.valueOf(rnd.nextInt(10)));
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");

        // Test for eges
        bst_I = new BinarySearchTree<>();
        bst_I.insert(new Integer(10));
        bst_I.insert(new Integer(2));
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");
        bst_I.delete(Integer.valueOf(2));
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");
        bst_I.delete(Integer.valueOf(10));
        display(bst_I);
        inorder(bst_I);
        System.out.println("***************");
        
        // Test for the NodeProcessor interface
        bst_I = new BinarySearchTree();
        for(int i = 0; i < 30; i++)
            bst_I.insert(Integer.valueOf(rnd.nextInt(20)));
        display(bst_I);
        System.out.println("Inorder traverse:");
        bst_I.inorderTraverse(new ConsoleOutput());
        System.out.println();
        System.out.println("***************");

        System.out.println("Preorder traverse:");
        bst_I.preorderTraverse(new ConsoleOutput());
        System.out.println();
        System.out.println("***************");
        
        System.out.println("Postorder traverse:");
        bst_I.postorderTraverse(new ConsoleOutput());
        System.out.println();
        System.out.println("***************");
    }
}
