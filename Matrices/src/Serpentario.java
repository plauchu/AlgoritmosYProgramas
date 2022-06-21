/*
 * Rodrigo
 * Nov 2018
 * Serpentario
 */
public class Serpentario {
	
	private String nombre;
	private String dir;
	private Serpiente [][] serpientes;
	private final int TIPO=2;
	private final int COLUMNAS =10;
	private int [] cantSerp;
	
	public Serpentario() {
		serpientes = new Serpiente[TIPO][COLUMNAS];
		cantSerp= new int [TIPO];
		for(int i=0;i<TIPO;i++)
			cantSerp[i]=0;
	}

	public Serpentario(String nombre, String dir) {
		this();
		this.nombre = nombre;
		this.dir = dir;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDir() {
		return dir;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}
	
	public int getCantSerp(int ren) {
		int res=0;
		
		res=cantSerp[ren];
		
		return res;
	}
	public String getUnaSerpiente(int clave) {
		String res="No existe";
		Serpiente s= new Serpiente(clave);
		int tipo=0, pos=-1;
		
		if(clave>=0)
			while(tipo<TIPO && pos==-1) {
				pos=ManejadorArreglosGenericos.busquedaSecuencialDesordenada(serpientes[tipo], cantSerp[tipo], s);
				tipo++;
			}
			if(pos!=-1)
				res=serpientes[tipo-1][pos].toString();
		return res;
	}
	public boolean muerteSerpiente(int clave) {
		boolean res=false;
		int tipo=0,n;
		Serpiente s= new Serpiente(clave);
		
		while(tipo<TIPO && !res) {
			n=ManejadorArreglosGenericos.eliminaElemDesord(serpientes[tipo], cantSerp[tipo], s);
			if(n!=cantSerp[tipo]) {
				res=true;
				cantSerp[tipo]=n;
			}
		}
		
		return res;
	}
	
	public boolean altaSerpiente(int clave, String tipo, double longitud, double peso, String alimento, char genero, int ren) {
		boolean res=false;
		Serpiente s= new Serpiente(clave ,tipo, longitud, peso, alimento, genero);
		int n;
		
		if(ren>=0 && ren<TIPO) {
			n=ManejadorArreglosGenericos.insertaAlFinal(serpientes[ren], cantSerp[ren], s);
			if(n!=cantSerp[ren]) {
				res=true;
				cantSerp[ren]=n;
			}
		}
		
		return res;
	}
	public int totSerpAlimento(String alim) {
		int res=0;
		
		for(int i=0;i<TIPO;i++)
			for(int j=0;j<cantSerp[i];j++)
				if(serpientes[i][j].getAlimento().equalsIgnoreCase(alim))
					res++;
		return res;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Serpentario: "+nombre);
		res.append("\nUbicado en: "+dir);
		for(int i=0;i<TIPO;i++)
			for (int j=0;j<cantSerp[i];j++)
				res.append("\nSerpientes: "+serpientes[i][j]);
		return res.toString();
	}
	public int compareTo(Serpentario otro) {
		return this.dir.compareTo(otro.dir);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serpentario other = (Serpentario) obj;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

}
