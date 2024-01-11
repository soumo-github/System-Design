
public class Main {

	public static void main(String[] args) {
		
		Iterable coll = new collection();
		Itrerator it = coll.createIterator();
		
		int i = 0;
		while(it.hasMore()) {
			String res = it.getNext();
			System.out.println(i++ + " " + res);
		}
		
	}

}
