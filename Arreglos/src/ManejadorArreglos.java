/* Rodrigo
 * Oct 2018
 * ManejadorArreglos
 */
import java.util.ArrayList;
public class ManejadorArreglos {
	public static double suma(double[] a, int n) {
		double suma=0;
		
		for(int i=0; i<=n; i++)
			suma+=a[i];
		return suma;
	}
	public static double promedio(double[] a, int n) {
		double prom=0;
		
		prom= suma(a, n)/n;
		return prom;
	}
	public static int posMayor(double[] a, int n) {
		int res=0;
		double max=a[0];
		
		for(int i=1; i<n; i++)
			if(a[i]>max) {
				max=a[i];
				res=i;
			}
		return res;
	}
	public static int posMenor(double[] a, int n) {
		int res=0;
		double max=a[0];
		
		for(int i=1; i<n; i++)
			if(a[i]<max) {
				max=a[i];
				res=i;
			}	
		return res;
	}
	public static int cuantosMayX(double[] a, int n, double parametro) {
		int res=0;
		
		for (int i=0; i<=n; i++)
			if(a[i]>parametro)
				res++;
		return res;
	}
	public static ArrayList<Integer>cualesMayX(double[] a, int n, double parametro) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		int i=0;
		
		while(i<a.length)
			i++;
			if(a[i]>parametro)
				lista.add(i);
		return lista;
	}
	public static int cuantosMenX(double[] a, int n, double parametro) {
		int res=0;
		
		for (int i=0; i<=n; i++)
			if(a[i]<parametro)
				res++;
		return res;
	}
	public static ArrayList<Integer>cualesMenX(double[] a, int n, double parametro) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		int i=0;
		
		while(i<a.length)
			i++;
			if(a[i]<parametro)
				lista.add(i);
		return lista;
	}
	public static void swap(double[] a, int n, int j ) {
		double temp= a[n];
		a[n]=a[j];
		a[j]=temp;
	}
	public static void invertir(double[] a, int n) {
		for(int i=0; i<=n; i++)
			a[n-1]=a[i];
	}
	public static void corrimientoDer(double[] a, int n, int k) {
		for(int i=0;i>k;i++)
			a[i]=a[i-1];
	}
		
	public static void corrimientoIzq(double[] a, int n, int k) {
		for(int i=k;i<(n-1);i++)
			a[i]=a[i+1];
	}
	public static int posMinimo(double[] a, int n, int inicio) {
		int posMin=inicio;
		
		for(int i=inicio+1; i<n; i++)
			if(a[posMin]>a[i])
				posMin=i;
		return posMin;
	}
	public static void seleccionDirecta(double[]a, int n) {
		int posMenor;
		
		for(int i=0; i<n-1; i++) {
			posMenor=posMinimo(a,n,i);
			swap(a,i,posMenor);
		}
	}
	public static int busquedaSecuencialDesordenada(double[]a, int n, double x) {
		int pos,i=0;
		while(i<n && a[i]!=x)
			i++;
		if(i==n)
			pos=-1;
		else
			pos=i;
		return pos;
	}
	public static int busSecOrd(double[] a, int n, double x) {
		int i=0;
		
		while(i<n && a[i]<x)
			i++;
		if(i==n||a[i]!=x)
			i=-i-1;
		
		return i;
	}
	public static int busBinaria(double[] a, int n, double x) {
		int izq=0,der=n-1,centro=(izq+der)/2;
		while(izq<=der&&a[centro]!=x){
			if(x>a[centro])
				izq=centro+1;
			else
				der=centro-1;
			centro=(izq+der)/2;
		}
		if(izq>der) 
			centro=(izq+1)*-1;
		return centro;
	}
}

