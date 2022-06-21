/* Rodrigo
 * Nov 2018
 * Compañia
 */
public class Compañia {
	private String nombre;
	private String direccion;
	private String cd;
	private double [][] ventas;
	private String [] nombreMes= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private final int TOTAL_MESES=12;
	private final int TOTAL_DEPTOS=4;
	
	public Compañia() {
		ventas= new double [TOTAL_DEPTOS][TOTAL_MESES];
		for(int mes=0;mes<TOTAL_MESES;mes++) {
			for(int dep=0;dep<TOTAL_DEPTOS;dep++)
				ventas[dep][mes]=0;
		}
	}

	public Compañia(String nombre, String direccion, String cd) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cd = cd;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCd() {
		return cd;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}
	public double getUnaVenta(String mes, int dep) {
		double res=0;
		int i=0;
		
		i=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(nombreMes, TOTAL_MESES, mes);
		if(i!=-1 && dep<TOTAL_DEPTOS) {
			res=ventas[dep][i];
		}
		return res;
	}
	public boolean altaVenta(String mes, int dep, double monto) {
		boolean res= false;
		int i=0;
		
		i=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(nombreMes, TOTAL_MESES, mes);
		if(i!=-1 && dep<TOTAL_DEPTOS && monto>0) {
			res=true;
			ventas[dep][i] += monto;
		}
		return res;
	}
	public String mesConMasVentas(int dep) {
		String res= "No hubo ventas en ese departamento";
		int j=0;
		
		j=ManejadorMatrices.mayRen(ventas, dep, ventas.length);
		res=nombreMes[j];
			
		return res;
	}
	
	public double promVentas(String mes) {
		double res=0;
		int i;
		
		i=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(nombreMes, TOTAL_MESES, mes);
		if(i!=-1)
			res=ManejadorMatrices.sumaCol(ventas, i, ventas.length)/TOTAL_MESES;
		return res;
	}
	public boolean noHuboVentasEnAlgunMes(int dep) {
		boolean res=true;
		int i=0;
		
		while(ventas[dep][i]==0)
			i++;
			if(ventas[dep][i]!=0)
				res=false;
		return res;
	}
	public int mesSinVentasEnTodosLosDeptos() {
		int res=0;
		
		for(int i=0;i<ventas.length;i++)
			for(int j=0;j<ventas[0].length;j++)
				if(ventas[i][j]==0)
					res++;
		return res;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("\nCompañia: "+nombre);
		res.append("\nUbicada en: "+direccion);
		res.append("\nEn ciudad: "+cd);
		res.append("\nVentas: ");
		for(int i=0;i<TOTAL_MESES;i++) {
			res.append("\n"+nombreMes[i]+"\t");
			res.append("\n");
			for(int j=0;j<TOTAL_DEPTOS;j++) {
			
				res.append(ventas[j][i]+"\t");
			}
		}
		
		return res.toString();
	}
	public int compareTo(Compañia otra) {
		return this.nombre.compareToIgnoreCase(otra.nombre);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compañia other = (Compañia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
}
