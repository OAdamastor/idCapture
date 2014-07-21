/**
 * 
 */
package net.sf.idcapture.idMap;

import java.util.HashMap;
import javax.xml.bind.annotation.*;

/**
 * @author OAdamastor
 *
 */
@XmlRootElement(name="id")
@XmlAccessorType( XmlAccessType.FIELD)

public class IdRecordsSimpleImpl  
            extends HashMap<IdField ,CRecord<?> > 
            implements IdRecords{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3258977913461276703L;
	private int[] inMapsList ;
	private int sID ;
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	public IdRecordsSimpleImpl( ) {
		
		this.inMapsList = null ;
		this.sID = -1 ;
		
	}
	
	
	public IdRecordsSimpleImpl(
			int[] f_inMapsList,
			int f_sID ) {
		
		this.inMapsList = f_inMapsList ;
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
	 * @see idMap.idcapture.sf.net.IdRecords#sID()
	 */
	public int sID() {
		
		return this.sID ;
	}

}
