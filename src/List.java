//списко из элементов типа Integer/null
//каждый элемент  обладает своим индексом
public interface List {
    void add(Integer a) throws  EmptyElementException;
    Integer get(int index) throws  IndexOutOfBoundsException;

    int size();

    void delete(int index) throws IndexOutOfBoundsException;

    Integer pop();
    //возвращаем последний элемент
}
