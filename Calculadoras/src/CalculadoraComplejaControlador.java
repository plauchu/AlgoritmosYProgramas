import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Rodrigo
 * Nov 2018
 * CalculadoraComplejaControlador
 */
public class CalculadoraComplejaControlador extends CalculadoraComplejaVista {
	
	char operador;
	CalculaComplejo cal= new CalculaComplejo();
	Complejo c;
	
	public CalculadoraComplejaControlador(String titulo) {
		super(titulo);
		
		parteRealNum1.addActionListener(new parteRealEscuchador1());
		parteImaginariaNum1.addActionListener(new parteImaginariaEscuchador1());
		parteRealNum2.addActionListener(new parteRealEscuchador2());
		parteImaginariaNum2.addActionListener(new parteImaginariaEscuchador2());
		mas.addActionListener(new escuchadorMas());
		menos.addActionListener(new escuchadorMenos());
		mult.addActionListener(new escuchadorMult());
		div.addActionListener(new escuchadorDiv());
		igual.addActionListener(new escuchadorIgual());
	}
	private class parteRealEscuchador1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.out.println("Dió enter en parte real 1");
			
		} 
		
	}
	private class parteImaginariaEscuchador1 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Dió enter en parte imaginaria 1");
			
		}
		
	}
	private class parteRealEscuchador2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Dió enter en parte real 2");
			
		}
		
	}
	private class parteImaginariaEscuchador2 implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Dió enter en parte imaginaria 2");
			
		}
		
	}
	private class escuchadorMas implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=resultado.getText();
			cal.suma();
			operador='+';
			resultado.setText("");
			
		}
		
	}
	private class escuchadorMenos implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=resultado.getText();
			cal.resta();
			operador='-';
			resultado.setText("");
			
		}
		
	}
	private class escuchadorMult implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=resultado.getText();
			cal.multiplicacion();
			operador='x';
			resultado.setText("");
		}
		
	}
	private class escuchadorDiv implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String x;
			x=resultado.getText();
			cal.division();
			operador='/';
			resultado.setText("");
		}
	
	}
	private class escuchadorIgual implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String x, sIgual;
			CalculaComplejo igual= new CalculaComplejo();
			x= resultado.getText();
			switch(operador){
			case('+'):{
				igual.suma();
				break;
			}
			case('-'):{
				igual.resta();
				break;
			}
			case('x'):{
				igual.multiplicacion();
				break;
			}
			case('/'):{
				igual.division();
				break;
			}
			}
			sIgual= String.valueOf(igual);
			resultado.setText(sIgual);
		}
	}
	
	public static void main(String[] args) {
		CalculadoraComplejaControlador yo= new CalculadoraComplejaControlador("Calculadora Compleja");

	}

}
