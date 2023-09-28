package org.example.LinkedListImpl;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    //method to add values in the list
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0 && head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeLast(){
        if(length == 0) System.out.println("list is null");
        else {
            Node temp = head;
            Node pre = head;
            while(temp.next!=null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length==0){
                head = null;
                tail = null;
            }
            System.out.println(temp.value);
        }
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void removeFirstValue(){
        if(length==0) System.out.println("list is null");
        else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length==0) tail=null;
        }
    }

    public Node get(int index){
        Node temp = head;
        if(length==0) System.out.println("list is null");
        else if(index > length-1 || index < 0) System.out.println("Please give a index within range of a list");
        else {
           for(int i=0;i<index;i++){
              temp= temp.next;
           }
            System.out.println(temp.value);
        }
        return temp;
    }

    public boolean set(int index,int value){
        if(length==0) System.out.println("list is null");
        else if(index > length-1 || index < 0) return false;
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            temp.value=value;
        }
        return true;
    }

    public boolean insert(int index,int value){
        if(length==0) System.out.println("list is null");
        else if(index > length|| index < 0) return false;
        else if(index == 0){
            prepend(value);
            return true;
        }
        else if(index == length){
            append(value);
            return true;
        }
        else{
            Node newNode = new Node(value);
            Node temp=get(index-1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
        }
        return true;

    }

    public void remove(int index){
        if(length==0) System.out.println("list is null");
        else if(index > length-1|| index < 0) System.out.println("please input correct index within list");
        else if(index == 0){
            removeFirstValue();
            System.out.println("Element removed");
        }
        else if(index == length-1){
            removeLast();
            System.out.println("Element removed");
        }
        else{
            Node prev = get(index-1);
            Node temp= get(index);
            prev.next = temp.next;
            temp.next = null;
            length--;
            System.out.println("Element removed");
        }
    }

    public void reverseList(){
        if(length==0) System.out.println("list is null");
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = temp.next;

        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before =temp;
            temp=after;
        }
    }


    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public void getHead(){
        System.out.println("HeadValue = "+ head.value);
    }
    public void getTail(){
        System.out.println("TailValue = "+ tail.value);
    }
    public void getLength(){
        System.out.println("Length = "+ length);}



}
