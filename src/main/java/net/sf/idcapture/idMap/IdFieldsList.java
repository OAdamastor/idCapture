/**
 * 
 */
package net.sf.idcapture.idMap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;
/**
 * @author "OAdamastor"
 *
 */

@XmlRootElement(name="fieldsList") 
public class IdFieldsList implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6759170529781033772L;
	private List<IdFieldSimpleImpl> fields = null ;
	private List<IdRecordsSimpleImpl> recordsList = null ;
	
	
	
	/**
	 * 
	 */
	public IdFieldsList() {
		
		fields = new ArrayList<IdFieldSimpleImpl>();
		recordsList = new ArrayList<IdRecordsSimpleImpl>() ;
		
	}
	
	/**
	 * @return the recordsList
	 */
	public List<IdRecordsSimpleImpl> getRecordsList() {
		return recordsList;
	}
	/**
	 * @param recordsList the recordsList to set
	 */
	public void setRecordsList(List<IdRecordsSimpleImpl> recordsList) {
		this.recordsList = recordsList;
	}
	
	public void addRecords(List<IdRecords> recs) {
		
		for ( IdRecords r : recs ) 
		{ 
		    this.recordsList.add(  (IdRecordsSimpleImpl)  r );
		}
		
	}
	
	public List<IdFieldSimpleImpl> getFields() {
		return fields;
	}
	public void setFields(List<IdFieldSimpleImpl> fields) {
		this.fields = fields;
	}
	public void addFields(List<IdField> fds) {
		for ( IdField f : fds ) 
		{ 
		    this.fields.add( (IdFieldSimpleImpl)  f);
		}
	}
	
}
