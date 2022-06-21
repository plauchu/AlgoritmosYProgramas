import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Rodrigo
 * Nov 2018
 * Convertidor
 */
public class ConvertidorControlador extends ConvertidorVista {
	
	public ConvertidorControlador(String titulo) {
		super(titulo);
		
		kmsTxt.addActionListener(new KilometrosEscuchador());
		millasTxt.addActionListener(new MillasEscuchador());
		
		
	}
	private class KilometrosEscuchador implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			//Sucede si se detona <enter> en kmsTxt
			String kmsStr, millasStr;
			double kmsNum, millasNum;
			final double FACTOR=1.608;
			
			kmsStr=kmsTxt.getText();
			kmsNum=Double.parseDouble(kmsStr);
			millasNum=kmsNum/FACTOR;
			millasStr=""+millasNum;
			millasTxt.setText(millasStr);
			
			
			
		}
		
	}
private class MillasEscuchador implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			//Sucede si se detona <enter> en millasTxt
			System.out.println("Dió enter en millasTxt");
			
		}
		
	}

	public static void main(String[] args) {
		ConvertidorControlador yo = new ConvertidorControlador("Convertidor KM a MILAS");
	}

}
