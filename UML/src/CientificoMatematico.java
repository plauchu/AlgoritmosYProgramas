/* Rodrigo
 * Sept 2018
 * Científico Matemático
 */
public class CientificoMatematico {
	private String nombre, areaEspecialidad;
	
	
	public CientificoMatematico() {	
	}
	public CientificoMatematico(String nombre, String areaEspecialidad) {
		this.nombre=nombre;
		this.areaEspecialidad=areaEspecialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setAreaEspecialidad(String areaEspecialidad) {
		this.areaEspecialidad=areaEspecialidad;
	}
	public String AreaEspecialidad() {
		return areaEspecialidad;
	}
	public String toString(){
		StringBuilder res= new StringBuilder();
		res.append("El científico se llama "+nombre);
		res.append(", el area de especialización del científico es "+areaEspecialidad);
		return res.toString();
	}
	public boolean equals(CientificoMatematico otro){
		boolean resp;
		
		if(nombre.equals(otro.nombre))
			resp=true;
		else 
			resp=false;
		return resp;
	}
	public int compareTo(CientificoMatematico otro){
		int resp;
		
		if(nombre.equals(otro.nombre))
			resp=0;
		else 
			if(nombre.compareTo(otro.nombre)<0)
				resp=-1;
			else
				resp=1;
		return resp;
	}
	public boolean estaOrdenCreciente(int n1, int n2) {
		boolean resp;
		
		if(n1<n2)
			resp=true;
		else
			resp=false;
		return resp;	
	}
	public String ordenCreciente(int n1, int n2) {
		String res;
		if(estaOrdenCreciente(n1,n2))
			res=n1+"-"+n2;
		else
			res=n2+"-"+n1;
		return res;
	}
	public boolean esImpar(int num) {
		boolean resp;
		
		if(num%2!=0)
			resp=true;
		else
			resp=false;
		return resp;	
	}
	public double calculaFuncion1(double x) {
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
	public double calculaFuncion2(int x) {
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
	public double calculaFuncion3(int num,int v) {
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
	public String multiplica(int n,int m) {
		StringBuilder res= new StringBuilder();
		int suma=0;
		
		for (int i=1; i<=n; i++) {
			suma= suma+m;
		}
		res.append("El producto de "+n+" por "+m+" es "+suma);
		return res.toString();
		}
	public String potencia(int n,int m) {
		StringBuilder res= new StringBuilder();
		int prod=1;
		
		for (int i=1; i<=n; i++) {
			prod= prod*m;
		}
		res.append("El producto de "+n+" a la "+m+" es "+prod);
		return res.toString();
		}
	public String factorial(int n) {
		StringBuilder res= new StringBuilder();
		int fact;
		int i=1;
		
		for(fact=1;i<=n;i++){
			fact=fact*i;
			}
		res.append("El producto de "+n+" factorial es "+fact);
		return res.toString();
		}
	public String fibonacci(int n) {
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
	public String ullman(int n) {
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

