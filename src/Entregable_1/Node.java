package Entregable_1;

public class Node {
	private Integer info;
	private Node next;
	private Node prev;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(Integer o, Node p, Node n) {
		this.setInfo(o);
		this.setNext(n);
		this.setPrev(p);
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

}
