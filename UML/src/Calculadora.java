/* Rodrigo
 * Sept 2018
 * Calculadora
 */
public class Calculadora {
	public static boolean estaOrdenCreciente(int n1, int n2) {
		boolean resp;
		
		if(n1<n2)
			resp=true;
		else
			resp=false;
		return resp;
	}
	public static int factorial(int n) {
		int res=1;
		
		for(int i=2;i<=n;i++){
			res*=i;
		}
		return res;
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
	public static int multiplica(int n,int m) {
		int suma=0;
		
		for (int i=1; i<=n; i++) {
			suma= suma+m;
		}
		return suma;
	}
	public static int potencia(int n,int m) {
		int prod=1;
		
		for (int i=1; i<=m; i++) {
			prod= prod*n;
		}
		return prod;
	}
	public static String CubosNicomaco(int n) {
		StringBuilder res=new StringBuilder("Cubos de Nicómaco para "+n+"\n");
		int impar=3,i,t,suma;
		
		res.append(1+" ");
		for(i=2;i<=n;i++){
			suma=0;
			for(t=1;t<=i;t++){
				suma+=impar;
				impar+=2;
			}
			res.append(suma+" ");
		}
		return res.toString();
	}
	public static int calculaMCD(int m, int n) {
		int mCD=0;
		
		while(n!=0){
			mCD=n;
			n=m%n;
			m=mCD;
		}
		return mCD;
	}
	public static double calculaSerie2(int n, int num) {
		double res=0;
		int p=1;
		
		for(int i=1; i<=n; i++) {
			switch(p) {
			case 1:
				res+=num/3;
				p=2;
				break;
			case 2:
				res+=num/5;
				p=3;
				break;
			case 3:
				res+=num/7;
				p=1;
				break;
			}
		}
		return res;
	}
	public static int calculaSerie3(int n) {
		int resp=0;
		
		for(int i=0;i<=n;i++)
			resp+=(factorial(n-i)/factorial(i));
		return resp;
	}
	public static boolean div11(int n){
		boolean res=true;
		int par=0,impar=0,residuo=0,resta;
		
		while(n!=0){
			residuo=n%10;
			n=n/10;
			if(res)
				par+=residuo;
			else
				impar+=residuo;
			res=!res;
		}
		resta=Math.abs(par-impar);
		if(resta%11==0)
			res=true;
		else
			res=false;
		return res;
	}
}
