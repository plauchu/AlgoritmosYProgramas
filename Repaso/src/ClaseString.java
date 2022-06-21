import java.util.ArrayList;

/*
 * Rodrigo
 * Dec2018
 * EjercicioClaseString
 */
public class ClaseString {
	
	public static String invierte(String cad) {
		String res=" ";
		char aux;
		
		for(int i=cad.length()-1;i>=0;i--) {
			aux= cad.charAt(i);
			res+= aux;
		}
		return res;
	}
	
	public static ArrayList <String> analizaPalabras(String [] a, char [] arr){
		ArrayList<String> lista= new ArrayList<String>();
		char aux;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<a.length;j++) {
				Character.toLowerCase(arr[i]);
				aux= Character.toLowerCase(a[j].charAt(0));
				if(arr[i]==aux) {
					lista.add(a[j]);
					for(int k=j;k<a.length-1;k++) 
						a[k]=a[k+1];
						a[arr.length+1]=" ";
					
					
				}
			}
			
		}
		return lista;
	}
	
	public static boolean esCapicua (int [] a) {
		boolean res=false;
		int i=0;
		
		while(i<a.length/2 && a[i]==a[a.length-1-i])
			i++;
		if(i==a.length/2)
			res=true;
		
		return res;
	}
	public static boolean esCapicuaLetras (String [] a) {
		boolean res=false;
		int i=0;
		
		while(i<a.length/2 && a[i].equalsIgnoreCase(a[a.length-1-i]))
			i++;
		if(i==a.length/2)
			res=true;
		
		return res;
	}
	
	
	public static void main(String[] args) {
		String [] a= {"Hola","examen","Algoritmos", "fácil", "divertido"};
		String [] b= {"hoLa","sOy","capIcuA","Capicua", "Soy", "Hola"};
		char [] arr= {'a','e','m'};
		String palabra= "hola";
		String curp= "PARR990714HDFLDD05";
		int [] c = {1,2,3,4,5,5,4,3,2,1};
		int [] d = {9,2,3,4,5,5,4,3,2,1};
		
		/*System.out.println(analizaPalabras(a,arr));
		for(int i=0;i<a.length;i++) {
			System.out.print("\t"+a[i].toString());
		}
		*/
		
		//System.out.println(invierte(palabra));
		//System.out.println(esCapicua(c));
		//System.out.println(esCapicua(d));
		//System.out.println(esCapicuaLetras(a));
		//System.out.println(esCapicuaLetras(b));
		System.out.println(curp.substring(4,10));
		System.out.println(curp.indexOf("f"));
		System.out.println(curp.toCharArray());
		System.out.println(curp.compareToIgnoreCase("PARR990714HDFLDD05"));
		String [] aux= curp.split("H");
		System.out.println(aux[0]+"+"+aux[1]);
	}
}
