/**
 * 
 */
package idMap.idcapture.sf.net;

import java.util.Date;
import java.util.List;

/**
 * @author pierre
 *
 */
public class CRecordSimpleImpl<T> implements CRecord<T> {

	
	private T value = null ;
	/**
	 * 
	 */
	public CRecordSimpleImpl() {
		// TODO Auto-generated constructor stub
	}

	public CRecordSimpleImpl(T newvalue ) {
		this.value = newvalue ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#getValue()
	 */
	public T getValue() {
		
		return this.value ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#setValue(java.lang.Object, idMap.idcapture.sf.net.AUser)
	 */
	public void setValue(Object newValue, AUser user) {
		
		this.value = (T) newValue ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#isDefined()
	 */
	public boolean isDefined() {
		if ( this.value == null )
			return false;
		else 
			return true ;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#lastChangedBy()
	 */
	public AUser lastChangedBy() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#lastAccesBy()
	 */
	public AUser lastAccesBy() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#createdBy()
	 */
	public AUser createdBy() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#lastChanged()
	 */
	public Date lastChanged() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#lastAcces()
	 */
	public Date lastAcces() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#created()
	 */
	public Date created() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see idMap.idcapture.sf.net.CRecord#getChanges()
	 */
	public List<CRecordChange> getChanges() {
		// TODO Auto-generated method stub
		return null;
	}

}
