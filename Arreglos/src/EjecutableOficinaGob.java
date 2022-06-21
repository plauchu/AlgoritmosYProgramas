import java.util.Scanner;
/* Rodrigo
 * Oct 2018
 * OficinaGobierno
 */
public class EjecutableOficinaGob {
	
	public static void main(String[] args) {
		double poblacion[]=new double[32];
		String nombreEdos[]=new String[32];
		OficinaGob ofi= new OficinaGob();
		ofi.setEncargado("Martín Cuenta");
		
		
		ofi.altaInfo("San Luis", 2000000);
		ofi.altaInfo("D.F", 20000000);
		ofi.altaInfo("Toluca", 1000000);
		ofi.altaInfo("Hidalgo", 3000000);
		ofi.altaInfo("Oaxaca", 500000);
	
		System.out.println(ofi.toString());
		System.out.println("El estado con mayor población es: " +ofi.nomEdoMayPob());
		System.out.println("El promedio de habitantes es: " +ofi.promHab());
		System.out.println("Los estados con menor población al promedio son: " +ofi.totalEdosPobMenProm());
	}

}
