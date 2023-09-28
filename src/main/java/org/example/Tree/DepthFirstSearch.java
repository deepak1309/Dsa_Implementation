package org.example.Tree;

import java.util.ArrayList;

public class DepthFirstSearch {

    public ArrayList<Integer> dfsPreOrder(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert((50));
        binarySearchTree.insert((60));
        binarySearchTree.insert((60));
        binarySearchTree.insert((65));
        binarySearchTree.insert((40));
        binarySearchTree.insert((45));
        return binarySearchTree.DFSPreOrder();

    }

    public ArrayList<Integer> dfsPostOrder(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert((50));
        binarySearchTree.insert((60));
        binarySearchTree.insert((60));
        binarySearchTree.insert((65));
        binarySearchTree.insert((40));
        binarySearchTree.insert((45));
        return binarySearchTree.DFSPostOrder();

    }

    public ArrayList<Integer> dfsInOrder(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert((50));
        binarySearchTree.insert((60));
        binarySearchTree.insert((60));
        binarySearchTree.insert((65));
        binarySearchTree.insert((40));
        binarySearchTree.insert((45));
        return binarySearchTree.DFSInOrder();

    }
}
