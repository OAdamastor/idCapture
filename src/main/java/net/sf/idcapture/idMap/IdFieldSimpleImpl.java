/**
 * 
 */
package net.sf.idcapture.idMap;

import javax.xml.bind.annotation.*;

/**
 * @author OAdamastor
 *
 */
@XmlRootElement(name= "fieldType" )
public class IdFieldSimpleImpl implements IdField {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@XmlElement
	private String testfield ;
	
	
	
	private String fieldName ;
	
	
	private Class<?> classReference ;
	
	
	private int[] inMapsList ;
	
	
	private int[] keyInMapsList ;
	
	
	private int storeSID ;
	
	
	private int fieldID ;
	private int loadingPriority ;

	public IdFieldSimpleImpl( ) {
		
		
		
	}
	
	/**
	 * Constructor of immutable objects : 
	 * pending : how to add / remove fiel/maps mappings 
	 */
	public IdFieldSimpleImpl(String fName, Class<?> classref,
			int[] f_inMapsList , int[] f_KeyInMapsList,
			int f_storeSID, int f_fieldID, int f_loadingPriority ) {
		
		this.classReference = classref ;
		this.fieldName = fName ;
		this.inMapsList = f_inMapsList ;
		this.keyInMapsList = f_KeyInMapsList ;
		this.storeSID = f_storeSID ;
		this.fieldID = f_fieldID ;
		this.loadingPriority = f_loadingPriority ;
		
	}

	
	
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Class<?> getClassReference() {
		return classReference;
	}

	public void setClassReference(Class<?> classReference) {
		this.classReference = classReference;
	}

	public int[] getInMapsList() {
		return inMapsList;
	}

	public void setInMapsList(int[] inMapsList) {
		this.inMapsList = inMapsList;
	}

	public int[] getKeyInMapsList() {
		return keyInMapsList;
	}

	public void setKeyInMapsList(int[] keyInMapsList) {
		this.keyInMapsList = keyInMapsList;
	}

	public int getStoreSID() {
		return storeSID;
	}

	public void setStoreSID(int storeSID) {
		this.storeSID = storeSID;
	}

	public int getFieldID() {
		return fieldID;
	}

	public void setFieldID(int fieldID) {
		this.fieldID = fieldID;
	}

	public int getLoadingPriority() {
		return loadingPriority;
	}

	public void setLoadingPriority(int loadingPriority) {
		this.loadingPriority = loadingPriority;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fieldName == null) ? 0 : fieldName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof IdFieldSimpleImpl)) {
			return false;
		}
		IdFieldSimpleImpl other = (IdFieldSimpleImpl) obj;
		if (fieldName == null) {
			if (other.fieldName != null) {
				return false;
			}
		} else if (!fieldName.equals(other.fieldName)) {
			return false;
		}
		return true;
	}

	
	
	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.IdField#getFieldClass()
	 */
	
	
	

}
