/* Rodrigo
 * Oct 2018
 * EjecutableArreglos
 */
import java.util.ArrayList;
import java.util.Scanner;
public class EjecutableArreglos {
	private final static int CELDAS=150;
	
	
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
		double[] a=new double[CELDAS];
		ArrayList<Double> ull;
		double[]fib;
		int x, numCeldas;
		
		ull=PrimerEjercicio.ullman(26);
		System.out.println(ull.toString());
		x=3;
		System.out.println("El elemento "+x+" de tu lista Ullman es "+ull.get(x));
		fib=PrimerEjercicio.fibonacci(15);
		imprimeArreglo(fib,fib.length);
		System.out.println("El elemento "+x+" de tu lista Fibonacci es "+fib[x]);
		
		numCeldas=leeArreglo(a);
		imprimeArreglo(a,numCeldas);
	}

}
