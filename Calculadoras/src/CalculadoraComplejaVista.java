import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
/*
 * Rodrigo
 * Nov 2018
 * CalculadoraComplejaVista
 */
public class CalculadoraComplejaVista extends JFrame {
	protected JTextField parteRealNum1,parteImaginariaNum1, parteRealNum2,parteImaginariaNum2,resultado;
	protected JButton mas,menos,mult,div,igual;
	private JLabel pR1,pI1, pR2,pI2;
	
	public CalculadoraComplejaVista (String titulo) {
		super(titulo);
		
		pR1= new JLabel("Parte real número 1: ");
		parteRealNum1= new JTextField(10);
		pI1= new JLabel("Parte imaginaria número 1: ");
		parteImaginariaNum1= new JTextField(10);
		pR2= new JLabel("Parte real número 2: ");
		parteRealNum2= new JTextField(10);
		pI2= new JLabel("Parte imaginaria número 2: ");
		parteImaginariaNum2= new JTextField(10);
		mas=new JButton("+");
		menos=new JButton("-");
		mult=new JButton("x");
		div=new JButton("/");
		igual= new JButton("=");
		resultado= new JTextField("Resultado: ");
		
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(2,2));
		Border gap=BorderFactory.createEmptyBorder(2,2,2,2);
		p.setBorder(gap);
		p.add(parteRealNum1);
		p.add(parteImaginariaNum1);
		p.add(parteRealNum2);
		p.add(parteImaginariaNum2);
		p.add(mas);
		p.add(menos);
		p.add(mult);
		p.add(div);
		p.add(igual);
		p.add(resultado);
		this.add(p);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(1000, 1000, 1000, 2000);
	}
}
