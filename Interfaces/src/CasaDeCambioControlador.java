
    /* Ejemplo de GUI
	 * Silvia Guardati
	 * Agosto - diciembre de 2014
	 * M�dulo "Controlador".
	 */

// Se importan clases para el manejo de eventos
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CasaDeCambioControlador extends CasaDeCambioVista{
			
		public CasaDeCambioControlador(String titulo) {
			super(titulo);
			calcular.addActionListener(new Escuchador());
		}
		
		
			
		//M�todo que convierte pesos a divisas extranjeras. EST� INCOMPLETO
		private double conPesosAOtras(String monD, double cantidad){
			double res;
			if (monD.equals("Euros"))
				res = cantidad / 18;
			else if (monD.equals("D�lar EUA"))
				res = cantidad / 13.4;
			else
				res = cantidad / 18.5;
			return res;	
		}
		

		
		private class Escuchador implements ActionListener { //Clase privada
		
			//INCOMPLETO.
			public void actionPerformed(ActionEvent ev) {
				double cantidad, resultado;
				String monO, monD;
				
				resultado = -1;
				resultadoTA.setText("");
				monO = (String) origenCB.getSelectedItem();	
				monD = (String) destinoCB.getSelectedItem();	
				cantidad = Double.parseDouble(cantidadTF.getText());
				
				if (!monO.equals(monD))
					if (monO.equals("Pesos"))
						resultado = conPesosAOtras(monD, cantidad);
		/*			else if (monO.equals("Euros"))
						resultado = conEurosAOtras(monD);
					else if (monO.equals("D�lar EUA"))
						resultado = conDolEUAAOtras(monD);
		 */
				
				resultadoTA.append("$" + resultado);
			}
	}
		public static void main(String[] args) {

			CasaDeCambioControlador of = new CasaDeCambioControlador("Casa de Bolsa LA HONESTA");
		}
	}

	/* ACTIVIDAD A DESARROLLAR POR LOS ALUMNOS:
	 * 
	 *  1) Analiza el c�digo.
	 *  2) Completa el c�digo del escuchador para que pueda convertir 
	 *  diferentes tipos de monedas.
	 *  3) �Podr�as estructurar distinto el c�digo del escuchador?
	 *  4) �Podr�as hacerlo m�s robusto? (Por ej. que errores en los datos no 
	 *  interrumpan la ejecuci�n.)
	 */

