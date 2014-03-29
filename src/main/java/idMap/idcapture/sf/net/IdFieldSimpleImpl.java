/**
 * 
 */
package idMap.idcapture.sf.net;

/**
 * @author OAdamastor
 *
 */
public class IdFieldSimpleImpl implements IdField {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String fieldName ;
	Class<?> classReference ;
	int[] inMapsList ;
	int[] keyInMapsList ;
	int storeSID ;
	int fieldID ;
	int loadingPriority ;

	/**
	 * Constructor of immutable objects : 
	 * pending : how to add / remove fiel/maps mappings 
	 */
	public IdFieldSimpleImpl(String fName, Class<?> classref,
			int[] f_inMapsList , int[] f_KeyInMapsList,
			int f_storeSID, int f_fieldID, int f_loadingPriority ) {
		
		this.classReference = classref ;
		this.fieldName = fName ;
		this.inMapsList = f_inMapsList ;
		this.keyInMapsList = f_KeyInMapsList ;
		this.storeSID = f_storeSID ;
		this.fieldID = f_fieldID ;
		this.loadingPriority = f_loadingPriority ;
		
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#getFieldClass()
	 */
	
	
	public Class<?> getFieldClass() {
		
		return this.classReference ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#getName()
	 */
	public String getName() {
		
		return this.fieldName;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#isInMapsList()
	 */
	public int[] isInMapsList() {
		
		return inMapsList ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#isKeyInMapsList()
	 */
	public int[] isKeyInMapsList() {
		
		return keyInMapsList ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#storeSID()
	 */
	public int storeSID() {
		
		return this.storeSID ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#fieldID()
	 */
	public int fieldID() {
	
		return this.fieldID ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#loadingPriority()
	 */
	public int loadingPriority() {
		
		return this.loadingPriority ;
	}

}
