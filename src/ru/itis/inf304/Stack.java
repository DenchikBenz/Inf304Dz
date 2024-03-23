package ru.itis.inf304;

public class Stack <T> {
    Node <T> head;
    Node<T> current = new Node <>(null);
    int size = 0;
    Node<T> tail;
    public void add(T e) throws EmptyElException {
        if (e == null) {
            throw new EmptyElException();
        }
        if (head == null) {
            head = new Node(e);
            tail = head;
            size = 1;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(e));
            tail = current.getNext();
            size++;
        }
    }
    public T pop(){
        int counter = 1;
        Node<T> res = head;
        while (counter < size - 1) {
            res = res.getNext();
            counter += 1;
        }
        size--;
        T p = res.getValue();
        return p;
    }
    public void push(Node<T> argum){
        Node<T> temp = head;
        head = argum;
        argum.setNext(temp);
        size++;
    }
    public void tstr(){
        int counter = 1;
        Node <T> track = head;
        while (counter <= size){
            System.out.print(track.getValue());
            System.out.print(" ");
            track = track.getNext();
            counter += 1;
        }
    }
}
