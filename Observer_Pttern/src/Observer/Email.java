package Observer;

import Observable.StockObservable;

public class Email implements NotificationObs{
	
	String mail;
	StockObservable obs;

	public Email(String mail, StockObservable obs) {
		this.mail = mail;
		this.obs = obs;
	}
	
	@Override
	public void update() {
		sendmail(mail, "New Product Availavle");
	}

	private void sendmail(String mail, String string) {
		
		System.out.println("Mail sent to " + mail);
		
	}
	

}
