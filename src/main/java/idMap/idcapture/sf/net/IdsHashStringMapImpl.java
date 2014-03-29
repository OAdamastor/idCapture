/**
 * 
 */
package idMap.idcapture.sf.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author OAdamastor
 * Basic implementation with single key
 * All fields used in maps (no selection)
 */
public class IdsHashStringMapImpl 
	extends HashMap<IdKey, IdRecords> 
    implements IdsMap {

	
	
	private static final long serialVersionUID = 1L;
	private List<? extends IdField> mapFields ;
	private IdKey keyField ;
	private String mapName ;
	
	/* Create on Map */
    public IdsHashStringMapImpl ( 
    		List<IdKey> keys, // no key indexes : single key
    		List<? extends IdField> fields, // no field indexes : all fields used in map
    		List<IdRecords> idRecords,
    		// world list of records, each records keep map membership information
    		int mapIndex, // index of map to be created in IdRecords map membership info
    		String name ) throws Exception {
		
    	/* Save fields reference internally */
    	this.mapFields = fields;
    	/* Save map Name reference */
    	this.mapName = name ;
    	
    	/* 
    	 * Check keys list size = 1 , 
    	 * if not error */
    	if ( keys.size() != 1 ) 
    			throw new Exception("Impossible to create IdsHashStringMapImpl with zero or multiple keys fields") ; 
    	else this.keyField = keys.get(0);
		
    	/* -----   Build mappings ----- */
    	
    	/* iterate over records */
    	for ( IdRecords rec : idRecords )  {
    		
            /* iterate over map references kept in the IdRecord */
    		for (int m  : rec.isInMapsList() ){
    		
    			// if this map index belongs to the idrecords
    			// not efficient if many maps ; should create all maps in one pass
    			// over a world method. & using a public put from the world instance
    			if ( m == mapIndex){
    			
    	          /* Call key field : force loading*/
    	         IdKey key = (IdKey) rec.getRecord(keyField);
    		     /* Use Key field in mapping */
    	         this.put(key,rec);
    	     	
    			} // if
    			
    		} // end iterate over map references
    		
    	} // end iterate over records
    	
	}
	
	
	/*
	 * To be populated from World settings at map creation.
	 * (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#getMapKeys()
	 */
	
	
	public List<? extends IdField> getMapFields() {
		
		return mapFields;
	}

	
    /* Simple Implementation, single Key, type is String */
	public IdRecords get(IdKey key){
		return get( key);
	}


	public List<IdKey> getMapKeys() {
		
		return Arrays.asList(keyField);
	}

	public String getName() {
		
		return this.mapName ;
	}
	
	

}
