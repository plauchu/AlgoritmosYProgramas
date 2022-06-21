/*
 * Rodrigo
 * EjecutableEstacionamiento
 * Nov 2018
 */
public class EjecutableEstacionamiento {

	public static void main(String[] args) {
		Auto a= new Auto("BMW",2019,"i8", "AXM-431", "SUV","ROJO", 2);
		
		a.altaServicio("Enero", "Frenos");
		a.altaDueño("xxx", "Rodrigo", "soltero", "itam", "55");
		
		System.out.println(a.toString());
		System.out.println(a.getServsPorFecha("Enero"));
		System.out.println(a.getUnServicio("Enero"));
		
		Estacionamiento ranfe = new Estacionamiento("Río Hondo","INFIERNO");
		ranfe.altaAuto("BMW", 2019, "i8", "AXM-431", "SUV", "ROJO", 2);
		
		System.out.print(ranfe.toString());
		
		
	}

}
