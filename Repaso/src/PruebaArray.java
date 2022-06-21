import java.util.ArrayList;
import java.util.Scanner;
/*
 * Rodrigo
 * Dec2018
 * ArrayList
 */
public class PruebaArray {
	
	public static ArrayList<Integer> almacenaNumeros(int [] arre, int n, int num){
		ArrayList<Integer> lista= new ArrayList<Integer>();	
		
		for(int i=0; i<n;i++) {
			if(arre[i] % num==0)
				lista.add(arre[i]);
		}
		
		return lista;
	}
	
	public static ArrayList <String> parteCadena(String cadena){
		ArrayList<String> lista= new ArrayList<String>();
		int i=0;
		String linea;
		Scanner lec= new Scanner(cadena);
		
		while(lec.hasNext()) {
			linea=lec.next();
			if(linea.length()>=3) {
				lista.add(linea);
				i++;
			}
		}
		lec.close();
		if(i==0)
			lista.add(null);

		return lista;
	}
	
	public static int insertaElementos (String [] cadenas, int n, ArrayList<String> lista) {
		int i=0;
		int k=lista.size();
		
		for(int j=0;j<k;j++) {
			while(i<n && !cadenas[i].equals(lista.get(j))) {
				i++;
			}
			if(i==n) {
				cadenas[n]=lista.get(j);
				n++;
			}
			i=0;
		}
		
		return n;
	}

	public static void main(String[] args) {
		int [] arre = {1,2,3,4,5,6,7,8,9,10};
		String cadena= "valor es lo que se necesita para levantarse y hablar, pero también es lo que se requiere para sentarse y escuchar";
		String cad= "o";
		String [] ca= new String [10];
		ArrayList<String> lista = new ArrayList<String>();
		
		ca[0]= "ejemplo";
		ca[1]= "de";
		ca[2]= "arreglo";
		ca[3]= "con";
		ca[4]= "Strings";
		
		lista.add("de");
		lista.add("nuevas");
		lista.add("ejemplo");
		lista.add("cadenas");
		lista.add("Strings");
		lista.add("son");
		lista.add("insertadas");
		
		//System.out.println(almacenaNumeros(arre,arre.length,10));
		//System.out.println(parteCadena(cadena));
		//System.out.println(cadena.length());
		System.out.println(insertaElementos(ca,5,lista));

	}

}
