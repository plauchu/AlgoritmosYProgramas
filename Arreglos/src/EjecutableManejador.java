/* Rodrigo
 * Oct 2018
 * EjecutableManejadorArreglos
 */
import java.util.ArrayList;
import java.util.Scanner;
public class EjecutableManejador {
private final static int CELDAS=10;
	
	public static void imprimeArreglo(double[] arr, int n) {
		for (int i=0; i<n; i++) {
			System.out.print("\t" +arr[i]);
		System.out.println();
		}
	}
	
	public static int leeArreglo(double [] arr) {
		int n;
		Scanner lec= new Scanner(System.in);
		System.out.println("Cuántas celdas quieres que tenga tu arreglo? MAX: "+CELDAS);
		n=lec.nextInt();
		System.out.println("Dame los "+n+" valores del arreglo");
		for (int i=0; i<n; i++) {
			arr[i]= lec.nextDouble();
			System.out.println(arr[i]);
		}
		return n;
	}
	
	public static void main(String[] args) {
		double arre[]= {1,2,3,4,5};
		int n,posMay;
		double p;
		ArrayList<Integer> indices;
		
		/* n=leeArreglo(arre);
		imprimeArreglo(arre,n);
		System.out.println(ManejadorArreglos.suma(arre, n));
		p=ManejadorArreglos.promedio(arre, n);
		System.out.println(p);
		indices=ManejadorArreglos.cualesMayX(arre, n, 4.0);
		System.out.println(indices.toString());
		
		for (int i=0; i<indices.size(); i++)
			System.out.println(arre[indices.get(i)]);
		*/
		//ManejadorArreglos.seleccionDirecta(arre,arre.length);
		//imprimeArreglo(arre,arre.length);
		p=ManejadorArreglos.busBinaria(arre, arre.length, 4);
		System.out.println(p);
	}
	
}
