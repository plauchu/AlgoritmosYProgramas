/* Rodrigo
 * Sept 2018
 * PruebaVentas
 */
public class PruebaVentas {

	public static void main(String[] args) {
		Ventas v1= new Ventas(850, "Juan");
		Ventas v2= new Ventas(2350, "Pepe");
		
		System.out.print(v1);
		System.out.print("\nComisión ganada por "+v1.getNombre()+" es: $"+v1.comision());
		System.out.print(v2);
		System.out.print("\nComisión ganada por "+v2.getNombre()+" es: $"+v2.comision());
	}

}
