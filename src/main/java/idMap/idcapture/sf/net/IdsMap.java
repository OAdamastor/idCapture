/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author OAdamastor
 *
 */
public interface IdsMap 
    extends 
    	Map<IdKey,IdRecords>, 
    	Serializable {
	
	/* 
	 * Map name used as external map reference
	 * ( internally map reference as int index in maps list
	 */
	public String getName();
	
	/*
	 * get Map Key Fields
	 */
	public List<IdKey> getMapKeys();
	/*
	 * get All Map Fields
	 */
	public List<? extends IdField> getMapFields();
	
	
}
