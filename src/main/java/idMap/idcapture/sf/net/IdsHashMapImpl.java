/**
 * 
 */
package idMap.idcapture.sf.net;

import java.util.HashMap;
import java.util.Set;

/**
 * @author pierre
 *
 */
public class IdsHashMapImpl implements IdsMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<String> attributes;
	private HashMap<String,IdRecords> map ;
	
	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#getId(java.lang.String)
	 */
	public IdsHashMapImpl ( Set<String> attributes ) {
		/* Record Attributes */
		setAttributes( attributes ) ;
	}
	
	
	
	
	public IdRecords getId(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#existsId(java.lang.String)
	 */
	public boolean existsId(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#addId(java.lang.String, idMap.idcapture.sf.net.IdRecords)
	 */
	public void addId(String key, IdRecords id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#addNewId(idMap.idcapture.sf.net.IdRecords)
	 */
	public String addNewId(IdRecords id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#getAttributes()
	 */
	public Set<String> getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#setAttributes(java.util.Set)
	 */
	public void setAttributes(Set<String> attributes) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#setProfile(java.lang.String, java.util.Set)
	 */
	public void setProfile(String profile, Set<String> attributes) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#getProfile(java.lang.String)
	 */
	public Set<String> getProfile(String profile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getKeyAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setKeyAttribute(String keyAttribute) {
		// TODO Auto-generated method stub
		
	}




	public void loadIdRecords(Set<IdRecords> ids, String keyAttribute) {
		// TODO Auto-generated method stub
		
	}




	public void loadIdKeys(Set<String> keys) {
		// TODO Auto-generated method stub
		
	}

}
