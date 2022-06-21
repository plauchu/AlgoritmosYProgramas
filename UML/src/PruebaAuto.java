import java.util.Scanner;
/* Rodrigo
 * Sept 2018
 * PruebaAuto
 */
public class PruebaAuto {

	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		Auto a1,a2,a3,a4,a5;
		String nom;
		int numLic,numAuto,dias;
		double costo=0,numKil;
		char opc;
		
		a1=new Auto("Ferrari", 2017,2000);
		a2=new Auto("Porsche", 2005,21000);
		a3=new Auto("Audi", 2018,1000);
		a4=new Auto("Tesla", 2012,20000);
		a5=new Auto("BMW", 2015,35000);
		
		System.out.print("Renta (r), Devolución (d), Salir (s)");
		opc=lec.next().charAt(0);
		while(opc=='r'||opc=='d') {
			switch(opc){
			case 'r':
				System.out.println("Ingrese su nombre y número de licencia");
				nom=lec.next();
				numLic=lec.nextInt();
				System.out.println("Ingrese el número de días");
				dias=lec.nextInt();
				System.out.println("Ingrese el numero del auto que desea rentar \n (1)" +a1.toString()+"\n (2)"+a2.toString()+"\n (3)" +a3.toString()+"\n (4)"+a4.toString()+"\n (5)"+a5.toString());
				numAuto=lec.nextInt();
				switch(numAuto){
					case 1:
						costo=a1.rentaAuto(nom, numLic, dias);
						break;
					case 2:
						costo=a2.rentaAuto(nom, numLic, dias);
						break;
					case 3:
						costo=a3.rentaAuto(nom, numLic, dias);
						break;
					case 4:
						costo=a4.rentaAuto(nom, numLic, dias);
						break;
					case 5:
						costo=a5.rentaAuto(nom, numLic, dias);
						break;
				}
				System.out.print("El costo total es de $"+costo);
				break;
			case 'd':
				System.out.print("Ingrese número de auto a devolver");
				numAuto=lec.nextInt();
				System.out.print("¿Cuántos Km recorrió? ");
				numKil=lec.nextDouble();
				switch (numAuto){
				case 1:
					a1.devAuto(numKil);
					break;
				case 2:
					a2.devAuto(numKil);
					break;
				case 3:
					a3.devAuto(numKil);
					break;
				case 4:
					a4.devAuto(numKil);
					break;
				case 5:
					a5.devAuto(numKil);
					break;
				}
			}
			System.out.print("\nRenta (r), Devolución (d), Salir (s)");
			lec.nextLine();
			opc=lec.next().charAt(0);
		}
		System.out.print("Gracias por rentar, vuelva pronto");
			
	}
}
