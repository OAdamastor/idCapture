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

	public Object getRecordValue ( IdField field );
	
	public void setRecordValue ( IdField field, Object value, AUser user );
	
    public CRecord getRecord ( IdField field );
	
	public void setRecord ( IdField field, CRecord value, AUser user );
	
	/*
	 * Reference membership of Fields to all IdsMaps, as enumerated in IdsWorld.getMapsList();
	 */
	public int[] isInMapsList();
	/*
	 * Reference Key Status of Fields in all IdsMaps, as enumerated in IdsWorld.getMapsList();
	 */
	public int[]  isKeyInMapsList();
	/*
	 * Reference storage ID to load from specific stores ( if 0, use list index from List Records ) ;
	 * 
	 * Should be the same sID across all storage Domains SID for one IdRecords. 
	 *           Data record is intersection of fieldID x IdRecord sID , to be called in a storage domain SID
	 */
	public int sID();
	
	
}
