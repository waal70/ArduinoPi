/**
 * 
 */
package nl.andredewaal.home.arduinopi;

/**
 * @author awaal
 *
 */
public interface LCDMessage {
	
	
	public long TTL = 9223372036854775807L; //max value for Long datatype
	public void display();
	public String toString();
	

}
