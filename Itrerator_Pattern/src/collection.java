import java.util.ArrayList;
import java.util.List;

public class collection implements Iterable{

	List<String> internalList = new ArrayList<>();
	
	public Itrerator createIterator() {
		return new collectionIterator(this);
	}
	
	public collection() {
		internalList.add("I");
		internalList.add("Hate");
		internalList.add("Service Based");
		internalList.add("Company");
	}
	
	public int size() {
		return this.internalList.size();
	}
	
	public String getIndex(int i) {
		return internalList.get(i);
	}
	
	
	

}
