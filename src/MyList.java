import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<T> implements Iterable<T> {
    private Object[] elements = new Object[10];
    private boolean changeAddFlag = false;
    private boolean changeDelFlag = false;

    private int size = 0;
    public void add(T a) throws EmptyElementException {
        if (a == null){
            throw new EmptyElementException();
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
        changeAddFlag = false;

    }
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements = Arrays.copyOf(elements, elements.length -1);
        size--;
        changeDelFlag = false;
    }
    public int size() {
        return size;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index > elements.length){
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public T pop(){
        T current_elemnt =(T) elements[size-1];
        size--;
        return (T)current_elemnt;
    }
    public void next(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
    }
    public Iterator<T> iterator(){
        return new MyIterator<T>();
    }

    private class MyIterator<T> implements Iterator<T>{
        private int i;
        private boolean nextCalled = false;
        public MyIterator(){
            changeDelFlag = true;
            changeAddFlag = true;
            i = 0;
        }
        public boolean hasNext(){
            if (!changeAddFlag || !changeDelFlag ){
                throw new IllegalStateException();
            }
            return i < size;
        }
        public T next(){
            if (!changeAddFlag || !changeDelFlag ){
                throw new IllegalStateException();
            }
            if (hasNext()){
                nextCalled = true;
                return (T)elements[i++];
            }else {
                throw new NoSuchElementException();
            }
        }
        public void remove(){
            if (!changeAddFlag || !changeDelFlag ){
                throw new IllegalStateException();
            }
            delete(i);
        }

    }
}
