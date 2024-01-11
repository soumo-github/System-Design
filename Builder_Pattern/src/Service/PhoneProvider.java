package Service;

import Phone.Phone;

public class PhoneProvider {

	private String os;
	private int ram;
	private int battery;
	private String processor;
	
	
	public PhoneProvider setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneProvider setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneProvider setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneProvider setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone getPhone() {
		
		return new Phone(os, ram,  battery, processor);
		
	}
	
	
}
