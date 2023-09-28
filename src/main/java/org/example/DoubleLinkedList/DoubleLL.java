package org.example.DoubleLinkedList;

public class DoubleLL {
    private Node head;
    private Node tail;
    private int length;

    public void getLength() {
         System.out.println(length);
    }


    public static class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length==0 && head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void removeLast(){
        if(length == 0) System.out.println("list is null");

        if(length==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=tail;
            tail=temp.prev;
            tail.next=null;
            temp.prev=null;

        }
        length--;
    }


    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
       else {
            Node temp = head;
            newNode.next = head;
            temp.prev = newNode;
            head = newNode;
        }
        length++;
    }


    public void removeFirst() {
        if(length == 0) System.out.println("list is null");

        if(length==1){
            head=null;
            tail=null;
        }
        else {
            Node temp = head;
            head = temp.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
    }


    public Node get(int index) {
        if(length == 0) System.out.println("list is null");
        Node temp=null;
        if(index>length-1 || index<0) System.out.println("please provide correct index");
        else if(index<length/2){
            temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }}
        else{
            temp=tail;
            for(int i=length-1;i>index;i--){
                temp=temp.prev;
            }
        }
        System.out.println(temp.value);
        return temp;
    }


    public void set(int index,int value) {

        Node temp=get(index);
        if(temp!=null)temp.value = value;
    }


    public void insert(int index, int value) {
        Node newNode = new Node(value);
        if(index>length || index<0) System.out.println("please provide correct index");

        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else if(index==length) append(value);
        else if(index==0) prepend(value);
        else{
            Node before=get(index-1);
            Node after=get(index);
            before.next=newNode;
            newNode.prev=before;
            newNode.next=after;
            after.prev=newNode;
            length++;
        }

    }


    public void remove(int index) {
        if(index>length || index<0) System.out.println("please provide correct index");
        else if(index==0) removeFirst();
        else if(index==length-1) removeLast();
        else{
            /*Node before = get(index-1);
            Node after = get(index+1);
            Node temp = get(index);
            before.next = after;
            after.prev = before;
            temp.next=null;
            temp.prev=null;*/

            Node temp = get(index);
            temp.next.prev=temp.prev;
            temp.prev.next=temp.next;
            temp.next=null;
            temp.prev=null;
            length--;

        }
    }



    public void printDLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
