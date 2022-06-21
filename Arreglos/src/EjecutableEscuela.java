import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/* Rodrigo
 * Oct 2018
 * EjecutableEscuela
 */
public class EjecutableEscuela {

	public static void main(String[] args) {
		Alumno a;
		String nombre, genero,carrera,nomMat;
		int ahoNac,semestre, cantMat=1;
		double cal;
		Escuela esc= new Escuela("Infierno","Río hondo");
		File archivoEntrada= new File("Alumnos.txt");
		
		try(Scanner lec=new Scanner(archivoEntrada)){
			for(int i=1; i<=5; i++) {
				System.out.println("Por favor Ingrese: Nombre, género, año de nacimiento, semestre, y carrera");
				nombre= lec.next();
				genero= lec.next();
				ahoNac= lec.nextInt();
				semestre= lec.nextInt();
				carrera= lec.next();
				
				
				a=new Alumno(nombre,genero,ahoNac,semestre, carrera);
				for(int j=0; i<cantMat;i++) {
					nomMat=lec.next();
					cal=lec.nextDouble();
					a.altaInfo(nomMat, cal);
				}
				System.out.println(a.toString());
			}
			lec.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("MUY MAL" +fnfe);
			System.exit(-1);
		

	}
		
	}

}
