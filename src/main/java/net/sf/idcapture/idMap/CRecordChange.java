/**
 * 
 */
package net.sf.idcapture.idMap;

import java.io.Serializable;
import java.util.Date;

/**
 * @author OAdamastor
 *
 */
public interface CRecordChange extends Serializable {

	public Date getDate() ;
	public AUser getUser();
	public Object getPreviousValue();
	public Object getUpdatedValue();
	
}
