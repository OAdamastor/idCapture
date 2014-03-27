/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author pierre
 * 
 * Chain of custody enabled record 
 */
public interface CRecord<T> extends Serializable {

	/*
	 * Base value access method.
	 */
	public T getValue();
	
	/* 
	 *  Base set value access method,
	 *  will record in implementations all changes
	 */
	public void setValue(Object newValue, AUser user );
	
	/*
	 * Check if existing non null value
	 */
	public boolean isDefined();
	
	/*
	 * Tracking information access method
	*/
	
	public AUser lastChangedBy();
	
	public AUser lastAccesBy() ;
	
	public AUser createdBy();
	
	public Date lastChanged();
	
	public Date lastAcces() ;
	
	public Date created();
	
	public List<CRecordChange> getChanges();
	
}
