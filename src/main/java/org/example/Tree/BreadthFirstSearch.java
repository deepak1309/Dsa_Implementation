package org.example.Tree;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BreadthFirstSearch {

    public ArrayList<Integer> bfs(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert((50));
        binarySearchTree.insert((60));
        binarySearchTree.insert((60));
        binarySearchTree.insert((65));
        binarySearchTree.insert((40));
        binarySearchTree.insert((45));
        return binarySearchTree.BFS();

    }
}
