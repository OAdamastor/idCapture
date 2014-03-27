/**
 * 
 */
package idMap.idcapture.sf.net;

import java.util.HashMap;

/**
 * @author pierre
 *
 */
public class IdRecordsSimpleImpl  
            extends HashMap<IdField ,CRecord<?> > 
            implements IdRecords{

	
	int[] inMapsList ;
	int[] keyInMapsList ;
	int sID ;
	
	/**
	 * 
	 */
	public IdRecordsSimpleImpl(
			int[] f_inMapsList,
			int[] f_keyInMapsList,
			int f_sID ) {
		
		this.inMapsList = f_inMapsList ;
		this.keyInMapsList = f_keyInMapsList ;
		this.sID = f_sID ;
		
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#getRecordValue(idMap.idcapture.sf.net.IdField)
	 */
	public Object getRecordValue(IdField field) {
		
		return get(field).getValue() ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#setRecordValue(idMap.idcapture.sf.net.IdField, java.lang.Object, idMap.idcapture.sf.net.AUser)
	 */
	public void setRecordValue(IdField field, Object value, AUser user) {
		// TO change last update in records
        get(field).setValue(value, user);
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#getRecord(idMap.idcapture.sf.net.IdField)
	 */
	public CRecord<?> getRecord(IdField field) {
		
		return get(field );
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#setRecord(idMap.idcapture.sf.net.IdField, idMap.idcapture.sf.net.CRecord, idMap.idcapture.sf.net.AUser)
	 */
	public void setRecord(IdField field, CRecord<?> record, AUser user) {
		
		// TO change last update in records
        put(field,record) ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#isInMapsList()
	 */
	public int[] isInMapsList() {
		
		return this.inMapsList ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#isKeyInMapsList()
	 */
	public int[] isKeyInMapsList() {
		
		return this.keyInMapsList ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#sID()
	 */
	public int sID() {
		
		return this.sID ;
	}

}
