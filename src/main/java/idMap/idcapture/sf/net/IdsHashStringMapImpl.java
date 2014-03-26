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
 * @author pierre
 *
 */
public class IdsHashStringMapImpl 
	extends HashMap<IdKey, IdRecords> 
    implements IdsMap {

	
	
	private static final long serialVersionUID = 1L;
	private List<IdField> mapFields ;
	private IdField keyField ;
	private String mapName ;
	
    public IdsHashStringMapImpl ( 
    		List<IdField> keys, List<IdField> fields, 
    		List<IdRecords> idRecords,
    		// one pass in world construction of all maps indexes
    		int[] mapIndexes,
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
    	
    	/* iterate over map indexes */
    	for ( int i = 0 ;  i < mapIndexes.length ; i++)  {
    		
            /* get reference of IdRecords mapped 
             *    	
             */
    		IdRecords nextId = idRecords.get(mapIndexes[i]);
    	    
    	    /* Call key field : force loading
    		*/
    	    IdKey key = (IdKey) nextId.getRecord(keyField);
    		/* Use Key field in mapping */
    	    this.put(key,nextId);
    	
    	} // end iterate over array
    	
	}
	
	
	/*
	 * To be populated from World settings at map creation.
	 * (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#getMapKeys()
	 */
	
	
	public List<IdField> getMapFields() {
		return mapFields;
	}

	
    /* Simple Implementation, single Key, type is String */
	public IdRecords get(IdKeyString key){
		return get( key);
	}


	public List<IdField> getMapKeys() {
		// TODO Auto-generated method stub
		return Arrays.asList(keyField);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
