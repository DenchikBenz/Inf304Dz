public class Main {
    public static void main(String[] args) throws EmptyElementException, IndexOutOfBoundsException{
        LinkedList test = new LinkedList();
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(10);
        test.pop();
        test.delete(2);
        test.tstr();
        System.out.println();
        ArrayListImpl tst = new ArrayListImpl();
        tst.add(5);
        tst.add(6);
        tst.add(7);
        tst.add(10);
        tst.pop();
        tst.delete(2);
        tst.delete(1);
        tst.next();
    }
}