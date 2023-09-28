package org.example.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

   public Node root;


    public class Node{
         public int value;
         public Node left;
         public Node right;

        public Node(int value) {
            this.value=value;
        }
    }

    public boolean insert(int value){
       Node newNode = new Node(value);
        if(root==null){
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true){
            if(newNode.value==temp.value) return false;
            if(newNode.value<temp.value){
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            else{
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }


    public boolean contains(int value){
        if(root==null)return false;
        Node temp =root;
        while(temp!=null){
            if(value==temp.value) return true;
            else if(value<temp.value) temp=temp.left;
            else temp=temp.right;
        }
        return false;
    }



    // Recurssive Binary Search Tree(rBST)

    private boolean contains(Node currentRoot,int value){
        if(currentRoot==null) return false;
        if(currentRoot.value == value) return true;
        else if(value<currentRoot.value) return contains(currentRoot.left,value);
        else return contains(currentRoot.right,value);
    }
    public boolean rContains(int value){
        return contains(root,value);
    }

    private Node insert(Node currentNode,int value ){
        if(currentNode==null) return new Node(value);
        if(value<currentNode.value){
             currentNode.left = insert(currentNode.left,value);
        }else if(value> currentNode.value){
             currentNode.right=insert(currentNode.right,value);
        }
        return currentNode;
    }
    public void rInsert(int value){
        if(root==null) root = new Node(value);
        insert(root,value);
    }

    private Node rdelete(Node currentNode ,int value){
        if(currentNode==null) return null;
        if(value< currentNode.value){
            currentNode.left = rdelete(currentNode.left,value);
        }
        else if(value> currentNode.value){
            currentNode.right=rdelete(currentNode.right,value);
        }
        else {
            if(currentNode.left==null && currentNode==null)
                return null;
            else if(currentNode.right==null){
                currentNode= currentNode.left;
            }
            else if(currentNode.left==null) {
                currentNode=currentNode.right;
            }
            else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value=subTreeMin;
                currentNode.right=rdelete(currentNode.right,subTreeMin);
            }
        }
        return currentNode;
    }
    private int minValue(Node currentNode){
        while(currentNode.left!=null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
    public void rDeleteNode(int value){
        rdelete(root,value);
    }





//Tree traversal

    //Breadth First Search(BFS).
    public ArrayList<Integer> BFS(){
        Node currentNode = root;
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(currentNode);

        while(queue.size() >0){
            currentNode = queue.remove();
            result.add(currentNode.value);
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }

        return result;
    }

    //Depth First Search PreOrder -
    public ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                result.add(currentNode.value);
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }


    //Depth First Search PostOrder -
    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){

                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.value);
            }
        }
        new Traverse(root);
        return result;
    }

    //Depth First Search InOrder -
    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){

                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.value);
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }


}
