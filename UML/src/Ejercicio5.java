import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * Ejercicio5
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Rectangulo r;
		Circulo c;
		double l,a,rad,sumaR=0,sumaC=0, areaT,arR,arC;
		int n,i,k,j;
		Scanner lec=new Scanner(System.in);
		
		System.out.println("Ingrese número de oficinas");
		n=lec.nextInt();
		
		for(i=1; i<=n; i++) {
			System.out.println("Ingrese medidas de la oficina");
			l=lec.nextDouble();
			a=lec.nextDouble();
			r= new Rectangulo(l,a);
			arR= r.area();
			sumaR= sumaR + arR;
		}
		System.out.println("Ingrese número de tapetes");
		k=lec.nextInt();
		for(j=1; j<=k; j++) {
			System.out.println("Ingrese medidas de los tapetes");
			rad=lec.nextDouble();
			c= new Circulo(rad);
			arC= c.area();
			sumaC= sumaC+ arC;	
		}
		areaT=sumaR-sumaC;
		System.out.println("El área total descubierta en las oficinas es de "+areaT);
	}

}
