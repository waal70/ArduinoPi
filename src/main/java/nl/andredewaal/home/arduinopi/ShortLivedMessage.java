/**
 * 
 */
package nl.andredewaal.home.arduinopi;

/**
 * @author awaal
 *
 */
public class ShortLivedMessage implements LCDMessage {
	
	/**
	 * 
	 */
	public ShortLivedMessage() {
		//default for shortlived is 10 seconds:
		this(10000L);
	}

	long TTL = 0L;
	/**
	 * @param tTL
	 */
	public ShortLivedMessage(long tTL) {
		super();
		TTL = tTL;
	}

	public void display() {
		// TODO Auto-generated method stub

	}

}
