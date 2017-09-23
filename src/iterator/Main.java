package iterator;

public class Main {
	public static void main(String[] args) {
		ElementCollection elementCollection = new ElementCollection(5);
		elementCollection.append(new Element("first element"));
		elementCollection.append(new Element("second element"));
		elementCollection.append(new Element("third element"));
		elementCollection.append(new Element("forth element"));
		Iterator it = elementCollection.iterator();
		while (it.hasNext()) {
			System.out.println(((Element) it.next()).getData());
		}
	}
}
