package Entregable_1;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable<Integer> {
	protected Node prev;
	protected Node first;
	protected Node next;
	protected int size;
	protected final int MIN = 2;
	
	public DoubleLinkedList() {
		this.first = null;
		this.prev = null;
		this.next = null;
		this.size = 0;
	}

	public DoubleLinkedList getSecuense(int value1, int value2, MyIterator iterator, DoubleLinkedList finalList) {
		while (iterator.hasNext()) {
			value1 = iterator.get();
			iterator.next();
			value2 = iterator.get();
			if(value1 == value2) {
				getSecuense(value1, value2, iterator, finalList);
			} else if (value1 < value2) {	
//				Node nodAux = finalList.next;		
				finalList.insertFront(value2);																	
				if(iterator.hasNext() ) {
					finalList.insertFront(value1);
				} 
				getSecuense(value1, value2, iterator, finalList);
			} else {
//				iterator.next();
				DoubleLinkedList listAux2 = new DoubleLinkedList();
				getSecuense(value1, value2, iterator, listAux2);
			}
		}
		printSecuense(finalList);
		return finalList;
	}

	private static void printSecuense(DoubleLinkedList finalList) {
		System.out.println("Lista: ");
		for (Integer integer : finalList) {
			System.out.println(integer);
		}
	}

	public void insertFront(Integer o) {
		Node tmp = new Node(o, null, null);
		tmp.setNext(this.first);
		if(this.first != null) {
			this.first.setPrev(tmp);
		}
		this.first = tmp;
		this.size++;
	}

	public Integer extractFront() {
		Integer output = null;
		if (this.first != null) {
			output = this.first.getInfo();
			this.first = this.first.getNext();
			this.size--;
		}
		return output;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public int size() {
		return this.size;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyIterator(this.first);
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
