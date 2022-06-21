/* Rodrigo
 * Sept 2018
 * Ejercicio3
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Rectangulo m1,m2,m3;
		double l,a,tot,mesa1,mesa2,mesa3;
				
		m1= new Rectangulo(2,1.8);
		l=m1.getLargo();
		System.out.println("El largo de la mesa 1 es "+l);
		mesa1=l;
		m2= new Rectangulo(1,1.5);
		l=m2.getLargo();
		System.out.println("El largo de la mesa 2 es "+l);
		mesa2=l;
		m3= new Rectangulo(3,2);
		l=m3.getLargo();
		System.out.println("El largo de la mesa 3 es "+l);
		mesa3=l;
		tot= mesa1+mesa2+mesa3 ; 
		System.out.println("El espacio ocupado por las mesas es "+tot);
		

	}

}
