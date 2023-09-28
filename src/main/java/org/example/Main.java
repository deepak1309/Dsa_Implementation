package org.example;

import org.example.DoubleLinkedList.DoubleLL;
import org.example.Graph.Graph;
import org.example.HashTable.HashTable;
import org.example.Heap.Heap;
import org.example.LinkedListImpl.CreateNode;
import org.example.LinkedListImpl.LinkedList;
import org.example.SortingAlgorithms.*;
import org.example.StackAndQueue.Queue;
import org.example.StackAndQueue.Stack;
import org.example.Tree.BinarySearchTree;
import org.example.Tree.BreadthFirstSearch;
import org.example.Tree.DepthFirstSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

// Linked list ----
       /* CreateNode node = new CreateNode(2);
        CreateNode node1 = new CreateNode(3);
        node.getHead();
        node.getTail();
        node.getLength();
*/

      /*  LinkedList list = new LinkedList();

        //to add values in the list
        list.append(1);
        list.append(2);
        list.append(3);
      //  list.append(6);
        list.append(8);*/

        /*//to print list
        list.printList();
        list.getLength();*/

     /*   //to remove last element from list
        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.printList();*/

       /* //to add value int start of a list
        list.prepend(11);
        list.printList();
        list.getLength();*/

       /* //remove first value from list
        list.removeFirstValue();
        list.printList();
        list.getLength();*/


        /*//get the value from list for the index given
        list.get(2);
        list.getLength();*/

        /*//set the value in list for the index given in list
        boolean result = list.set(-22,11);
       System.out.println(result);
        list.getLength();
        list.printList();*/

       /* //insert newNode(value) inside the list at given index
        boolean result = list.insert(3,3);
        System.out.println(result);
        list.printList();
        list.getLength();*/

        /*//remove node(value) from the list at given index
        list.remove(2);
        list.printList();
        list.getLength();*/

       /* //reverse the list
        list.reverseList();
        list.printList();
        list.getLength();*/


// Doubly Linked List ----
       /* //to add values in the doubly linked list(dobleLL)
        DoubleLL doublell = new DoubleLL();
        doublell.append(1);
        doublell.append(3);
        doublell.append(4);
        doublell.append(2);
       // doublell.append(1);
        doublell.printDLL();
        doublell.getLength();
        System.out.println("-----------------------");*/

        /*//to remove last value from doubleLL
        doublell.removeLast();
        doublell.removeLast();
        doublell.printDLL();
        doublell.getLength();*/

        /*//to prepend(add a value in first) from doubleLL
        doublell.prepend(11);
        doublell.printDLL();
        doublell.getLength();*/

       /* //to remove first element from doublell
        doublell.removeFirst();
        doublell.printDLL();
        doublell.getLength();*/

       /* //to get a value anywere in doublll with respect to given indexes
        DoubleLL.Node result=doublell.get(3);
        System.out.println(result.toString());*/

        /*//to set a value anywere in doublell with respect to given index
        doublell.set(4,12);
        doublell.printDLL();
        doublell.getLength();*/

        /*//to insert a newNode at index anywere in between doublell
        doublell.insert(4,11);
        doublell.printDLL();
        doublell.getLength();*/

//        //to remove a node at given index anywere in between doublell
//        doublell.remove(4);
//        doublell.printDLL();
//        doublell.getLength();


//Stack (Last In First Out) -----
         /* Stack stack = new Stack(2);
          stack.getTop();
          stack.getHeight();
          stack.printStack();
          System.out.println("--------------------------");

          //push a element inside stack
          stack.push(1);
          stack.push(3);
          stack.push(5);
          stack.getTop();
          stack.getHeight();
          stack.printStack();
          System.out.println("--------------------------");

          //pop a element from stack
          stack.pop();
          stack.pop();
          stack.pop();
          stack.pop();
          stack.getTop();
          stack.getHeight();
          stack.printStack();*/

//Queue(First In First Out)  ----------------------------------------------------
       /* Queue queue = new Queue(1);
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.printQueue();
        System.out.println("--------------------------");

        //enqueue a value in a Queue
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.printQueue();
        System.out.println("--------------------------");

        //dequeue a value in a Queue
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.printQueue();*/



//Implementing Binary Search Tree
       /* //inserting a value inside BST
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        binarySearchTree.insert((50));
        binarySearchTree.insert((60));
        binarySearchTree.insert((60));
        binarySearchTree.insert((65));
        binarySearchTree.insert((40));
        binarySearchTree.insert((45));

        System.out.println(binarySearchTree.root.right.right.value);

        //checking whether the value provided is it present inside tree or not
        System.out.println(binarySearchTree.contains(70));
        System.out.println("-------------------------------------------");*/


    /*//Tree traversal - BFS.
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        System.out.println(bfs.bfs());
        System.out.println("-------------------------------------------");

        DepthFirstSearch dfs = new DepthFirstSearch();
        System.out.println(dfs.dfsPreOrder());
        System.out.println("-------------------------------------------");
        System.out.println(dfs.dfsPostOrder());
        System.out.println("-------------------------------------------");
        System.out.println(dfs.dfsInOrder());
        System.out.println("-------------------------------------------");*/


  /*  //Recurssive Binary Search tree
        //checking whether the value provided is it present inside tree or not using rBST.
        System.out.println(binarySearchTree.rContains(40));

        binarySearchTree.rInsert((75));
        System.out.println("rbst  "+binarySearchTree.root.right.right.value);

        binarySearchTree.rDeleteNode((65));
        System.out.println("rbst delete  "+binarySearchTree.root.right.right.value);*/




//Implementing Hash Table
       /* HashTable table = new HashTable();
        table.printTable();
        System.out.println();

        //seting values in hastable
        table.set("arun",2);
        table.set("ajay",22);
        table.set("tanuj",23);
        table.set("aman",222);
        table.set("deepak",44);
        table.set("sushaant",54);
        table.set("chris",33);
        table.printTable();
        System.out.println("-------------------------------------------");

        //getting value for the key passed
        System.out.println("the value for the passed key is : "+table.get("aman"));
        System.out.println("-------------------------------------------");

        //Getting all keys of hashTable
        System.out.println(table.getAllKeys());*/



//Implementing Graph using adjacency list
        /*Graph myGraph = new Graph();

        //to add a vertex inside graph
        System.out.println(myGraph.addVertex("A"));
        System.out.println(myGraph.addVertex("B"));
        System.out.println(myGraph.addVertex("C"));
        myGraph.printGraph();
        System.out.println("-------------------------------------------");


        //to add a edge inside graph
        System.out.println(myGraph.addEdge("A","B"));
        System.out.println(myGraph.addEdge("B","C"));
        System.out.println(myGraph.addEdge("C","A"));
        myGraph.printGraph();
        System.out.println("-------------------------------------------");


        //to remove a edge inside graph
        System.out.println(myGraph.removeEdge("A","C"));
        myGraph.printGraph();
        System.out.println("-------------------------------------------");


        //to remove a vertex inside graph
        System.out.println(myGraph.removeVertex("C"));
        myGraph.printGraph();

*/



//Implementing heap using arrayList
       /* Heap heap = new Heap();
        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        System.out.println(heap.getHeap());

        heap.insert(50);
        System.out.println(heap.getHeap());

        heap.insert(65);
        System.out.println(heap.getHeap());
        System.out.println("-------------------------------------------");

        heap.remove();
        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());
        System.out.println("-------------------------------------------");*/




//Sorting Algorithms

        //Bubble Sort
        /*BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {4,2,6,5,1};
        bubbleSort.bubblesort(arr);
        System.out.print(Arrays.toString(arr));*/

        /*//Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        int arr[] = {4,2,6,5,1,7};
        selectionSort.selectionSort(arr);
        System.out.print(Arrays.toString(arr));*/

        //Insertion Sort
      /*  InsertionSort insertionSort = new InsertionSort();
        int arr[] = {4,2,6,5,1,7};
        insertionSort.insertionSort(arr);
        System.out.print(Arrays.toString(arr));*/


        //Merge Sort -> TC - O(n logn) & SC - O(n).
        /*MergeSort mergeSort = new MergeSort();
        int arr[] = {4,2,6,5,1,7};
        System.out.print(Arrays.toString(mergeSort.mergeSort(arr)));*/

        //Quick Sort -> SC - O(1) && TC - BestCase-O(n logn) &
        // WorstCase- when the array is already sorted in this case it is O(n^2).
        /*QuickSort quicksort= new QuickSort();
        int arr[] = {4,2,6,5,1,7};
        quicksort.quickSort(arr);
        System.out.print(Arrays.toString(arr));*/












    }
}