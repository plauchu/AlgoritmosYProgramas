/* Rodrigo
 * Nov 2018
 * EjecutableManejadorMatricesGenérico
 */
public class EjecutableMaejadorMatGen  {
	
	public static <T> void imprimeMatriz(T [][] arrbi, int m, int n) {
		
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(arrbi[i][j]+ "\t");
			}
			System.out.println();
			}
		}

	public static void main(String[] args) {
		Integer arrbi [][]= new Integer[3][3];
		int [] pos,min;
		Integer [][] tras;
		
		arrbi[0][0]=1;
		arrbi[0][1]=4;
		arrbi[0][2]=3;
		arrbi[1][0]=4;
		arrbi[1][1]=5;
		arrbi[1][2]=8;
		arrbi[2][0]=3;
		arrbi[2][1]=8;
		arrbi[2][2]=10;
		
		
		
		imprimeMatriz(arrbi, arrbi.length, arrbi[0].length);
		
		System.out.println("\nMayRen: "+ManejadorMatricesGenerico.mayRen(arrbi, 1, arrbi[0].length));
		System.out.println("\nMinRen: "+ManejadorMatricesGenerico.minRen(arrbi, 1, arrbi[0].length));
		System.out.println("\nSimetrica: "+ManejadorMatricesGenerico.esSimetrica(arrbi, arrbi.length));
		pos=ManejadorMatricesGenerico.posMayor(arrbi, arrbi.length, arrbi[0].length);
		System.out.println("\nLa posición mayor de la matriz es: ["+pos[0]+"]\t["+pos[1]+"]");
		min=ManejadorMatricesGenerico.posMenor(arrbi, arrbi.length, arrbi[0].length);
		System.out.println("\nLa posición menor de la matriz es: ["+min[0]+"]\t["+min[1]+"]");
		tras=ManejadorMatricesGenerico.traspuesta(arrbi, arrbi.length, arrbi[0].length);
		
		imprimeMatriz(tras, tras.length, tras[0].length);
		

	}

}
