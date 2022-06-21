import java.util.Scanner;
/* Rodrigo
 * Oct 2018
 * EscuelaNataciónEjecutable
 */
public class EjecutableNatacion {

	public static void main(String[] args) {
		double albercas[]=new double[50];
		EscuelaNatacion esc=new EscuelaNatacion("Nelson Vargas", "Popócatepetl #12");
		esc.altaAlberca(10, 20);
		esc.altaAlberca(20, 20);
		esc.altaAlberca(30, 20);
		esc.altaAlberca(40, 20);
		esc.altaAlberca(50, 20);
		System.out.println(esc.toString());
		System.out.println("Precio techado "+1000*esc.metrosCuadDeAlbercas());
	}

}
