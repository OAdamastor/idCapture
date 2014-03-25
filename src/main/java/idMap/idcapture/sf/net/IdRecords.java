/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;

/**
 * @author pierre
 *
 */
public interface IdRecords extends Serializable {

	public Object getRecord ( String attribute ) ;
	public void setRecord ( String attribute, Object value );
	
	
	
}
