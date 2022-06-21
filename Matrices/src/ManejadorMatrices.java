
/* Rodrigo
 * Nov 2018
 * ManejadorMatrices
 */
public class ManejadorMatrices {
	
	public static double suma(double [][] arr, int m, int n) {
		double res=0;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				res+=arr[i][j];
			}
		}
		return res;
	}
	public static double sumaRen( double [][] arr, int ren, int n) {
		double res=0;
		
		for(int i=0;i<n;i++)
			res+= arr[ren][i];
		return res;
	}
	public static double sumaCol( double [][] arr, int col, int n) {
		double res=0;
		
		for(int i=0;i<n;i++)
			res+= arr[i][col];
		return res;
	}
	public static double sumaDiagonal(double [][] arr, int m){
		double res=0;
		
		for(int i=0; i<m;i++)
			for(int j=0;j<m;j++)
				if(i==j)
					res+=arr[i][j];
		return res;
	}
	public static double sumaDiagonalInv(double [][] arr, int m){
		double res=0;
		
		for(int i=0; i<m;i++)
			for(int j=0;j<m;j++)
				if(i+j==m-1)
					res+=arr[i][j];
		return res;
	}
	public static int mayRen(double [][] arr, int ren, int n) {
		int maxIndex=0;
		double may=arr[ren][0];
		
		for(int i=1; i<n;i++) {
			if(arr[ren][i]> may){
				may=arr[ren][i];
				maxIndex = i;
			}	
		}
		
		return maxIndex;
	}
	public static int mayCol(double [][] arr, int col, int n) {
		int maxIndex = 0;
		double may=arr[0][col];
		
		for(int i=1; i<n;i++) {
			if(arr[i][col]> may) {
				may=arr[i][col];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	public static int minRen(double [][] arr, int ren, int n) {
		int minIndex = 0;
		double min=arr[ren][0];
		
		for(int i=1; i<n;i++) {
			if(arr[ren][i]< min) {
				min=arr[ren][i];
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	public static int minCol(double [][] arr, int col, int n) {
		int minIndex = 0;
		double min=arr[0][col];
		
		for(int i=1; i<n;i++) {
			if(arr[i][col]< min) {
				min=arr[i][col];
				minIndex=i;
			}
		}
		
		return minIndex;
	}
	
	public static int [] posMenor(double [][] arr, int m, int n) {
		int [] res= new int[2];
		double men= arr[0][0];
		
		for(int i=1; i<m;i++)
			for(int j=1;j<n;j++)
				if(men>arr[i][j]) {
					men=arr[i][j];
					res[0]=i;
					res[1]=j;
				}
		return res;
	}
	public static int [] posMayor(double [][] arr, int m, int n) {
		int [] res= new int [2];
		double may= arr[0][0];
		
		for(int i=1; i<m;i++)
			for(int j=1;j<n;j++)
				if(may<arr[i][j]) {
					may=arr[i][j];
					res[0]=i;
					res[1]=j;
				}
		return res;
	} 
	public static boolean esIdentidad(double [][] arr, int n) {
		boolean res=true;
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i==j && arr[i][j]!=1 && esSimetrica(arr,n))
					res=false;
		return res;
	}
	public static boolean esSimetrica(double[][] arr, int n) {
		boolean res=true;
		
		for(int i=1;i<n;i++)
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=arr[j][i])
					res=false;
			}
		return res;		
		
	}
	
	public static double[][] traspuesta(double [][] arr, int m, int n) {
		double[][] res= new double[n][m];
		
		for(int i=0;i<m;i++)
			for(int j=0; j<n; j++) {
				res[j][i]=arr[i][j];
				
		}
		
		return res;
	}
	public static double[][] sumaAyB(double [][] matA, int mA, int nA, double[][] matB, int mB, int nB){
		double[][] res = new double[mA][nA];
		
		for(int i=0;i<mA;i++)
			for(int j=0; j<nA; j++) {
				res[i][j]= matA[i][j]+ matB[i][j];
			}
		return res;
	}
	public static double[][] MultiplicaAyB(double [][] matA, int mA, int nA, double[][] matB, int mB, int nB){
		double[][] res = new double[mA][nA];
		
		if(matA[0].length==matB.length)
			for(int i=0;i<mA;i++)
				for(int j=0; j<nB;j++) {
					for(int k=0;k<nA;k++)
						res[i][j]+= matA[i][k]*matB[k][j];
				}
		return res;
	}
}
