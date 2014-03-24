/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;

/**
 * @author pierre
 *
 */
public interface IdsMap extends Serializable {

	
	/*
	 * Get Records Object from Key
	 */
	public IdRecords getId ( String key ) ;
	public boolean existsId ( String key ) ;
	public void addId ( String key, IdRecords id );
	
	/*
	 * If auto generated key ; 
	 * ? any interest
	 */
	public String addNewId ( IdRecords id );
	
	/*
	 * getAllRecords Attributes
	 */
	public String[] getAttributes();
	
}
