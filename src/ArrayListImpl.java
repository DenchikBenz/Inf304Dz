import java.util.Arrays;

public class ArrayListImpl implements List{
    private Integer[] elements = new Integer[10];

    private int size = 0;
    @Override
    public void add(Integer a) throws EmptyElementException {
        if (a == null){
            throw new EmptyElementException();
        }
        if (size < elements.length){
            elements[size++] = a;
        }
        else{
            Integer temp[] = new Integer[10*2];
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
        elements = Arrays.copyOf(elements, elements.length -1);
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index > elements.length){
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public Integer pop(){
        int current_elemnt = elements[size-1];
        size--;
        return current_elemnt;
    }
    public void next(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
    }
}
