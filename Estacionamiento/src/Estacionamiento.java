import java.util.ArrayList;
/*
 * Rodrigo
 * Estacionamiento
 * Nov 2018
 */
public class Estacionamiento {
	
	private String nombre;
	private String dir;
	private Auto autos[][];
	private final int MAX_PISOS=3;
	private final int MAX_COLUMNAS=10;
	
	public Estacionamiento(String nombre, String dir) {
		this.nombre = nombre;
		this.dir = dir;
		autos= new Auto[MAX_PISOS][MAX_COLUMNAS];
		Auto a= new Auto("Vacío");
		for(int i=0;i<MAX_PISOS;i++) {
			for(int j=0;j<MAX_COLUMNAS;j++) {
				autos[i][j]=a;
			}
				
		}		
	}
	
	public boolean altaAuto(String marca, int año, String modelo, String placas, String tipo,String color, int hora) {
		boolean res= false;
		int piso=0,col=0;
		Auto a= new Auto("Vacío");
		
		while (!autos[piso][col].equals(a) && col<MAX_COLUMNAS)
			col++;
			res=true;
			autos[piso][col]= new Auto(marca, año, modelo, placas, tipo,color,hora);
			if(col==MAX_COLUMNAS && piso<MAX_PISOS)
				piso++;
				col=0;
		return res;
	}
	
	public int cuantosSUV(int piso) {
		int res=0;
		
		for(int i=0;i<MAX_COLUMNAS;i++) {
			if(autos[piso][i]!=null)
				if(autos[piso][i].getTipo().equalsIgnoreCase("SUV"))
					res++;
		}
		return res;
	}
	public int cuantosCajonesLibres() {
		int res=0;
		Auto a= new Auto("Vacío");
		
		for(int i=0;i<MAX_PISOS;i++)
			for(int j=0;j<MAX_COLUMNAS;j++)
				if(autos[i][j].equals(a))
					res++;		
		return res;
	}
	public int cuantosServiciosTiene(String placas) {
		int res=0,i=0,j=0;
		Auto a=new Auto(placas);
		
		while(i<MAX_PISOS && j<MAX_COLUMNAS && !autos[i][j].equals(a))
			i++;
			j++;
		if(i==MAX_PISOS && j==MAX_COLUMNAS)
			res=-1;
		else
			res=autos[i][j].getNumServ();
		
		return res;
	}
	public ArrayList<String> autosConServX(String servicio){
		ArrayList<String> lista=new ArrayList<String>();
		Auto a=new Auto("Vacío");
		int pos;
		
		for(int i=0;i<MAX_PISOS;i++) {
			for(int j=0;i<MAX_COLUMNAS;j++) {
				if(!autos[i][j].equals(a) && autos[i][j].existeServicio(servicio)) {
					lista.add(autos[i][j].getPlacas());
				}	
			}
		}
		
		return lista;
	}
	public int [] pisoYCajonAutoMasViejo() {
		int []pos;
		
		pos=ManejadorMatricesGenerico.posMayor(autos, autos.length, autos[0].length);
		
		return pos;
	}
	
	public int cuantosColorX(String color) {
		int res=0;
		
		for(int i=0;i<MAX_PISOS;i++)
			for(int j=0;j<MAX_COLUMNAS;j++)
				if(autos[i][j].getColor().equalsIgnoreCase(color))
					res++;
		return res;	
	}
	public String pisoConTodosLugaresVacios() {
		String res="No hay un piso con todos los lugares vacíos";
		int piso=0;
		int j=0;
		Auto a= new Auto("Vacío");
		
		for(int i=0;i<MAX_PISOS;i++) {
			while(!autos[i][j].getPlacas().equals(a))
				j++;
			if(j==MAX_COLUMNAS)
				piso=i;	
				res="El piso con todos los lugares vacíos es"+piso;
		}
		return res;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Nombre: "+nombre);
		res.append("\nDirección: "+dir);
		for(int i=0;i<MAX_PISOS;i++) {
			System.out.println("\n");
			for(int j=0; j<MAX_COLUMNAS;j++) {
				res.append(autos[i][j]+"\n");
			}
		}
		return res.toString();
	}
	public int compareTo(Estacionamiento otro) {
		return this.dir.compareTo(otro.dir);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacionamiento other = (Estacionamiento) obj;
		if (dir == null) {
			if (other.dir != null)
				return false;
		} else if (!dir.equals(other.dir))
			return false;
		return true;
	}
	
	

}
