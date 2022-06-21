import java.util.ArrayList;
/* Rodrigo
 * Oct 2018
 * Doctor
 */
public class Doctor {
	private String nombre;
	private int cedUnic;
	private static int generadorCedUnic=0000000;
	private String estudios;
	private char genero;
	private ArrayList<String> esps;
	private int numEsps;
	
	public Doctor () {
		cedUnic=generadorCedUnic;
		generadorCedUnic++;
	}
	public Doctor (int cu) {
		this.cedUnic=cu;
	}
	public Doctor(String nombre, int cedUnic, ArrayList<String> esp, String estudios, char genero) {
		this.nombre = nombre;
		this.cedUnic = cedUnic;
		this.esps = esp;
		numEsps++;
		this.estudios = estudios;
		this.genero = genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getEsps() {
		return esps;
	}
	public void setEsps(String esp) {
		esps.add(esp);
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getCedUnic() {
		return cedUnic;
	}
	public String getEstudios() {
		return estudios;
	}
	
	public int compareTo(Doctor otro) {
		int res=-1;
		if(this.cedUnic==otro.cedUnic)
			res=0;
		if(this.cedUnic>otro.cedUnic)
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
		Doctor other = (Doctor) obj;
		if (cedUnic != other.cedUnic)
			return false;
		return true;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Doctor: "+nombre);
		res.append("\nEspecialidades: "+esps);
		res.append("\nCédula profesional: "+cedUnic);
		res.append("Género: "+genero);
		res.append("Egresado en: "+estudios);
		
		return res.toString();
	}
	
	
	
	
	

}
