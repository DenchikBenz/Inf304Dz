import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws EmptyElementException, IndexOutOfBoundsException{
        LinkedList test = new LinkedList();
        MyList<String> tst = new MyList<>();
        tst.add("Kamil");
        tst.add("Enikeev");
        Iterator<String> tst_1 = tst.iterator();
        System.out.println(tst_1.next());
        //tst_1.remove();
        System.out.println(tst_1.next());
        System.out.println(tst_1.next());

        tst_1 = tst.iterator();
        tst_1.forEachRemaining((s)-> System.out.println(s));
    }
}