import java.util.ArrayList;
/* Rodrigo
 * Oct 2018
 * Hospital
 */
public class Hospital {
	private Doctor[] doctores;
	private String nombre;
	private String dir;
	private int cantDocs;
	private final int MAX_DOCTORES=50;
	
	
	public Hospital() {
		cantDocs=0;
		doctores=new Doctor[MAX_DOCTORES];
	}
	public Hospital(int maxDoctores) {
		doctores=new Doctor[maxDoctores];
		cantDocs=0;
	}
	public Hospital(String nom,String dir) {
		this.nombre=nom;
		this.dir=dir;
		cantDocs=0;
		doctores=new Doctor[MAX_DOCTORES];
	}
	public String getUnDoc(int indice) {
		String res="No hay coincidencias";
		
		if(indice>=0 && indice<cantDocs)
			res=doctores[indice].toString();
		return res;
	}
	public boolean altaDoc(String nombre, int cedUnic, ArrayList<String> esp, String estudios, char genero) {
		boolean res=false;
		
		if(cantDocs<doctores.length)
			doctores[cantDocs]= new Doctor(nombre, cedUnic, esp, estudios, genero);
		cantDocs++;
		return res;
	}
	public int cuantosEsp(String[] esp) {
		int res=0;
		for(int i=0; i<cantDocs; i++)
			if(doctores[i].getEsps().equals(esp))
				res++;
		return res;
	}
	public boolean altaEsp(int ced, String esp) {
		boolean res=false;
		int pos;
		
		pos=buscarDoc(ced);
		if(pos>=0)
			doctores[pos].setEsps(esp);
		
		return res;
	}
	
	private int buscarDoc(int ced) {
		Doctor d;
		int i=0;
		
		d=new Doctor(ced);
		while(i<cantDocs && doctores[i].compareTo(d)<0)
			i++;
		if(i==cantDocs || doctores[i].equals(d))
			i=-i-i;
		return i;
	}
	private void corrimientoIzq(int pos) {
		for(int i=pos;i<cantDocs;i++)
			doctores[i]=doctores[i+1];
	}
	public boolean bajaDoc(int ced) {
		int pos;
		boolean res=false;
		
		pos=buscarDoc(ced);
		if(pos>=0) {
			corrimientoIzq(pos);
			doctores[cantDocs]=null;
			
		}
		res=true;
		cantDocs--;
		return res;
	}
	
}
