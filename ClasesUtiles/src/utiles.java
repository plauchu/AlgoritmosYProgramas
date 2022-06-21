/* Rodrigo
 * Sept 2018
 * UtilesCalculadora
 */
public class utiles {
	public static boolean estaOrdenCreciente(int n1, int n2) {
		boolean resp;
		
		if(n1<n2)
			resp=true;
		else
			resp=false;
		return resp;
	}
	public static String factorial(int n) {
		StringBuilder res= new StringBuilder();
		int fact;
		int i=1;
		
		for(fact=1;i<=n;i++){
			fact=fact*i;
			}
		res.append("El producto de "+n+" factorial es "+fact);
		return res.toString();
		}
	public static double calculaFuncion1(double x) {
		double res;
		
		if (x<=11)
			res= 3*x+36;
		else
			if (x<=33)
				res= Math.pow(x,2)-10;
		else
			if (x<=64)
				res= x+6;
			else
				res= 0;
		return res;
	}
	public static double calculaFuncion2(int x) {
		double res;
		
		if (x%4==0)
			res= Math.pow(x,2);
		else
			if (x%4==1)
				res= x/6;
		else
			if (x%4==2)
				res=Math.sqrt(x);
			else
				res= Math.pow(x,3)+5;
		return res;
	}
	public static double calculaFuncion3(int num,int v) {
		double res;
		
		if (num==1)
			res= 100*v;
		else
			if (num==2)
				res= Math.pow(100, v);
		else
			if (num==3)
				res=100/v;
			else
				res= 0;
		return res;
	}
	public static String fibonacci(int n) {
		StringBuilder res=new StringBuilder("Serie Fibonacci de "+n+"\n");
		int fib=0,a=1,b=0;
		
			for(int i=1;i<=n;i++){
				res.append(b+" ");
				fib=a+b;
				b=a;
				a=fib;
			}
		return res.toString();
	}
	public static String ullman(int n) {
		StringBuilder res=new StringBuilder("Número de Ullman para "+n+"\n");
		
		while (n>1) {
			res.append(n).append(" ");
		if(n%2==0)
			n=n/2;
		else
			n=n*3+1;
		}
		res.append(n);
		return res.toString();
	}
}
