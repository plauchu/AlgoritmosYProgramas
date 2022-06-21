/* Rodrigo
 * Sept 2018
 * Ejercicio
 */
public class PrimerEjercicioConObjetos {

	public static void main(String[] args) {
		Rectangulo r;
		Circulo c;
		double l,a, rad;
		
		r= new Rectangulo();
		l=r.getLargo();
		System.out.println("El largo es "+l);
		r.setLargo(8.5);
		l=r.getLargo();
		System.out.println("El largo es "+l);
		
		c= new Circulo(3.2);
		rad= c.getRadio();
		System.out.println("El radio es "+rad);
		
		
		
		
	}

}
