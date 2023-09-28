package org.example.StackAndQueue;

public class Stack {
    private Node top;
    private int height;

    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top=newNode;
        height=1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(top==null && height==0){
            top =newNode;
            height=1;
        }
        else{
            newNode.next=top;
            top=newNode;
            height++;
        }

    }

    public void pop(){
        if(top==null && height==0){
            System.out.print("No element to delete from stack");
        }
        else{
            Node temp=top;
            top=temp.next;
            temp.next=null;
            height--;
        }
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getTop(){
        System.out.println("Top - "+top.value);
        }

    public void getHeight(){
        System.out.println("Stack Height - "+height);
    }
}
