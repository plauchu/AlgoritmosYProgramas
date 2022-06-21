import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Rodrigo
 * Dec2018
 * AsesorControlador
 */
public class AsesorControlador extends AsesorVista{
	
	
	public AsesorControlador() {
		
		btRecom.addActionListener(new Escuchador());

	}
	public class Escuchador implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String edad,cantidad,casa,dependientes;
			int ed;
			double cant;
			boolean cas, depend;
		
			edad= tfEdad.getText();
			cantidad =tfCant.getText();
			casa= tfCasa.getText();
			dependientes= tfDepend.getText();
			
			ed= Integer.parseInt(edad);
			cant= Double.parseDouble(cantidad);
			cas= Boolean.parseBoolean(casa);
			depend= Boolean.parseBoolean(dependientes);
			
			if(ed>=65)
				tfRecom.setText("Fondo con rendimiento fijo");
			else
				if(ed>50 && ed<65 && cas==true && depend== false)
					tfRecom.setText("Fondo de inversión tipo A");
				else
					if(ed>50 && ed<65 && cas==false || depend==true)
						tfRecom.setText("Fondo de inversión tipo B");
					else
						if(ed<=50 && cas==true)
							tfRecom.setText("Fondo de inversión tipo C");
						else
							if(ed<=50 && cas==false)
								tfRecom.setText("Fondo de inversión tipo B");
		}
		
	}

	public static void main(String[] args) {
		AsesorControlador miVista= new AsesorControlador();
	}
	

}
