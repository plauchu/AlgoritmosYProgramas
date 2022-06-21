/* Rodrigo
 * Nov 2018
 * EjecutableCompañía
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class EjecutableCompañia {

	public static void main(String[] args) {
		Compañia c= new Compañia("Oxxo", "Rio hondo #2","Ciudad de México");
		String mes;
		int dep;
		double monto;
		boolean res;
		File archivoEntrada= new File("ventas.txt");
		
		try(Scanner lec=new Scanner(archivoEntrada)){
			for(int i=0; i<5; i++) {
				System.out.println("Ingrese: Mes, número de departamento y monto de venta");
				mes=lec.next();
				dep=lec.nextInt();
				monto=lec.nextDouble();
				
				res=c.altaVenta(mes, dep, monto);
				if(res)
					System.out.println("Alta Exitosa");
			}
			
			
			lec.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("Hubo un error" +fnfe);
			System.exit(-1);
		}
		
		System.out.println("Venta de un mes: "+c.getUnaVenta("Enero", 1));
		System.out.println("Mes con más ventas: "+c.mesConMasVentas(2));
		System.out.println("Promedio de ventas del año de 1 departamento: "+c.promVentas("Diciembre"));
		System.out.println("¿Mes sin ventas? : "+c.noHuboVentasEnAlgunMes(0));
		System.out.println("Meses en los que ningin depto realizó una venta: "+c.mesSinVentasEnTodosLosDeptos());
		System.out.println(c.toString());
	}

}
