package Factory;

import javax.management.monitor.Monitor;

import products.Gpu;
import products.NVDIA;
import products.WindowsMonitor;

public class WithBudgetcomputer extends Companies{

	@Override
	public Gpu createGpu() {

		return new NVDIA();
		
	}

	@Override
	public Monitor createMonitor() {

		return new WindowsMonitor();
		
		
	}

}
