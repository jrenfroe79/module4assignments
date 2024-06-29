package m04assignment3;

import java.util.ListIterator;

public class TwoWayLinkedList<E> implements MyList<E> {
    public Node<E> head, tail;
    public int size = 0;

    

    @Override
    public void add(E e) {
        addLast(e);
    }

    private void addLast(E e) {
 
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public void remove(int index) {
     
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean contains(E e) {
		return false;
      
    }

    @Override
    public E get(int index) {
		return null;
       
    }

    @Override
    public int indexOf(E e) {
		return size;
       
    }

    @Override
    public int lastIndexOf(E e) {
		return size;
      
    }

    @Override
    public E set(int index, E e) {
		return e;
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ListIterator<E> listIterator() {
		return null;
		
       
    }

    @Override
    public ListIterator<E> listIterator(int index) {
		return null;
        
    }
}
