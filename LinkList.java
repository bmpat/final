/**
 * 
 */

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @author Brandon Patrick
 */
public class LinkList<E> implements List<E> {

	public Link firstLink;
	
	public LinkList() {
		firstLink = null;
	}
	
	public class Link {
		
		private E item;
		
		private Link next;
		
		public void setItem(E item) { //setters and getters
			this.item = item;
		}
		
		public E getItem() {
			return item;
		}
		
		public void setNextLink(Link next) {
			this.next = next;
		}
		
		public Link getNextLink() {
			return next;
		}
		
		public void display() {
			System.out.println(item.toString());
		}
	}
	
	public void addFirst(E first) { //adds to to the link list
		if (firstLink == null) {
			firstLink = new Link();
			firstLink.setItem(first);
			return;
		}
		Link newFirst = new Link();
		newFirst.setItem(first);
		newFirst.setNextLink(firstLink);
		firstLink = newFirst;
	}
	
	public E removeFirst() { // removes from the link list
		if (firstLink == null) {
			System.out.println("Empty LinkedList");
			return null;
		}
		Link secondLink = firstLink.getNextLink();
		Link oldFirstLink = firstLink;
		firstLink = secondLink;
		return oldFirstLink.getItem();
	}
	
	public void display() { //displays link list
		Link theLink = firstLink;
		
		while(theLink != null) {
			theLink.display();
			theLink = theLink.getNextLink();
		}
		System.out.println();
	}
	
	
	
	@Override
	public int size() {
		return 0;
	}
	
	public boolean isEmpty() {
		
		return(firstLink == null);
	}
	
	@Override
	public boolean contains(Object o) {
		return false;
	}
	
	@Override
	public Iterator<E> iterator() {
		return null;
	}
	
	@Override
	public Object[] toArray() {
		return new Object[0];
	}
	
	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}
	
	@Override
	public boolean add(E e) {
		return false;
	}
	
	@Override
	public boolean remove(Object o) {
		Link currentLink = firstLink;
		Link previousLink = null;
		
		while (!currentLink.getItem().equals(o)){
			
			if(currentLink.getNextLink() == null) {
				return false;
			} else {
				previousLink = currentLink;
				currentLink = currentLink.getNextLink();
			}
		}
		
		if(currentLink == firstLink) {
			this.removeFirst();
			return true;
			
		}
		
		previousLink.setNextLink(currentLink.getNextLink());

		return true;
	}
	
	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}
	
	@Override
	public void replaceAll(UnaryOperator<E> operator) {
	
	}
	
	@Override
	public void sort(Comparator<? super E> c) {
	
	}
	
	@Override
	public void clear() {
	
	}
	
	@Override
	public E get(int index) {
		return null;
	}
	
	@Override
	public E set(int index, E element) {
		return null;
	}
	
	@Override
	public void add(int index, E element) {
	
	}
	
	@Override
	public E remove(int index) {
		return null;
	}
	
	@Override
	public int indexOf(Object o) {
		return 0;
	}
	
	@Override
	public int lastIndexOf(Object o) {
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
	
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}
	
	@Override
	public Spliterator<E> spliterator() {
		return null;
	}
	
}
