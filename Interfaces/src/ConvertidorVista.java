import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*
 * Rodrigo
 * Nov 2018
 * VistaCovertidor
 */
public class ConvertidorVista extends JFrame {
	private JLabel millasLb, kmsLb;
	protected JTextField millasTxt, kmsTxt;
	
	public ConvertidorVista(String titulo) {
		super(titulo);
		
		millasLb= new JLabel("Millas: ");
		kmsLb= new JLabel("Kilómetros: ");
		millasTxt= new JTextField(10);
		kmsTxt= new JTextField(10);
		
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(2,2));
		Border gap=BorderFactory.createEmptyBorder(2,2,2,2);
		p.setBorder(gap);
		p.add(kmsLb);
		p.add(kmsTxt);
		p.add(millasLb);
		p.add(millasTxt);
		this.add(p);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(1000, 1000, 1000, 2000);
		
	}
	
	/*
	// Main provisional
	public static void main(String[] args) {
		ConvertidorVista yo= new ConvertidorVista("P R U E B A");
		
		

	}
	*/
}
