package ru.itis.inf304;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws EmptyElException {
        Stack <String> test = new Stack<>();
        test.push(new Node<>("kEBAB"));
        test.push(new Node<>("kBAB"));
        test.push(new Node<>("kEAB"));
        test.tstr();
        Set <String> tst = new Set<>();
        tst.add("kEBAB");
        tst.add("kBAB");
        tst.add("kEAB");
        tst.add("kEAB");
        tst.next();
    }
}