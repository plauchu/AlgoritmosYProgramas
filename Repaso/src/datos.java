import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Rodrigo
 * Dec2018
 * Datos
 */
public class datos {
	
	public static int generaParalelos (File datos) {
		int res=0;
		int pos;
		boolean n;
		String linea;
		String [] para1= new String [50];
		for(int j=0;j<para1.length;j++){
			para1[j]=" ";
		}
		int [] para2= new int [50];
		
		try (Scanner lec= new Scanner(datos)){
			while(lec.hasNext()) {
				linea=lec.next();
				pos=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(para1, para1.length, linea);
				if(pos==-1) {
					para1[res]=linea;
					para2[res]=1;
					res++;
				}
				else
					para2[pos]++;
			}
			lec.close();
			}
		catch(FileNotFoundException fnfe) {
			System.err.println("MUY MAL" +fnfe);
			System.exit(-1);
			
		}
		return res;
	
	}


	public static void main(String[] args) {
		File dato= new File("datos.txt");
		
		System.out.println(generaParalelos(dato));
		
	}

}
