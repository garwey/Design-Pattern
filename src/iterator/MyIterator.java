package iterator;

public class MyIterator implements Iterator {
	private ElementCollection elementCollection;
	private int index;

	public MyIterator(ElementCollection elementCollection) {
		this.elementCollection = elementCollection;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < elementCollection.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Element element = elementCollection.getElementAt(index);
		index++;
		return element;
	}

}
