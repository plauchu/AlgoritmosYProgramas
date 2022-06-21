/* Rodrigo
 * Oct 2018
 * EscuelaNatación
 */
public class EscuelaNatacion {
	private String nombre;
	private String dir;
	private int numAlbercas;
	private Rectangulo[] albercas;
	private final int MAX_ALBERCAS=10;
	
	public EscuelaNatacion() {
		albercas= new Rectangulo[MAX_ALBERCAS];
		numAlbercas=0;
	}
	public EscuelaNatacion(String nom, String dir) {
		albercas= new Rectangulo[MAX_ALBERCAS];
		numAlbercas=0;
		this.nombre=nom;
		this.dir=dir;
	}
	public EscuelaNatacion(int maxAlbercas) {
		albercas= new Rectangulo[maxAlbercas];
	}
	public String getNombre() {
		return nombre;
	}
	public String getDir() {
		return dir;
	}
	public int getNumAlbercas() {
		return numAlbercas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUnaAlberca(int ind) {
		String res= "Alberca no registrada";
		
		if(ind>=0 && ind<numAlbercas)
			res=albercas[ind].toString();
		return res;
	}
	public boolean altaAlberca(double a, double b) {
		boolean resp= false;
		
		if(numAlbercas<albercas.length) {
			resp=true;
			albercas[numAlbercas]=new Rectangulo(a,b);
			numAlbercas++;
		}
		return resp;
	}
	public double metrosCuadDeAlbercas() {
		double metros=0;
		
		for(int i=0;i<numAlbercas;i++)
			metros+=albercas[i].area();
		return metros;
	}
	
	public int CompareTo (EscuelaNatacion otra) {
		return this.dir.compareTo(otra.dir);

	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EscuelaNatacion other = (EscuelaNatacion) obj;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		return true;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Bienvenido a la Escuela de Natación "+nombre);
		res.append("\n De ubicación: "+dir);
		res.append("\n Contamos con : "+numAlbercas+ " Albercas");
		for(int i=0; i<numAlbercas; i++) {
		res.append("\n De medidas: "+albercas[i].toString());
		}
		return res.toString();
	}
}
