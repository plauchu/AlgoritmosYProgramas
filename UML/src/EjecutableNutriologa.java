import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * Prueba Persona
 */
public class EjecutableNutriologa {

	public static void main(String[] args) {
		Persona cerdito;
		Scanner lec=new Scanner(System.in);
		int numPac,edad,nivAct,calculaIMC;
		String nom,apMat,apPat,sexo;
		double peso,estatura;
		
		System.out.println("Ingrese su número de paciente: ");
		numPac=lec.nextInt();
		System.out.println("Ingrese su nombre: ");
		nom=lec.next();
		System.out.println("Ingrese su apellido paterno: ");
		apPat=lec.next();
		System.out.println("Ingrese su apellido materno: ");
		apMat=lec.next();
		System.out.println("Ingrese su edad: ");
		edad=lec.nextInt();
		System.out.println("Ingrese su sexo: ");
		sexo=lec.next();
		System.out.println("Ingrese su peso: ");
		peso=lec.nextDouble();
		System.out.println("Ingrese su estatura: ");
		estatura=lec.nextDouble();
		System.out.println("Ingrese su nivel de actividad física \n (1) para sedentario \n (2) para poco activo \n (3) para medianamente activo \n (4) para activo \n (5) para extra activo \n (6) para intensa actividad física: ");
		nivAct=lec.nextInt();
		
		cerdito= new Persona(numPac,nom,apMat,apPat,edad,sexo,peso,estatura,nivAct);
		System.out.println(cerdito.toString());
		calculaIMC=cerdito.calculaIMC(peso);
		if(calculaIMC==-1)
			System.out.println("Estás bajo de peso");
		else
			if(calculaIMC==0)
				System.out.println("Estás en tu peso ideal");
		else
			System.out.println("Tienes sobrepeso");
		System.out.println(cerdito.recomendar(calculaIMC, nivAct));
		
	}

}
