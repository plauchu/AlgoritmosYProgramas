
/* Ejemplo de GUI
 * Silvia Guardati
 * Agosto - diciembre de 2014
 * M�dulo "Controlador".
 */

// Se importan las clases necesarias para el manejo de los eventos.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvierteControlador extends ConvierteVista{

		/* Atributos heredados:
		 * protected JTextField kilometros, millas;
		 */
	
		private final double FACTOR = 1.609344;  // km por mi
		
		/* Constructor: asociado un "escuchador" a cada campo de
		 * texto de la "vista".
		 */
		public ConvierteControlador(String nombre) {
			super(nombre);
			millas.addActionListener(new EscuchadorMillas());
			kilometros.addActionListener(new EscuchadorKilometros());
		}
		
		/* Clase privada para implementar el comportamiento esperado de 
		 * los escuchadores.
		 */
		private class EscuchadorMillas implements ActionListener {
			
			// M�todo para convertir de millas a kms.
			public void actionPerformed(ActionEvent ae) {
				String kmString = "";
				String miString = millas.getText();
				
				if ( !miString.equals("") ) {
					double millasD = Double.parseDouble(miString);
					double kilometrosD = millasD*FACTOR;
					kmString = kmString + kilometrosD;
				}
				kilometros.setText(kmString);
			}
		}
		
		// M�todo para convertir de kms a millas.
		private class EscuchadorKilometros implements ActionListener {
			public void actionPerformed(ActionEvent ae) {
				String miString = "";
				String kmString = kilometros.getText();
				
				if (!kmString.equals("") ) {
					double kilometrosD = Double.parseDouble(kmString);
					double millasD = kilometrosD/FACTOR;
					miString = miString + millasD;
				}
				millas.setText(miString);
			}
		}
		
		public static void main(String[] args) {
			new ConvierteControlador("Acci�n");
		}
}

/* ACTIVIDAD A DESARROLLAR POR LOS ALUMNOS:
 * 
 *  1) Analiza el c�digo.
 *  2) Modifica el c�digo de los escuchadores con el objetivo de que sean
 *  robustos (en caso de error en la entrada no se interrumpa la ejecuci�n).
 */
