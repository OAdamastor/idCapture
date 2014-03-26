/**
 * 
 */
package idMap.idcapture.sf.net;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author pierre
 *
 */
public class BaseRecordImpl implements IdRecords {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7863582016149166436L;
	
	/* Internal structure to hold record 
	 * might be heavy ? hashcode of IdField ?
	 * */
	private HashMap<IdField,CRecord> records ;
	
	/**
	 * Create an empty IdRecord with all /collection/ supplied fields & null values 
	 */
	public BaseRecordImpl(List<IdField> fields) {
		// TODO Auto-generated constructor stub
		records = new HashMap<IdField,CRecord>();
		Iterator<IdField> it = fields.iterator();
		while ( it.hasNext() ){
			IdField f = it.next();
			
			/* is that useful, better not add to map null values, non existent will be nulls */
			records.put(f,null);
		}
	}
	
	/**
	 * Create and fill an IdRecord with all // collection supplied fields 
	 */
	public BaseRecordImpl(Map<IdField,CRecord> data ) {
		// TODO Auto-generated constructor stub
		records = new HashMap<IdField,CRecord>();
		records.putAll(data);
	}

	public BaseRecordImpl(String s1, String s2, int i1, int i2 ) {
		// TODO Auto-generated constructor stub
		
	}
	
	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#getRecord(idMap.idcapture.sf.net.IdField)
	 */
	public CRecord getRecord(IdField field)  {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 
		String fieldname = field.getName();
		Method[] localmethods = this.getClass().getDeclaredMethods() ;
		for (int i= 0; i < localmethods.length ; i++ ){
			 
			 // Reflection on self method getters for field
			 
			Method m = localmethods[i];
			if (m.getName().equals("get"+ fieldname )){
				
				return m.invoke(this);
			}
		}
        */
        
		//[0].getName())
		
		return records.get(field);
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#setRecord(idMap.idcapture.sf.net.IdField, java.lang.Object, idMap.idcapture.sf.net.AUser)
	 */
	public void setRecord(IdField field, Object value, AUser user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#isInMapsList()
	 */
	public int[] isInMapsList() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#isKeyInMapsList()
	 */
	public int[] isKeyInMapsList() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdRecords#sID()
	 */
	public int sID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getRecordValue(IdField field) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRecordValue(IdField field, Object value, AUser user) {
		// TODO Auto-generated method stub
		
	}

	public void setRecord(IdField field, CRecord value, AUser user) {
		// TODO Auto-generated method stub
		
	}

}
