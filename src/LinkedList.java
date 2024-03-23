public class LinkedList  implements List{
    Node head;
    Node current = new Node(-1);
    int size = 0;

    public void add(Integer e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (head == null) {
            head = new Node(e);
            current.next = head;
            size = 1;
        } else {
            Node current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            current.next = new Node(e);
            size += 1;
        }
    }

    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node res = head;
        while (counter != index) {
            res = res.next;
            counter += 1;
        }
        return res.value;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node res = head;
        while (counter != index - 1) { // знаем колличество
            res = res.next;
            counter += 1;
        }
        res.next = res.next.next;
        size--;
    }
    @Override
    public Integer pop(){
        int counter = 1;
        Node res = head;
        while (counter < size - 1) {
            res = res.next;
            counter += 1;
        }
        size--;
        return res.value;
    }
    public int size(){
        return size;
    }
    public void tstr(){
        int counter = 0;
        Node track = head;
        while (counter < size){
            System.out.print(track.value);
            System.out.print(" ");
            track = track.next;
            counter += 1;
        }
    }
}