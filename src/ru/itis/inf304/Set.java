package ru.itis.inf304;

import java.util.Arrays;

public class Set <T>{
    private Object[] elements = new Object[10];
    int size = 0;
    private Boolean contains(T argument){
        for (int i = 0; i < elements.length;i ++ ){
            if (argument.equals((T) elements[i])){
                return true;
            }
        }
        return false;
    }
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
    }
    public void add(T a) throws EmptyElException {
        if (a == null) {
            throw new EmptyElException();
        }
        if (this.contains(a)) {
            System.out.print("Элемент уже в множестве");
        } else {
            if (size<elements.length) {
                    elements[size++] = a;
            }
            else{
                Object temp[] = new Object[10 * 2];
                for (int i = 0; i < elements.length; i++) {
                    temp[i] = elements[i];
                }
                elements = temp;
                elements[size++] = a;
            }
        }
    }
    public Object[] asList(){
       return Arrays.copyOf(elements, size);
    }
    public void next(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
    }
}
