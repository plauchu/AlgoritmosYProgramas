import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * EjecutableComplejo
 */
public class EjecutableComplejos {

	public static void main(String[] args) {
		CalculaComplejo Cal=new CalculaComplejo();
		Scanner lec=new Scanner(System.in);
		Complejo n1=new Complejo();
		Complejo n2=new Complejo();
		Complejo res;
		char x;
		double r1,i1,r2,i2;
		
System.out.println("Calculadora de números complejos");
		
		System.out.println("Ingresa una opción");
		System.out.println("Suma: +");
		System.out.println("Resta: -");
		System.out.println("Multiplicación: *");
		System.out.println("División: /");
		System.out.println("Salir: s");
		x=lec.next().charAt(0);
		
		while (x!='s'){
			System.out.println("Ingrese el primer número complejo");
			System.out.println("Parte real");
			r1=lec.nextDouble();
			System.out.println("Parte imaginaria");
			i1=lec.nextDouble();
			n1.setReal(r1);
			n1.setImaginario(i1);
			System.out.println("Ingrese el segundo número complejo");
			System.out.println("Parte real");
			r2=lec.nextDouble();
			System.out.println("Parte imaginaria");
			i2=lec.nextDouble();
			n2.setReal(r2);
			n2.setImaginario(i2);
			Cal.setNum1(n1);	
			Cal.setNum2(n2);
			switch (x){
			case '+':
				System.out.println("El resultado de la suma es: "+Cal.suma());
				break;
			case '-':
				System.out.println("El resultado de la resta es: "+Cal.resta());
				break;
			case '*':
				System.out.println("El resultado de la multiplicación es: "+Cal.multiplicacion());
				break;
			case '/':
				System.out.println("El resultado de la división es: "+Cal.division());
				break;	
				}
			
			System.out.println("Ingresa una opción");
			System.out.println("Suma: +");
			System.out.println("Resta: -");
			System.out.println("Multiplicación: *");
			System.out.println("División: /");
			System.out.println("Salir: s");
			x=lec.next().charAt(0);
		}
		System.out.println("Gracias por usar la calculadora de números complejos");
	}


}
