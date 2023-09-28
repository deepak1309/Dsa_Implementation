package org.example.StackAndQueue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }

    public void enQueue(int value){
        Node newNode = new Node(value);

        if(first==null && length==0) {
            first=newNode;
            last=newNode;
        }
        else{
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    public void deQueue(){
        if(first==null && length==0) System.out.print("No elements in queue to delete");
        else if(length==1){
            first=null;
            last=null;
            length--;
        }
        else{
            Node temp = first;
            first=first.next;
            temp.next=null;
            length--;
        }
    }

    public void getFirst(){
        System.out.println("first - "+first.value);
    }

    public void getLast(){
        System.out.println("last - "+last.value);
    }

    public void getLength(){
        System.out.println("length - "+length);
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
