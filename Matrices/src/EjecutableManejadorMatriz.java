/* Rodrigo
 * Nov 2018
 * EjecutableManejadorMatrices
 */
public class EjecutableManejadorMatriz {
	
	public static void imprimeMatriz(double [][] arrbi, int m, int n) {
		
	for(int i=0; i<m;i++) {
		for(int j=0; j<n;j++) {
			System.out.print(arrbi[i][j]+ "\t");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		double arrbi [][]= {{1,0,3}, {0,1,0}, {0,0,1}};
		double arrb [][]= {{6,1,4}, {3,2,7}, {9,8,2}};
		double [][] tras,suma,prod;
		int [] posMay, posMin;
		
		imprimeMatriz(arrbi, arrbi.length, arrbi[0].length);
		
		System.out.println("\nLa suma de la matriz es: "+ManejadorMatrices.suma(arrbi, arrbi.length, arrbi[0].length));
		System.out.println("\nLa suma del renglón 2 es: "+ManejadorMatrices.sumaRen(arrbi, 0, arrbi[0].length));
		System.out.println("\nLa suma de la columna 3 es: "+ManejadorMatrices.sumaCol(arrbi, 0, arrbi.length));
		System.out.println("\nLa suma de la diagonal principal es: "+ManejadorMatrices.sumaDiagonal(arrbi, arrbi.length));
		System.out.println("\nLa suma de la diagonal invertida es: "+ManejadorMatrices.sumaDiagonalInv(arrbi, arrbi.length));
		System.out.println("\nEl elemento mayor de renglón 0 es: "+ManejadorMatrices.mayRen(arrbi, 0, arrbi[0].length));
		System.out.println("\nEl elemento mayor de la columna 1 es: "+ManejadorMatrices.mayCol(arrbi, 0, arrbi.length));
		System.out.println("\nEl elemento menor de renglón 2 es: "+ManejadorMatrices.minRen(arrbi, 0, arrbi[0].length));
		System.out.println("\nEl elemento menor de la columna 3 es: "+ManejadorMatrices.minCol(arrbi, 0, arrbi.length));
		posMay=ManejadorMatrices.posMayor(arrbi, arrbi.length, arrbi[0].length);
		System.out.println("\nLa posición mayor de la matriz es: ["+posMay[0]+"]\t["+posMay[1]+"]");
		posMin=ManejadorMatrices.posMenor(arrbi, arrbi.length, arrbi[0].length);
		System.out.println("\nLa posición menor de la matriz es: ["+posMin[0]+"]\t["+posMin[1]+"]");
		System.out.println("\n¿La matriz es identidad?: "+ManejadorMatrices.esIdentidad(arrbi, arrbi.length));
		tras=ManejadorMatrices.traspuesta(arrbi, arrbi.length, arrbi[0].length);
		imprimeMatriz(tras, tras.length, tras[0].length);
		System.out.println("\n¿La matriz es simétrica?: "+ManejadorMatrices.esSimetrica(arrb, arrb.length));
		suma=ManejadorMatrices.sumaAyB(arrbi, arrbi.length, arrbi[0].length, arrb, arrb.length, arrb[0].length);
		imprimeMatriz(suma,suma.length, suma[0].length);
		prod=ManejadorMatrices.MultiplicaAyB(arrbi, arrbi.length, arrbi[0].length, arrb, arrb.length, arrb[0].length);
		imprimeMatriz(prod,prod.length,prod[0].length);
	}

}
