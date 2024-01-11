package Factory;

import javax.management.monitor.Monitor;

import products.Gpu;

public abstract class Companies {
	
	public abstract Gpu createGpu();
	
	public abstract Monitor createMonitor();
	
}
