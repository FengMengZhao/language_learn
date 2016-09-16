package org.fmz.autumn;

import static org.fmz.autumn.BinaryTree.BinaryTreeNode;

public class ConsoleOutput<T> implements BinaryTree.NodeProcessor<T>{
    public void processNode(BinaryTreeNode<T> node){
        if(node != null)
            System.out.print(node.data + ", ");
    }
}
