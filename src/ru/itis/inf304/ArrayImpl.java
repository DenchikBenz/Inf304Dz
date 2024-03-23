package ru.itis.inf304;

public class ArrayImpl<T> implements List<T>{
    private Object[] elements = new Object[10];

    private int size = 0;
    @Override
    public void add(T a) throws EmptyElException {
        if (a == null){
            throw new EmptyElException();
        }
        if (size < elements.length){
            elements[size++] = a;
        }
        else{
            Object temp[] = new Object[10*2];
            for (int i = 0; i < elements.length; i++){
                temp[i] = elements[i];
            }
            elements = temp;
            elements[size++] = a;
        }
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index > elements.length){
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    @Override
    public T pop(){
        return (T)elements[size--];
    }
    public void next(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
    }
 }
