/**
 * 
 */
package net.sf.idcapture.idMap;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.xml.bind.annotation.*;
/**
 * @author "OAdamastor"
 *
 */

@XmlRootElement(name = "idworld")
@XmlAccessorType( XmlAccessType.NONE )

public class IdWorldSimpleImpl implements IdsWorld {

	/**
	 * 
	 */
	private static final long serialVersionUID = 27023578420233977L;

	private static final Logger this_logger = LogManager.getLogger(IdWorldSimpleImpl.class.getName());
	
	private List<IdsMap> mapsList ;
	private List<IdField> fieldsList ;
	private List<IdRecords> recordsList ;
	
	
	/**
	 * @throws Exception 
	 *  
	 * 
	 */
	public IdWorldSimpleImpl()  {
		
		fieldsList = new ArrayList<IdField>();
		
		
	}
	
	public IdField getTestField(String fieldname){
		
		IdFieldSimpleImpl f = new IdFieldSimpleImpl();
		return f;
	}
	
	
	public void createAllMaps(){
		
	}
	/**
	 * @throws Exception 
	 *  
	 * 
	 */
	public IdWorldSimpleImpl(int param) throws Exception {
		
	   
		this_logger.info("Log world creation");
		/* Create Fields */
		
		/*
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
		*/
		
		// List<IdField> kList = Arrays.asList( stringKey ) ;
	    
		//List<IdField> fList = Arrays.asList(stringKey,stringField,intField) ;
	    
		this.readXMLFields();
		List<IdField> fList = this.fieldsList ;
		
		
	    List<IdRecords> recList = new ArrayList<IdRecords>(10);
	    
	    
		for ( int i = 0 ; i < 6 ; i++   ){
			/* Create empty IdRecords */
	        IdRecords rec1  = new IdRecordsSimpleImpl(new int[]{1}, i ) ;
	        
	        /* Generate a pseudo string key */
	        CRecord<String> recString = new CRecordSimpleImpl<String>("rec_"+i);
	        rec1.setRecord(this.fieldsList.get(0), recString, null);
	    	 /* Populate a data string field */
	    	CRecord<String> recString2 = new CRecordSimpleImpl<String>("data_"+i);
		        rec1.setRecord(this.fieldsList.get(1), recString2, null);
		    /* Populate a data string field */
		    CRecord<Integer> recInteger = new CRecordSimpleImpl<Integer>( 125 * i );
			        rec1.setRecord(this.fieldsList.get(2), recInteger, null);
			    	
		    	
		    /* Add new Id Records to the list */
		    recList.add(rec1);
		    	
		}
	    
		// Create Map
		IdsMap idMap = new IdsHashStringMapImpl( fList, recList, 
				1, // Map Index in world
				"myFirstMap"); // Map name in world
		List<IdsMap> mList = Arrays.asList(idMap);
		
		// keep private ref
		this.fieldsList = fList ;
		this.recordsList = recList ;
		this.mapsList = mList ;
		this_logger.info("end world creation");
		this_logger.info("nomber of records in Map 1 = " + idMap.size() );
		
		this_logger.info(("data integer field for Map 1, Idrecord rec_4, integer ="  
				 + idMap.get("rec_4").getRecordValue(this.fieldsList.get(2)) ) );
		
		saveFieldsDefinition();
		
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
	
	private void saveFieldsDefinition() throws JAXBException{
		
		/*
		IdField stringKey = new IdFieldSimpleImpl("idname", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{1}, // used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		*/
		/*
		IdFieldSimpleImpl stringKey = new IdFieldSimpleImpl("idname", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{1}, // used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		IdFieldSimpleImpl stringField = new IdFieldSimpleImpl("description", 
				String.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{}, // NOT used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		IdFieldSimpleImpl intField = new IdFieldSimpleImpl("length", 
				Integer.class, // is a String
				new int[]{1}, // used as field in map 1
				new int[]{}, // NOT used as key in map 1
				0, // storeSID
				1, // fieldID
				0) ; // loading order
		
		 List<IdFieldSimpleImpl> locList = Arrays.asList(stringKey,stringField,intField) ;
	   
		*/
		
		  IdFieldsList flist = new IdFieldsList() ;
		  flist.addFields( this.fieldsList );
		  flist.addRecords(this.recordsList);
		  
		  JAXBContext context = JAXBContext.newInstance( IdFieldsList.class ) ;
		    
		  // création d'un marshaller à partir de ce contexte
		  Marshaller marshaller = context.createMarshaller() ;
		    
		     // on choisit UTF-8 pour encoder ce fichier
		  marshaller.setProperty("jaxb.encoding",  "UTF-8") ;
		     // et l'on demande à JAXB de formatter ce fichier de façon 
		     // à pouvoir le lire à l'oeil nu
		  marshaller.setProperty("jaxb.formatted.output", true) ;
		    
		     // écriture finale du document XML dans un fichier surcouf.xml
		  marshaller.marshal( flist ,  new File("fields.xml")) ;
		    this_logger.info("Saving fields definition as fields.xml file");
	}
	
	
	
	private void readXMLFields() throws JAXBException{
		
		  // création d'un contexte JAXB sur la classe Marin
	    JAXBContext context = JAXBContext.newInstance(IdFieldsList.class ) ;
	    
	     // création d'un unmarshaller
	    Unmarshaller unmarshaller = context.createUnmarshaller() ;
	    IdFieldsList flist = ( IdFieldsList)  unmarshaller.unmarshal(new File("fields.xml")) ;
	    
	    List<IdFieldSimpleImpl> locList = flist.getFields() ;
	    
	    this.fieldsList = new ArrayList<IdField>();
	    this.fieldsList.addAll( locList ) ;
	    
	    this.this_logger.info("Read Fields definition from fields.xml file. Done");
		
	}

}
