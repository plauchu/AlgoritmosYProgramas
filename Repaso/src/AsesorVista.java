import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.GridLayout;
import javax.swing.*;
/*
 * Rodrigo
 * Dec2018
 * AsesorVista
 */
public class AsesorVista extends JFrame {
	
	protected JPanel miPanel;
	protected Border miBorde;
	protected JLabel lEdad, lCant, lCasa, lDepend, lRecom,lNulo;
	protected JButton btRecom;
	protected JTextField tfEdad, tfCant, tfCasa, tfDepend, tfRecom;
	
	public AsesorVista () {
		super("ONG: Ayudando a ahorrar");
		
		miPanel= new JPanel ();
		miPanel.setLayout(new GridLayout (6,2));
		miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);
		miPanel.setBorder(miBorde);
		
		lEdad= new JLabel("Edad del inversionista: ");
		miPanel.add(lEdad);
		tfEdad= new JTextField();
		miPanel.add(tfEdad);
		lCant= new JLabel("Cantidad que quiere invertir: ");
		miPanel.add(lCant);
		tfCant= new JTextField();
		miPanel.add(tfCant);
		lCasa= new JLabel("¿Tiene casa propia?: ");
		miPanel.add(lCasa);
		tfCasa= new JTextField();
		miPanel.add(tfCasa);
		lDepend= new JLabel("¿Tiene dependientes?: ");
		miPanel.add(lDepend);
		tfDepend= new JTextField();
		miPanel.add(tfDepend);
		btRecom = new JButton("Recomendación");
		miPanel.add(btRecom);
		lNulo= new JLabel();
		miPanel.add(lNulo);
		lRecom= new JLabel("Se recomienda: ");
		miPanel.add(lRecom);
		tfRecom= new JTextField();
		miPanel.add(tfRecom);
		
		this.add(miPanel);
		
		this.setBounds(50,50,400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	

}
