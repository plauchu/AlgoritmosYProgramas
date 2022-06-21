import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * Prueba Banco
 */
public class PruebaBanco {

	public static void main(String[] args) {
		Banco c2= new Banco("Eduardo",2);
		c2.deposito(5000);
		System.out.print(c2.toString());
	}

}
