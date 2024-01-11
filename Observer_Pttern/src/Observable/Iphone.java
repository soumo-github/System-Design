package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationObs;


public class Iphone implements StockObservable{
	
	public List<NotificationObs> observer = new ArrayList<>();
	public int stockcount = 0;

	@Override
	public void add(NotificationObs obs) {
		observer.add(obs);
	}
	
	@Override
	public void remove(NotificationObs obs) {
		observer.remove(obs);
	}
	
	@Override
	public void notifySubs() {
		for(NotificationObs v : observer) {
			v.update();
		}
	}

	@Override
	public void setStockCount(int no) {
		if(no!= 0 && stockcount == 0)notifySubs();
		stockcount = stockcount + no;
	}

	@Override
	public int getStockCount() {
		return stockcount;
	}

}
