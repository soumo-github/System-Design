import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	List<Memento> history = new ArrayList<>();
	
	public void add(Memento mem) {
		
		history.add(mem);

	}
	
	public Memento undo() {
		
		if(!history.isEmpty()) {
			
			int lastIndex = history.size() - 1;
			Memento lastMemo = history.get(lastIndex);
			history.remove(lastIndex);
			return lastMemo;
		}
		return null;                   
	}
	
}
