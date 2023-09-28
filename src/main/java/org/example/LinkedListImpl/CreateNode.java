package org.example.LinkedListImpl;

public class CreateNode {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        private int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public CreateNode(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            temp =temp.next;
        }
    }

    public void getHead(){
        System.out.println("HeadValue = "+ head.value);
    }
    public void getTail(){
        System.out.println("TailValue = "+ tail.value);
    }
    public void getLength(){
        System.out.println("Length = "+ length);
    }



}
