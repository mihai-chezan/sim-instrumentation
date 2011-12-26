/**
 * 
 */
package sim.monitor.internal;

import sim.monitor.internal.data.Data;
import sim.monitor.internal.observer.MonitorProcessorObserver;
import sim.monitor.naming.Name;


/**
 * @author valer
 *
 */
public interface MonitorProcessor {

	public Name getName();
	
	public void input(Data data);

	public void addObserver(MonitorProcessorObserver observer);
	
	public void removeObserver(MonitorProcessorObserver observer);
	
	public void notify(Name name, Data data);
	
	//public void sink(Data data);
	
}
