import java.util.ArrayList;
/*
 *  AnalizaPalabras
 *  Oct2018
 */
public class AnalizaPalabras {
	private static ArrayList<String> analizaPalabras(String[] cad, char [] carac) {
		ArrayList<String> lista= new ArrayList<String>();
		boolean aux=false;
		
		for(int i=0; i<cad.length;i++) {
			for(int j=0;j<carac.length;j++) {
				if(Character.toLowerCase(cad[i].charAt(0))==Character.toLowerCase(carac[j])){
					lista.add(cad[i]);
					aux=true;
				}
			//	if(aux==false)
			}
		}
		return lista;
	}

	public static void main(String[] args) {
		String []cad= {"Hola","examen","Algoritmos", "fácil", "divertido"};
		char[] carac= {'a','e','m'};
		
		
		for(int i=0;i<cad.length;i++)
			System.out.println(cad[i]);
		for(int i=0;i<carac.length;i++)
			System.out.println(carac[i]);
		
		System.out.println(analizaPalabras(cad, carac));
		

	}

}
