/**
 * 
 */
package idMap.idcapture.sf.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author "OAdamastor"
 *
 */
public class IdWorldSimpleImpl implements IdsWorld {

	/**
	 * 
	 */
	private static final long serialVersionUID = 27023578420233977L;

	private static final Logger this_logger = LogManager.getLogger(IdWorldSimpleImpl.class.getName());
	
	private List<IdsMap> mapsList ;
	private List<IdField> keysList ;
	private List<IdField> fieldsList ;
	private List<IdRecords> recordsList ;
	
	
	/**
	 * @throws Exception 
	 *  
	 * 
	 */
	public IdWorldSimpleImpl() throws Exception {
		
	   
		this_logger.info("Log world creation");
		/* Create Fields */
		
		IdField stringKey = new IdFieldSimpleImpl("idname", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{1}, // used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		IdField stringField = new IdFieldSimpleImpl("description", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{}, // NOT used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		IdField intField = new IdFieldSimpleImpl("length", 
				Integer.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{}, // NOT used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		List<IdField> kList = Arrays.asList( stringKey ) ;
	    List<IdField> fList = Arrays.asList(stringKey,stringField,intField) ;
	    
	    List<IdRecords> recList = new ArrayList<IdRecords>(10);
	    
	    
		for ( int i = 0 ; i < 6 ; i++   ){
			/* Create empty IdRecords */
	        IdRecords rec1  = new IdRecordsSimpleImpl(new int[]{1}, i ) ;
	        
	        /* Generate a pseudo string key */
	        CRecord<String> recString = new CRecordSimpleImpl<String>("rec_"+i);
	        rec1.setRecord(stringKey, recString, null);
	    	 /* Populate a data string field */
	    	CRecord<String> recString2 = new CRecordSimpleImpl<String>("data_"+i);
		        rec1.setRecord(stringField, recString2, null);
		    /* Populate a data string field */
		    CRecord<Integer> recInteger = new CRecordSimpleImpl<Integer>( 125 * i );
			        rec1.setRecord(intField, recInteger, null);
			    	
		    	
		    /* Add new Id Records to the list */
		    recList.add(rec1);
		    	
		}
	    
		// Create Map
		IdsMap idMap = new IdsHashStringMapImpl(kList, fList, recList, 
				1, // Map Index in world
				"myFirstMap"); // Map name in world
		List<IdsMap> mList = Arrays.asList(idMap);
		
		// keep private ref
		this.fieldsList = fList ;
		this.keysList = kList ;
		this.recordsList = recList ;
		this.mapsList = mList ;
		this_logger.info("end world creation");
		this_logger.info("nomber of records in Map 1 = " + idMap.size() );
		
		this_logger.info(("data integer field for Map 1, Idrecord rec_4, integer ="  
				 + idMap.get("rec_4").getRecordValue(intField) ) );
		
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getFields()
	 */
	public List<IdField> getFields() {
		
		return this.fieldsList;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getMaps()
	 */
	public List<IdsMap> getMaps() {
	
		return this.mapsList;
	}

	

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getMapsNames()
	 */
	public List<String> getMapsNames() {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getMap(int)
	 */
	public IdsMap getMap(int mapindex) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getMap(java.lang.String)
	 */
	public IdsMap getMap(String mapname) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getIds()
	 */
	public List<IdRecords> getIds() {
		
		return recordsList ;
	}

}
