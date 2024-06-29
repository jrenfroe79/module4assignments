package m04assignment3;

import java.util.ListIterator;

public interface MyList<E> {
    void add(E e);
    void add(int index, E e);
    void remove(int index);
    void clear();
    boolean contains(E e);
    E get(int index);
    int indexOf(E e);
    int lastIndexOf(E e);
    E set(int index, E e);
    int size();
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);
}
