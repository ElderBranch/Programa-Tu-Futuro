/**
 * 
 */
package cl.curso.java.login_app;

/**
 * @author matiasF
 *
 */
public class Programa {
	
	
	
	public static void main(String[] args) {
		try {
			Conexion conexion = Conexion.getInstancia();
			Conexion conexion2 = Conexion.getInstancia();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
