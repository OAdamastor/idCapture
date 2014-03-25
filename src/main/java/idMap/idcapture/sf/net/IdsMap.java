/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;
import java.util.Set;

/**
 * @author pierre
 *
 */
public interface IdsMap extends Serializable {

	
        public void loadIdRecords(Set<IdRecords> ids, String keyAttribute ) ;
        public void loadIdKeys( Set<String> keys ) ;
        
	/*
	 * ID Management
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
	 * Data records per Id;
	 */
	
	/*
	 * Possible Records Attributes
	 */
	public Set<String> getAttributes();
	public void setAttributes( Set<String> attributes ) ;
	
	/*
	 * Attributes Profiles : subset of Record attributes
	 */
	public void setProfile (String profile, Set<String> attributes ) ;
	public Set<String> getProfile(String profile) ;
	/*
	 * Key attribute : IdRecordAttribute used as a key
	 */
	public String getKeyAttribute();
	abstract void setKeyAttribute (String keyAttribute );
	
}
