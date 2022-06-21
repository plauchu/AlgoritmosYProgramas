/*
 * Rodrigo
 * Dec2018
 * Matriz
 */
public class Matriz {
	
	public static int busquedaSecDes(Integer [] arre, int n, int num) {
		int pos;
		int i=0;
		
		while(i<n && !arre[i].equals(num))
			i++;
		if(i==n)
			pos=-1;
		else
			pos=i;
		
		return pos;
	}
	
	public static void corrimientoDer (int [] arre, int n, int k ) {
		for(int i=n;i>k;i--)
			arre[i]=arre[i-1];
	}
	public static void corrimientoIzq (int [] arre, int n, int k ) {
		for(int i=k;i<n-1;i++)
			arre[i]=arre[i+1];
	}

	public static void main(String[] args) {
		int [][] mat = {{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5}};
		
		System.out.println(mat[0].length*mat.length);
		

	}

}
