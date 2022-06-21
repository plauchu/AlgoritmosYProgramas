/* Rodrigo
 * Oct 2018
 * PruebaManejadorArreglosGenericos
 */
public class PruebaManejadorArreglosGen {
	
	public static <T> void imprimeArreglo (T[] a, int n){
		for(int i=0; i<n;i++)
			System.out.print("\t"+a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		String[] a= {"José", "Alejandro", "Estefanía", "Raúl"};
		
		imprimeArreglo(a,a.length);
		ManejadorArreglosGenericos.seleccionDirecta(a, a.length);
		imprimeArreglo(a,a.length);
	}

}
