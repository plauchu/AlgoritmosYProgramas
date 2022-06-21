/*
 * Rodrigo
 * Nov 2018
 * CalculadoraControlador
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador extends CalculadoraVista{
	
	double oper1;
	char operador;
	
	public CalculadoraControlador(){
		super();
	
		bt1.addActionListener(new Escucha1());
		bt2.addActionListener(new Escucha2());
		bt3.addActionListener(new Escucha3());
		bt4.addActionListener(new Escucha4());
		bt5.addActionListener(new Escucha5());
		bt6.addActionListener(new Escucha6());
		bt7.addActionListener(new Escucha7());
		bt8.addActionListener(new Escucha8());
		bt9.addActionListener(new Escucha9());
		bt0.addActionListener(new Escucha0());
		btMas.addActionListener(new EscuchaOperadorMas());
		btMenos.addActionListener(new EscuchaOperadorMenos());
		btPor.addActionListener(new EscuchaOperadorPor());
		btEntr.addActionListener(new EscuchaOperadorEntre());
		btIgual.addActionListener(new EscuchaOperadorIgual());
		btClear.addActionListener(new EscuchaClear());
	}
	public class Escucha1 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"1";
			tfNum.setText(x);
		}
	}
	public class Escucha2 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"2";
			tfNum.setText(x);
		}
	}
	public class Escucha3 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"3";
			tfNum.setText(x);
		}
	}
	public class Escucha4 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"4";
			tfNum.setText(x);
		}
	}
	public class Escucha5 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"5";
			tfNum.setText(x);
		}
	}
	public class Escucha6 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"6";
			tfNum.setText(x);
		}
	}
	public class Escucha7 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"7";
			tfNum.setText(x);
		}
	}
	public class Escucha8 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"8";
			tfNum.setText(x);
		}
	}
	public class Escucha9 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"9";
			tfNum.setText(x);
		}
	}
	public class Escucha0 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			x=x+"0";
			tfNum.setText(x);
		}
	}
	public class EscuchaOperadorMas implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			oper1= Double.parseDouble(x);
			operador='+';
			tfNum.setText("");
		}
	}
	public class EscuchaOperadorMenos implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			oper1= Double.parseDouble(x);
			operador='-';
			tfNum.setText("");
		}
	}
	public class EscuchaOperadorPor implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			oper1= Double.parseDouble(x);
			operador='x';
			tfNum.setText("");
		}
	}
	public class EscuchaOperadorEntre implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=tfNum.getText();
			oper1= Double.parseDouble(x);
			operador='/';
			tfNum.setText("");
		}
	}
	public class EscuchaOperadorIgual implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x, sIgual;
			double oper2, igual = 0;
			x= tfNum.getText();
			oper2= Double.parseDouble(x);
			switch(operador){
			case('+'):{
				igual= oper1+oper2;
				break;
			}
			case('-'):{
				igual= oper1-oper2;
				break;
			}
			case('x'):{
				igual= oper1*oper2;
				break;
			}
			case('/'):{
				igual=oper1/oper2;
				break;
			}
			}
			sIgual= String.valueOf(igual);
			tfNum.setText(sIgual);
		}
	}
	
	public class EscuchaClear implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			tfNum.setText("");
		}
		
	}
	public static void main(String[] args) {
		CalculadoraControlador yo= new CalculadoraControlador();

	}
	
}
