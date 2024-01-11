package Observer;

import Observable.StockObservable;

public class Mobile implements NotificationObs{
	
	String user;
	StockObservable obs;

	public Mobile(String user, StockObservable obs) {
		this.user = user;
		this.obs = obs;
	}

	@Override
	public void update() {
		sendmsg(user, "New Product Availavle");
	}

	private void sendmsg(String user, String string) {
		
		System.out.println("Msg sent to " + user);
		
	}
}
