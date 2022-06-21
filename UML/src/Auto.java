/* Rodrigo
 * Sept 2018
 * AutoUML
 */
public class Auto {
	private int cU;
	private String marca;
	private int año;
	private double numKil;
	private String nom;
	private int numLic;
	private static int generador=1;
	
	public Auto(String marca, int año, double numKil) {
		cU=generador;
		generador++;
		this.marca=marca;
		this.año=año;
		this.numKil=numKil;
	}
	public int getcU() {
		return cU;
	}
	public String getMarca() {
		return marca;
	}
	public int getAño() {
		return año;
	}
	public double getNumKil() {
		return numKil;
	}
	public String getNom() {
		return nom;
	}
	public int getNumLic() {
		return numLic;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("El auto de clave única "+cU);
		res.append("\n Marca "+marca);
		res.append("\n De año "+año);
		res.append("\n Con "+numKil+ "km recorridos");
		return res.toString();
	}
	public double rentaAuto(String nom, int numLic, int dias) {
		double resp;
		if(año>2005)
			resp=dias*200;
		else
			resp=dias*300;
		if(numKil>20000)
			resp+=dias*20;
		return resp;
	}
	public void devAuto(double numKil) {
		nom=null;
		numLic=0;
		this.numKil+=numKil;
	}
	public int compareTo(Auto otro) {
		int resp=1;
		
		if(cU==otro.cU)
			resp=0;
		else
			if(cU<otro.cU)
				resp =-1;
		return resp;
	}
	public boolean equals(Auto otro) {
		boolean resp=false;
		
		if(cU==otro.cU)
			resp=true;
		return resp;
	}

}
