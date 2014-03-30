package net.sf.idcapture.idMap;

import java.io.Serializable;

public interface IdField extends Serializable {

	/*
	 * Data Class
	 */
	public Class<?> getFieldClass();
	
	/*
	 *  Field name as Key in map of Fields.
	 */
	public String getName();
	
	/*
	 * Reference membership of Fields to all IdsMaps, as enumerated in IdsWorld.getMapsList();
	 */
	public int[] isInMapsList();
	/*
	 * Reference Key Status of Fields in all IdsMaps, as enumerated in IdsWorld.getMapsList();
	 */
	public int[]  isKeyInMapsList();
	
	/*
	 * Reference storage domain System SID for specific fields ;
	 * AKA loading group if same storage domain
	 */
	public int storeSID();
	
	/*
	 * Reference storage field SID for specific fields ;
	 * data address x idRecords Id
	 */
	public int fieldID();
	
	/*
	 * Reference loading priority in applications
	 */
	public int loadingPriority();
	
}
