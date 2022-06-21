import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * Prueba Científico Matemático
 */
public class PruebaCientificoMatematico {

	public static void main(String[] args) {
		CientificoMatematico CM=new CientificoMatematico("Euclides","Matemáticas");
		
		System.out.print(CM);
		System.out.print("\n"+CM.estaOrdenCreciente(2,4));
		System.out.print("\n"+CM.ordenCreciente(2,4));
		System.out.print("\n"+CM.esImpar(4));
		System.out.print("\n"+CM.calculaFuncion1(4));
		System.out.print("\n"+CM.calculaFuncion2(4));
		System.out.print("\n"+CM.calculaFuncion3(2,3));
		System.out.print("\n"+CM.multiplica(4,4));
		System.out.print("\n"+CM.potencia(4,2));
		System.out.print("\n"+CM.factorial(5));
		System.out.print("\n"+CM.fibonacci(4));
		System.out.print("\n"+CM.ullman(26));

	}

}
