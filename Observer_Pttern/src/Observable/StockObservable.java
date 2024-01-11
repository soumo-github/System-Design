package Observable;

import Observer.NotificationObs;

public interface StockObservable {
	
	public void add(NotificationObs obs);

	public void remove(NotificationObs obs);
	
	public void notifySubs();
	
	public void setStockCount(int no);
	
	public int getStockCount();
	

}
