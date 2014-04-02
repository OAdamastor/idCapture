/**
 * 
 */
package net.sf.idcapture.idMap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;
/**
 * @author "OAdamastor"
 *
 */

@XmlRootElement(name="fieldsList") 
public class IdFieldsList implements Serializable {

	
	
	private List<IdFieldSimpleImpl> fields = new ArrayList<IdFieldSimpleImpl>();
	/**
	 * 
	 */
	public IdFieldsList() {
		// TODO Auto-generated constructor stub
	}
	public List<IdFieldSimpleImpl> getFields() {
		return fields;
	}
	public void setFields(List<IdFieldSimpleImpl> fields) {
		this.fields = fields;
	}

}
