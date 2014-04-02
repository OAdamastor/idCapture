package net.sf.idcapture.idMap;

import java.io.Serializable;

public interface IdField extends Serializable {

	/*
	 * Data Class
	 */
	public Class<?> getClassReference();
	
	/*
	 *  Field name as Key in map of Fields.
	 */
	public String getFieldName();
	
	/*
	 * Reference membership of Fields to all IdsMaps, as enumerated in IdsWorld.getMapsList();
	 */
	public int[] getInMapsList();
	/*
	 * Reference Key Status of Fields in all IdsMaps, as enumerated in IdsWorld.getMapsList();
	 */
	public int[]  getKeyInMapsList();
	
	/*
	 * Reference storage domain System SID for specific fields ;
	 * AKA loading group if same storage domain
	 */
	public int getStoreSID();
	
	/*
	 * Reference storage field SID for specific fields ;
	 * data address x idRecords Id
	 */
	public int getFieldID();
	
	/*
	 * Reference loading priority in applications
	 */
	public int getLoadingPriority();
	
}
