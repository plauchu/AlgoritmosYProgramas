import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * Ejercicio4
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Rectangulo r;
		Circulo c;
		double l,a,rad,sumaR,sumaC, areaT;
		Scanner lec=new Scanner(System.in);
		
		System.out.println("Ingrese medidas de la oficina");
		l=lec.nextDouble();
		a=lec.nextDouble();
		r= new Rectangulo(l,a);
		sumaR= r.area();
		
		sumaC=0;
		for(int i=1;i<=3;i++){
			System.out.println("Ingrese medidas de los tapetes");
			rad=lec.nextDouble();
			c= new Circulo(rad);
			sumaC= sumaC+ c.area();
		}
		
		areaT= sumaR-sumaC;
		System.out.println("El área no cubierta por tapetes es de" +areaT);
	}
}
	
