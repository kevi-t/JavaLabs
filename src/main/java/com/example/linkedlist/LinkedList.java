package com.example.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void  addLast(int item){
       var node = new Node(item);

       if (isEmpty()){
           first = node;
           last = node;
       }
       else {
           // linking to new
           last.next = node;
           // point to new node
           last =node;
       }
    }

    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = node;
            last = node ;
        }
        else {
            node.next =first;
            first = node;
        }

    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public  void removeFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if ( first == last){
            first = last = null;
            return;
        }
        var secondNode = first.next;
        first.next = null;
        first = secondNode;
    }

    public void removeLast(){
        if (isEmpty())
            throw  new NoSuchElementException();
        if (first == last){
            first = last = null;
            return;
        }
        var previousNode = getPrevious(last);
        last = previousNode;
        last.next = null;

    }
    private Node getPrevious (Node node){
        var currentNode = first;
        while (currentNode != null){
            if (currentNode.next == node) return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }
}