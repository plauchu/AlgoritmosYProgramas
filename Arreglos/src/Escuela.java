/* Rodrigo
 * Oct 2018
 * Escuela
 */
public class Escuela {
	private String nombre;
	private String dir;
	private Alumno[] alumnos;
	private int cantAlumnos;
	private final int MAX_ALUMNOS=4000;
	
	public Escuela(String nombre, String dir) {
		this.nombre = nombre;
		this.dir = dir;
		cantAlumnos=0;
		alumnos= new Alumno[MAX_ALUMNOS];
	}
	public String getNombre() {
		return nombre;
	}
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	public int getCantAlumnos() {
		return cantAlumnos;
	}
	public boolean altaAlumno(String nombre, String genero, int ahoNac, int semestre, String carrera) {
		boolean res = false;
		
		if(cantAlumnos<alumnos.length) {
			res= true;
			alumnos[cantAlumnos]= new Alumno(nombre,genero,ahoNac,semestre, carrera);
			cantAlumnos++;
		}	
		return res;
	}
	public String getUnAlumno(int indice) {
		String res= "No hay información disponible";
		
		if(indice>=0 && indice<cantAlumnos)
			res=alumnos[indice].toString();
		return res;
	}
	public boolean existeElAlumno(int cu) {
		boolean res=false;
		
		if(buscarAlumno(cu)>=0)
			res=true;
		return res;
	}
	public String infoAlumno(int cu) {
		StringBuilder res= new StringBuilder();
		int i=0;
		
		 if(existeElAlumno(cu)){
			 while(i<alumnos.length && alumnos[i].getCu()!=cu) 
				 i++;
			 res.append("Información del alumno " +alumnos[i].toString());
		 }
		 else
			 res.append("No hay coincidencias");
		 
		return res.toString();	
	}
	
	public double promGeneral() {
		double res=0;
		
		for(int i=0; i<cantAlumnos; i++)
			res+=alumnos[i].promedio();
		res=res/cantAlumnos;
		return res;
	}
	public int cuantosGenero (String genero) {
		int res=0;
		
		for(int i=0; i<cantAlumnos;i++)
			if(alumnos[i].getGenero().equals(genero))
				res++;
		return res;
	}
	public int cuantosSemestre (int sem) {
		int res=0;
		
		for(int i=0; i<cantAlumnos;i++)
			if(alumnos[i].getSemestre()==sem)
				res++;
		return res;
	}
	private int buscarAlumno(int clave) {
		Alumno a;
		int i;
		
		a=new Alumno(clave);
		i=ManejadorArreglosGenericos.busSecOrd(alumnos, cantAlumnos, a);
		
		return i;
			
	}
	
	private void corrimientoIzq(int pos) {
		ManejadorArreglosGenericos.corrimientoIzq(alumnos, cantAlumnos, pos);
	}
	public boolean bajaAlumno(int cu) {
		int pos;
		boolean res=false;
		
		pos=buscarAlumno(cu);
		if(pos>=0) {
			corrimientoIzq(pos);
			alumnos[cantAlumnos]=null;
			
		}
		res=true;
		cantAlumnos--;
		return res;
	}
	public int compareTo(Escuela otra) {
		return this.dir.compareTo(otra.dir);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escuela other = (Escuela) obj;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		return true;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Escuela :"+nombre);
		res.append("\nUbicada en :"+dir);
		res.append("\nActualmente con :"+cantAlumnos+ " alumnos");
		res.append("\nCapacidad máxima :"+MAX_ALUMNOS);
		return res.toString();
	}
	
	

	
}
