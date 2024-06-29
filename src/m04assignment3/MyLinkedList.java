package m04assignment3;

import java.util.ListIterator;



	public class MyLinkedList<E> implements MyList<E> {
	  private Node<E> head, tail;
	  private int size = 0; 

	  public MyLinkedList() {
	  }

	  public MyLinkedList(E[] objects) {
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]);
	  }

	  public E getFirst() {
	    if (size == 0) {
	      return null;
	    } else {
	      return head.element;
	    }
	  }

	  public E getLast() {
	    if (size == 0) {
	      return null;
	    } else {
	      return tail.element;
	    }
	  }

	  public void addFirst(E e) {
	    Node<E> newNode = new Node<>(e);
	    newNode.next = head;
	    if (head != null) {
	      head.previous = newNode;
	    }
	    head = newNode;
	    if (tail == null) {
	      tail = newNode;
	    }
	    size++;
	  }

	  public void addLast(E e) {
	    if (tail == null) {
	      head = tail = new Node<>(e);
	    } else {
	      Node<E> newNode = new Node<>(e);
	      tail.next = newNode;
	      newNode.previous = tail;
	      tail = newNode;
	    }
	    size++;
	  }

	  public void add(int index, E e) {
	   	  }

	  public E removeFirst() {
		return null;
	    
	  }

	  public E removeLast() {
		return null;
	    
	  }

	  public void remove(int index) {
	    
	  }

	  public String toString() {
		return null;
	    
	  }

	  public void clear() {
	    size = 0;
	    head = tail = null;
	  }

	  public boolean contains(Object e) {
	    
	    return true;
	  }

	  public E get(int index) {
	    
	    return null;
	  }

	  public int indexOf(Object e) {
	    
	    return 0;
	  }

	  public int lastIndexOf(E e) {
	    
	    return 0;
	  }

	  public E set(int index, E e) {
	   
	    return null;
	  }

	  public java.util.Iterator<E> iterator() {
	    return new LinkedListIterator();
	  }

	  private abstract class LinkedListIterator implements java.util.Iterator<E> {
	    private Node<E> current = head;

	    public boolean hasNext() {
	      return (current != null);
	    }

	
	  }

	@Override
	public void add(E e) {
		
		
	}

	@Override
	public int size() {
	
		return 0;
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
