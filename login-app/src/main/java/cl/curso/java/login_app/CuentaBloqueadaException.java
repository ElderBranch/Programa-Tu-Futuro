package  cl.curso.java.login_app;
/**
 * @author mFuentes
 *
 */
public class CuentaBloqueadaException extends Exception {

	private static final long serialVersionUID = 4944876324427607785L;

	/**
	 * @param message
	 */
	public CuentaBloqueadaException(String message) {
		super(message);
	}
}
