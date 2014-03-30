/**
 * 
 */
package net.sf.idcapture.idMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author OAdamastor
 * Basic implementation with single key
 * All fields used in maps (no selection)
 */
public class IdsHashStringMapImpl 
	extends HashMap<String, IdRecords> 
    implements IdsMap {

	private static Logger this_logger = LogManager.getLogger(IdsHashStringMapImpl.class);
	
	private static final long serialVersionUID = 1L;
	// private List<IdField> mapFields ;
	private Map<String,IdField> mapFieldsName; 
	private IdField keyField ;
	private String mapName ;
	
	/* Create on Map */
    public IdsHashStringMapImpl ( 
    		List<IdField> keys, // no key indexes : single key
    		List<IdField> fields, // no field indexes : all fields used in map
    		List<IdRecords> idRecords,
    		// world list of records, each records keep map membership information
    		int mapIndex, // index of map to be created in IdRecords map membership info
    		String name ) throws Exception {
		
    	/* Save fields reference internally */
    	this.mapFieldsName = new HashMap<String,IdField>(10);
    	// No duplicate checks 
    	for ( IdField f : fields ) this.mapFieldsName.put(f.getName(), f ) ;
    	//this.mapFields = fields;
    	
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
    			
    				
    				this_logger.debug("mapindex, m = " + m);
    				this_logger.debug("keyfield name = " + keyField.getName() ) ;
    				this_logger.debug("keyfield = " + keyField.getFieldClass().toString() ) ;
    				
    				
    	          /* Call key field : force loading*/
    	         if ( keyField.getFieldClass().equals(String.class)  ){ 
    	        	 
    				CRecord<String> keyRecord = (CRecord<String>) rec.getRecord(keyField);
    				   /* Use Key field in mapping */
       	            this.put(keyRecord.getValue(),rec);
       	            this_logger.debug("keyRecord Value = " + keyRecord.getValue() ) ;
    	         }
    	         else
    	        	 throw new Exception ( "simple key field is not of type String");
    		  
    	     	
    			} // if
    			
    		} // end iterate over map references
    		
    	} // end iterate over records
    	
	}
	
	
	/*
	 * To be populated from World settings at map creation.
	 * (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsMap#getMapKeys()
	 */
	
	
	public Collection<IdField> getMapFields() {
		
		// return mapFields;
		return mapFieldsName.values() ;
	}

	
    /* Simple Implementation, single Key, type is String */
	public IdRecords get(IdField key){
		return get( key);
	}


	public List<IdField> getMapKeys() {
		
		return Arrays.asList(keyField);
	}

	public String getName() {
		
		return this.mapName ;
	}


	public String getMapName() {
		
		return this.mapName ;
	}


	public IdField getFieldByName(String FieldName) {
		
		return mapFieldsName.get(FieldName) ;
	
	}
	
	

}
