/**
 * 
 */
package idMap.idcapture.sf.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author "OAdamastor"
 *
 */
public class IdWorldSimpleImpl implements IdsWorld {

	/**
	 * 
	 */
	private static final long serialVersionUID = 27023578420233977L;

	private List<IdsMap> mapsList ;
	private List<IdKey> keysList ;
	private List<? extends IdField> fieldsList ;
	private List<IdRecords> recordsList ;
	
	
	/**
	 * @throws Exception 
	 *  
	 * 
	 */
	public IdWorldSimpleImpl() throws Exception {
		
	   
		System.out.println("Log world creation");
		/* Create Fields */
		
		IdKey stringKey = new IdKeySimpleImpl("idname", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{1}, // used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		IdKey stringField = new IdKeySimpleImpl("description", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{}, // NOT used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		IdKey intField = new IdKeySimpleImpl("length", 
				Integer.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{}, // NOT used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		List<IdKey> kList = Arrays.asList( stringKey ) ;
	    List<? extends IdField> fList = Arrays.asList(stringKey,stringField,intField) ;
	    
	    List<IdRecords> recList = new ArrayList<IdRecords>(10);
	    
	    /* Create empty IdRecords */
		for ( int i = 0 ; i < 6 ; i++   ){
	        IdRecords rec1  = new IdRecordsSimpleImpl(new int[]{1}, i ) ;
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
		System.out.println("end world creation");
		
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdsWorld#getFields()
	 */
	public List<? extends IdField> getFields() {
		
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
