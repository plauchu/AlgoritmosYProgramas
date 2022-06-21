import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 *  ClaseStringPruebaPersona
 *  Oct2018
 */
public class PruebaPersona {

	public static void main(String[] args) {
		Persona p= new Persona("PARR990714HDFLDD05");
		String curp, nom, dir, tel, edoCivil;
		File archivoEntrada= new File("personas.txt");
		
		try(Scanner lec=new Scanner(archivoEntrada)){
				while(lec.hasNext())
				System.out.println("Por favor Ingrese: curp, nombre, dirección, teléfono y estado civil");
				curp= lec.next();
				nom= lec.next();
				dir= lec.next();
				tel= lec.next();
				edoCivil= lec.next();
				
				p=new Persona(curp, nom, edoCivil, dir, tel);
				System.out.println(p.toString());
				System.out.println("Edad persona: "+p.calculaEdad());
			
			
			lec.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("MUY MAL" +fnfe);
			System.exit(-1);
		

	}

 }
	
}