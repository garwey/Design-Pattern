package iterator;

public class ElementCollection {
	private Element[] elements;
	private int last = 0;

	public ElementCollection(int maxsize) {
		this.elements = new Element[maxsize];
	}

	public Element getElementAt(int index) {
		return elements[index];
	}

	public void append(Element e) {
		this.elements[last] = e;
		last++;
	}

	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return new MyIterator(this);
	}
}
