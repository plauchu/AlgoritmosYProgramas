import java.util.Arrays;
/* Rodrigo
 * Oct 2018
 * OficinaGobierno
 */
public class OficinaGob {
	private String encargado;
	private double[] poblacion;
	private String[] nombreEdo;
	private int numEdos;
	private final int MAX=32;
	
	public OficinaGob(){
		poblacion=new double[MAX];
		nombreEdo=new String[MAX];
		numEdos=0;
	}
	public OficinaGob(String encargado){
		this.encargado=encargado;
	}
	public String getEncargado() {
		return encargado;
	}
	public double getUnaPoblacion(int pos) {
		double res=0;
		
		if (pos>=0 && pos<numEdos)
			res=poblacion[pos];
		return res;
	}
	public String getUnNombreEdo(int pos) {
		String res="Estado no registrado";
		
		if (pos>=0 && pos<numEdos)
			res=this.nombreEdo[pos];
		return res;
	}
	public int getNumEdos() {
		return numEdos;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public boolean altaInfo(String nom, double n) {
		boolean res= false;
		
		if(numEdos<MAX){
			res=true;
			poblacion[numEdos]=n;
			nombreEdo[numEdos]=nom;
			numEdos++;
		}
		return res;
	}
	public String nomEdoMayPob() {
		String res=null;
		int p=ManejadorArreglos.posMayor(poblacion, numEdos);
		 
		if(p>=0)
			res=nombreEdo[p];
		return res;
		
	}
	public double promHab() {
		return ManejadorArreglos.promedio(poblacion, numEdos);
	}
	public int totalEdosPobMenProm() {
		return ManejadorArreglos.cuantosMenX(poblacion, numEdos, ManejadorArreglos.promedio(poblacion, numEdos));	
	}
	public int CompareTo(OficinaGob otro) {
		int res=-1;
		if(encargado==otro.encargado)
			res=0;
		return res;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OficinaGob other = (OficinaGob) obj;
		if (encargado == null) {
			if (other.encargado != null)
				return false;
		} else if (!encargado.equals(other.encargado))
			return false;
		return true;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Bienvenido a la oficina de Gobierno");
		res.append("\n El encargado es: "+encargado);
		res.append("\n Número de estados: "+numEdos);
		for(int i=0; i<numEdos; i++) {
		res.append("\n Las poblaciones: "+poblacion[i]);
		res.append("\n Los estados: "+nombreEdo[i]);
		}
		return res.toString();
	}
	
	
}
