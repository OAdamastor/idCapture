/**
 * 
 */
package idCapture;

import net.sf.idcapture.idMap.IdWorldSimpleImpl;
import net.sf.idcapture.idMap.IdsWorld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

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
			IdsWorld myworld = new IdWorldSimpleImpl(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of job");
		
	}

}
