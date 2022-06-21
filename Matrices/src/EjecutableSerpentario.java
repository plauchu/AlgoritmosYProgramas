/*
 * Rodrigo
 * Nov 2018
 * EjecutableSerpiente
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class EjecutableSerpentario {

	public static void main(String[] args) {
		Serpentario casa=new Serpentario("Serpentes","Rio hondo");
		int clave,ren;
		String tipo,alimento;
		double longitud,peso;
		char genero;
		boolean res;
		
		
		File archivoEntrada= new File("serpientes.txt");
		
		try(Scanner lec=new Scanner(archivoEntrada)){
			for(int i=0; i<5; i++) {
				System.out.println("Clave, tipo, longitud, peso, alimento, género de la serpiente y renglón perteneciente");
				clave=lec.nextInt();
				tipo=lec.nextLine();
				longitud=lec.nextDouble();
				peso=lec.nextDouble();
				alimento=lec.nextLine();
				genero=lec.next().charAt(0);
				ren=lec.nextInt();
				
				res=casa.altaSerpiente(clave, tipo, longitud, peso, alimento, genero, ren);
				
				
			}
		
			lec.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("Hubo un error" +fnfe);
			System.exit(-1);
		}
		

	}

}
