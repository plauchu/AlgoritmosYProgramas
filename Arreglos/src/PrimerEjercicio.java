/* Rodrigo
 * Oct 2018
 * PrimerEjercicioConArreglos
 */
import java.util.ArrayList;

public class PrimerEjercicio {
	public static ArrayList<Double> ullman(double n){
		ArrayList<Double> lista=new ArrayList<Double>();
		
		lista.add(n);
		while (n>1) {
			
		if(n%2==0)
			n=n/2;
		else
			n=n*3+1;
		lista.add(n);
		}
		return lista;
	}
	public static double[] fibonacci(int n) {
		double[] r=new double[n];
		
		r[0]=0;
		r[1]=1;
		
		for(int i=2;i<n;i++){
			r[i]=r[i-2]+r[i-1];
			
	}
		return r;
	}
}
