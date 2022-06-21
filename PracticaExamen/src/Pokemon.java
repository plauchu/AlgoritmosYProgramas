/*
 * Rodrigo Plauchú Rodríguez
 * Pokemon
 * Oct2018
 */
public class Pokemon {
	private String nombre;
	private char tipo;
	private String especie;
	private int valorAtaque;
	private int valorDefensa;
	private int numAtaques;
	private int clave;
	private static int folio;
	
	public Pokemon() {
		clave=folio;
		folio++;
	}

	public Pokemon(String nombre, char tipo, String especie, int valorAtaque, int valorDefensa,int numAtaques) {
		this();
		this.nombre = nombre;
		this.tipo = tipo;
		this.especie = especie;
		this.valorAtaque = valorAtaque;
		this.valorDefensa = valorDefensa;
		this.numAtaques=numAtaques;
	}
	public Pokemon(int clave) {
		this.clave=clave;
	}
		
	public String getNombre() {
		return nombre;
	}

	public char getTipo() {
		return tipo;
	}

	public int getValorAtaque() {
		return valorAtaque;
	}

	public int getValorDefensa() {
		return valorDefensa;
	}
	
	public int getNumAtaques() {
		return numAtaques;
	}

	public void setNumAtaques(int numAtaques) {
		this.numAtaques = numAtaques;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (clave != other.clave)
			return false;
		return true;
	}
	 public int compareTo(Pokemon otro) {
		 int res=-1;
		 
		 if(this.clave==otro.clave)
			 res=0;
		 if(this.clave>otro.clave)
			 res=1;
		 
		 return res;
	 }
	public String toString(){
		StringBuilder res= new StringBuilder();
		
		res.append("Nombre del Pokemon: "+nombre);
		res.append("\nDe tipo: "+tipo);
		res.append("\nEspecie: "+especie);
		res.append("\nValor de ataque: "+valorAtaque);
		res.append("\nValor defensa: "+valorDefensa);
		res.append("\nCuenta con: "+numAtaques+" número de ataques");
		res.append("\nClave: "+clave);
		return res.toString();
	}
	
}
