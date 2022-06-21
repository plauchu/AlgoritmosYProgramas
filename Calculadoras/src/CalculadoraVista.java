import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Rodrigo
 * Nov 2018
 * CalculadoraVista
 */
public class CalculadoraVista extends JFrame {
	
	protected JPanel miPanel;
	protected Border miBorde;
	protected JLabel et1, et2, et3;
	protected JTextField tfNum;
	protected JButton bt1, bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0, btClear;
	protected JButton btMas, btMenos, btPor, btEntr, btIgual;
	
	public CalculadoraVista(){
		super("Calculadora"); 
		miPanel= new JPanel();
		miPanel.setLayout(new GridLayout(5,4)); //filas columnas cuadricula 
		miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);  
		miPanel.setBorder(miBorde);
		miPanel.setBackground(Color.blue);
		//primer renglón 
		tfNum= new JTextField();
		tfNum.setText("");
		miPanel.add(tfNum);
		btClear= new JButton("c");
		miPanel.add(btClear);
		et2= new JLabel("");
		miPanel.add(et2);
		et3= new JLabel("");
		miPanel.add(et3);
		//segundo renglón
		bt1= new JButton("1");
		miPanel.add(bt1);
		bt2= new JButton("2");
		miPanel.add(bt2);
		bt3= new JButton("3");
		miPanel.add(bt3);
		btMas= new JButton("+");
		miPanel.add(btMas);
		//tercer renglón
		bt4= new JButton("4");
		miPanel.add(bt4);
		bt5= new JButton("5");
		miPanel.add(bt5);
		bt6= new JButton("6");
		miPanel.add(bt6);
		btMenos= new JButton("-");
		miPanel.add(btMenos);
		//cuarto renglón 
		bt7= new JButton("7");
		miPanel.add(bt7);
		bt8= new JButton("8");
		miPanel.add(bt8);
		bt9= new JButton("9");
		miPanel.add(bt9);
		btPor= new JButton("x");
		miPanel.add(btPor);
		//quinto renglón
		bt0= new JButton("0");
		miPanel.add(bt0);
		btEntr= new JButton("/");
		miPanel.add(btEntr);
		btIgual= new JButton("=");
		miPanel.add(btIgual);
		
		this.add(miPanel);
		
		this.setBounds(400, 400, 300, 220);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	

}