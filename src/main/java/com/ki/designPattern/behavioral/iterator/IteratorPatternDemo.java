package com.ki.designPattern.behavioral.iterator;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}

class CollectionofNames implements Container {
	public String name[] = { "Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra" };

	public Iterator getIterator() {
		return new CollectionofNamesIterate();
	}

	private class CollectionofNamesIterate implements Iterator {
		int i;

		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			return null;
		}
	}
}

interface Container {
	public Iterator getIterator();
}// End of the Iterator interface.

interface Iterator {
	public boolean hasNext();

	public Object next();
}