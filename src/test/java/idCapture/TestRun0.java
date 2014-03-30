/**
 * 
 */
package idCapture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import idMap.idcapture.sf.net.IdWorldSimpleImpl;
import idMap.idcapture.sf.net.IdsWorld;

/**
 * @author OAdamastor
 *
 */
public class TestRun0 {

	/**
	 * 
	 */
	public TestRun0() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello");
		
		
		try {
			IdsWorld myworld = new IdWorldSimpleImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of job");
		
	}

}
