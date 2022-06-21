/* Rodrigo
 * Oct 2018
 * Persona
 */
public class Alumno implements Comparable <Alumno> {
	private int cu;
	private static int generadorCU=180000;
	private String nombre;
	private String genero;
	private int ahoNac;
	private int semestre;
	private String carrera;
	private double [] califs;
	private String [] nomMat;
	private int numCalif;
	private static final int CANTMAT=8;
	
	public Alumno() {
		cu=generadorCU;
		generadorCU++;
		califs= new double[CANTMAT];
		nomMat =new String[CANTMAT];
		numCalif=0;
	}

	public Alumno(String nombre, String genero, int ahoNac, int semestre, String carrera) {
		this();
		this.nombre = nombre;
		this.genero = genero;
		this.ahoNac = ahoNac;
		this.semestre = semestre;
		this.carrera = carrera;
	
	}
	public Alumno (int cu) {
		this.cu=cu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public int getNumCalif() {
		return numCalif;
	}

	public void setNumCalift(int cantMat) {
		this.numCalif = numCalif;
	}

	public int getCu() {
		return cu;
	}

	public int getAhoNac() {
		return ahoNac;
	}
	public double promedio() {
		int suma=0;
		
		for(int i=0; i<numCalif; i++)
			suma +=califs[i];
		return suma/numCalif;
	}
	public boolean altaInfo(String nom, double cal) {
		boolean res=false;
		
		if(numCalif<CANTMAT) {
			nomMat[numCalif]=nom;
			califs[numCalif]=cal;
			res=true;
			numCalif++;
		}
		return res;
	}
	public String nomMatConMayCalif() {
		String res=null;
		double max= califs[0];
		
		for(int i=0; i<numCalif;i++) {
			if(califs[i]>max)
				max=califs[i];
			res=nomMat[i].toString();
		}
		return res;
	}
	public int compareTo(Alumno otro) {
		int res=-1;
		
		if(this.cu==otro.cu)
			res=0;
		else
			if(this.cu>otro.cu)
				res=1;
		
		return res;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (cu != other.cu)
			return false;
		return true;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Alumno: "+nombre);
		res.append("\nClave única: "+cu);
		res.append("\nGénero: "+genero);
		res.append("\nAño de nacimiento: "+ahoNac);
		res.append("\nSemestre: "+semestre);
		res.append("\nCarrera: "+carrera);
		res.append("\nCursa: "+numCalif+ " materias");
		return res.toString();
	}
	
	
	

}
