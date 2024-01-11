
public class collectionIterator implements Itrerator{
	
	private collection coll;
	private int colsize;
	private int currIndex = -1;
	
	public collectionIterator(collection col) {
		this.coll = col;
		this.colsize = col.size();
	}
	
	@Override
	public String getNext() {
		currIndex++;
		return this.coll.getIndex(currIndex);
	}

	@Override
	public boolean hasMore() {
		return currIndex + 1 < colsize;
	}
	
	
	
}
