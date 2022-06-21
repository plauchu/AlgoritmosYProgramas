/*
 * Rodrigo
 * Nov 2018
 * Serpiente
 */
public class Serpiente implements Comparable <Serpiente>{
	
	private int clave;
	private String tipo;
	private double longitud;
	private double peso;
	private String alimento;
	private char genero;
	
	public Serpiente(int clave, String tipo, double longitud, double peso, String alimento, char genero) {
		
		this.clave = clave;
		this.tipo = tipo;
		this.longitud = longitud;
		this.peso = peso;
		this.alimento = alimento;
		this.genero = genero;
	}

	public Serpiente(int clave) {
		this.clave = clave;
	}
	

	public int getClave() {
		return clave;
	}

	public String getTipo() {
		return tipo;
	}

	public double getLongitud() {
		return longitud;
	}

	public double getPeso() {
		return peso;
	}

	public String getAlimento() {
		return alimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		res.append("Clave: "+clave);
		res.append("Tipo: "+tipo);
		res.append("Longitud: "+longitud);
		res.append("Peso: "+peso);
		res.append("Alimento: "+alimento);
		res.append("Genero: "+genero);
		return res.toString();
	}
	public int compareTo(Serpiente otra) {
		int res=-1;
		
		if(this.clave==otra.clave)
			res=0;
		else	
			if(this.clave>otra.clave)
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
		Serpiente other = (Serpiente) obj;
		if (clave != other.clave)
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
