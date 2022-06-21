import java.util.Scanner;
/* RodrigoPlauchu
 * Sept2018
 * TareaVotosEnJava
 */
public class tareaVotos {
	public static void main(String[] args) {
		int n, voto;
		String resp;
		int pan, prd, pri, mor, abs, total;
		String fav;
		Scanner lec;
		
		pan= 0;
		prd= 0;
		pri= 0;
		mor= 0;
		abs= 0;
		
		
		lec= new Scanner(System.in);
		System.out.println("Numero de votantes");
		n= lec.nextInt();
		
		for (int i=1; i<=n; i++) {
			lec= new Scanner(System.in);
			System.out.println("Si votará ingrese 'Si'");
			System.out.println("Si no votará ingrese 'No'");
			resp= lec.next();
			
			if (resp=="No") {
				abs++;
			}
			
			else 
				 {
				lec= new Scanner(System.in);
				System.out.println("¿Por quién votarás? 1= PAN, 2= PRD, 3= PRI ó 4= MORENA");
				voto= lec.nextInt();
				switch (voto) {
					case 1:
						pan++;
						System.out.println("GRACIAS POR VOTAR");
						break;
					case 2:
						prd++;
						System.out.println("GRACIAS POR VOTAR");
						break;
					case 3:
						pri++;
						System.out.println("GRACIAS POR VOTAR");
						break;
					default:
						mor++;
						System.out.println("GRACIAS POR VOTAR");						
				
				}
			}
		}
		total= pan + prd + pri + mor;
		System.out.println("El total de votos es: "+total);
		pan= (pan*100)/total;
		prd= (prd*100)/total;
		pri= (pri*100)/total;
		mor= (mor*100)/total;
		abs= (abs*100)/total;
		System.out.println("Los porcentajes son: Pan: "+pan+"PRD: "+prd+ "PRI: "+pri+"MORENA: "+mor+"ABSTENCIONES: "+abs);
		
		if(pan> prd && pan> pri && pan> mor){
			fav= "PAN";
		}
		else {
			if(prd> pri && prd>mor){
				fav= "PRD";
			}
			else
				if(pri> mor) {
					fav= "PRI";
				}
				else
					fav= "MORENA";
		}
		System.out.println( "El favorito es: "+ fav);
		if(pan==0 || prd==0 || pri==0 || mor==0 ) {
			if(pan==0) 
				System.out.println( "Porcentaje 0 PAN");
			if(prd==0) 
				 System.out.println( "Porcentaje 0 PRD");
			if(pri==0) 
				 System.out.println( "Porcentaje 0 PRI");
			if(mor==0) 
				 System.out.println( "Porcentaje 0 MOR");
				
		}
	
		
	}

}