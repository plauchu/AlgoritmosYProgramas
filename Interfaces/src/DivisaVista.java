
/* Ejemplo del uso de GUI en Java.
 * Silvia Guardati
 */

import java.awt.GridLayout;
import javax.swing.*;

// GUI simple para una casa de cambio. 
public class DivisaVista extends JFrame{
	private JLabel divisa, monto, resultado;
	protected JTextField div, mon, res;
	protected JButton aceptar;
	
	public DivisaVista(String t){
		super (t);
		
		divisa= new JLabel("Divisa");
		monto = new JLabel ("Monto");
		resultado = new JLabel("Resultado");
		
		div = new JTextField(6);
		mon = new JTextField(6);
		res = new JTextField(6);
		
		aceptar = new JButton("Aceptar");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,2));
		p.add(divisa);
		p.add(div);
		p.add(monto);
		p.add(mon);
		p.add(resultado);
		p.add(res);
		p.add(aceptar);
		
		this.add(p);
		this.setBounds(20, 20, 400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );
		
		
	}
	
	public static void main(String arg[]){
		new DivisaVista("Casa de Cambio- Pagamos el precio justo...");
	}	

}

/* Actividad:
 * 1) Crea una clase "Controlador" que use esta interface. 
 * Incluye manejo de excepciones. 
 * 2) Prueba tu soluci�n.
 */