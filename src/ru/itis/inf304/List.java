package ru.itis.inf304;

public interface List <T>{
    void add(T e) throws EmptyElException;

    Object get(int index);

    int size();

    void delete(int index);
    /** Возвращаем последний элемент, и удаляем его из списка */
    Object pop();
}
