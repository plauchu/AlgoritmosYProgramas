
/* Ejemplo de GUI
 * Silvia Guardati
 * Agosto - diciembre de 2014
 * M�dulo "Vista".
 */

// Se importan las clases necesarias para el manejo de GUI
import java.awt.*;
import javax.swing.*;

public class CasaDeCambioVista extends JFrame {

	/**
	 *  Atributos de la clase. Ejemplos de componentes
	 *  de GUI
	 */
	private static final long serialVersionUID = 1L;
	private JLabel monedaDispL, monedaDesL, cantidadL, resuL;
	private String monedas[] = {"Pesos", "Euros", "D�lar EUA", "Libras", "D�lar Can"};
	protected JTextField cantidadTF;
	protected JTextArea resultadoTA;
	protected JComboBox origenCB, destinoCB;
	protected JButton calcular;
	
	public CasaDeCambioVista(String titulo) { 
		super(titulo);
		
		// Se crean los componentes de la interfaz (GUI)
		
		//Etiquetas para los campos y las �reas de texto
		monedaDispL = new JLabel("�Qu� moneda tienes?");
		monedaDesL = new JLabel("�A qu� moneda quieres cambiar?");
		cantidadL = new JLabel("�Cu�nto quieres cambiar?");
		resuL = new JLabel("Resultado de la operaci�n");
		
		//Se crea campo de texto (ingreso de valores por parte del usuario)
		cantidadTF = new JTextField(6);
		
		//Se crean �rea de texto (desplegar resultados)
		resultadoTA = new JTextArea(3,8);
		
		//Se crean los combos boxes
		origenCB = new JComboBox(monedas);
		destinoCB = new JComboBox(monedas);
			
		//Se crea el bot�n
		calcular = new JButton("Calcular");
		calcular.setBackground(Color.CYAN);  //Color de fondo
		calcular.setForeground(Color.BLACK);  //Color de las letras
			
		// Se define la forma del contenedor 
		this.setLayout(new FlowLayout()); 
		
		JPanel pc1 = new JPanel();
		pc1.setBackground(Color.LIGHT_GRAY); //Se pone color al panel
		pc1.add(monedaDispL);  //Se agrega una etiqueta al panel
		pc1.add(origenCB); //Se agrega un combo box al panel
					
		JPanel pc2 = new JPanel();
		pc2.setBackground(Color.PINK); //Se pone color al panel
		pc2.add(monedaDesL); 
		pc2.add(destinoCB); //Se agrega un combo box al panel
		
		JPanel pc3 = new JPanel();
		pc3.setBackground(Color.WHITE); //Se pone color al panel
		pc3.add(cantidadL); 
		pc3.add(cantidadTF); 
			
		JPanel pc4 = new JPanel();
		pc4.add(resuL);
		pc4.add(new JScrollPane(resultadoTA));
		
		// Se colocan los componentes en el contenedor
		this.add(pc1);         //Se agrega el panel 1 a la ventana
		this.add(pc2);   //Se agrega el panel 2 a la ventana
		this.add(pc3);       //Se agrega el panel 3 a la ventana
		this.add(calcular);
		this.add(pc4);       //Se agrega el panel 3 a la ventana
		
		// Se habilita la ventana
		this.setBounds(20, 20, 500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );
	}
	
	
	public static void main(String[] args) {
		CasaDeCambioVista captura = new CasaDeCambioVista("Ganamos siempre...");
	}
}

/* ACTIVIDAD A DESARROLLAR POR LOS ALUMNOS:
 * 
 *  1) Analiza el c�digo.
 *  2) Modifica el c�digo adapt�ndolo a tu gusto (color, etc.)
 */