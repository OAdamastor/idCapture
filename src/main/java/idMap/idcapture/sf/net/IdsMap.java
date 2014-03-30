/**
 * 
 */
package idMap.idcapture.sf.net;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author OAdamastor
 *
 */
public interface IdsMap 
    extends 
    	Map<String,IdRecords>, 
    	Serializable {
	
	/* 
	 * Map name used as external map reference
	 * ( internally map reference as int index in maps list
	 */
	public String getMapName();
	
	/*
	 * get Key Map Fields
	 */
	public List<IdField> getMapKeys();
	
	/*
	 * get All Map Fields
	 */
	public Collection<IdField> getMapFields();
	
	/*
	 *  Allow for fields retrieval by name
	 */
	public IdField getFieldByName(String FieldName);
	
	
}
