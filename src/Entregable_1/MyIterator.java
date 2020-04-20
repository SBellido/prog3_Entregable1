package Entregable_1;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer>{
	private Node browser;

	public MyIterator(Node node) {
		this.browser = node;
	}

	@Override
	public boolean hasNext() {		
		return this.browser != null;
	}

	@Override
	public Integer next() {
		Integer info = this.browser.getInfo();
		this.browser = this.browser.getNext();
		return info;
	}
	public Integer prev() {
		Integer info = this.browser.getInfo();
		this.browser = this.browser.getPrev();
		return info;
	}
	public Integer get() {
		return this.browser.getInfo();

	}
}
