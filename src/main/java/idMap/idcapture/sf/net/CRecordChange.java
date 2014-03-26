/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;
import java.util.Date;

/**
 * @author pierre
 *
 */
public interface CRecordChange extends Serializable {

	public Date getDate() ;
	public AUser getUser();
	public Object getPreviousValue();
	public Object getUpdatedValue();
	
}
