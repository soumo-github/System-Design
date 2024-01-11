package Factory;

import javax.management.monitor.Monitor;

import products.AcerMonitor;
import products.Gpu;
import products.Qualcomm;
import products.WindowsMonitor;

public class GoodCompany extends Companies{

	@Override
	public Gpu createGpu() {
		
		return new Qualcomm();
		
	}

	@Override
	public Monitor createMonitor() {
		
		return new AcerMonitor();
		
	}

}
