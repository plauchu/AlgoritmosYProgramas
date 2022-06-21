import java.util.ArrayList;
/*
 * Rodrigo Plauchú Rodríguez
 * EjercicioPruebaExamen
 * CalculaIMC
 * Oct2018
 */
public class CalculaIMC {

	private static ArrayList<String> calculaIMC(String[] nom, double []peso, double[] estatura) {
		ArrayList<String> lista= new ArrayList();
		double iMC;
		
		for(int i=0; i<nom.length;i++) {
			iMC= peso[i]/Math.pow(estatura[i], 2);
			if(iMC<25)
				lista.add(nom[i]);
		}
		
		return lista;
	}
	

	public static void main(String[] args) {
		String[] nom= {"Juan", "Sofía", "Ana", "Beatriz", "Carlos", "Isabel"};
		double[] peso= {50, 70, 60, 60, 75, 68};
		double[] estatura= {1.65, 1.70, 1.68, 1.58, 1.65, 1.50};
		
		System.out.println(calculaIMC(nom, peso, estatura));
		

	}

}
