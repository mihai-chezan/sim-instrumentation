/**
 * 
 */
package sim.monitor.internal.data;

/**
 * @author val
 *
 */
public interface DataValueType {

	public boolean isLongType();
	
	public boolean isDoubleType();
	
	public Object getValueObject();
	
	public String getValueTypeClassName();
	
}
