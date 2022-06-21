/*
 * Rodrigo Plauchú Rodríguez
 * EjercicioExamenPokemon
 * Oct2018
 */
public class PokemonGoITAM {
	private String nombre;
	private Pokemon[] pokemones;
	private int ocupados;
	private final int MAX=500;
	
	public PokemonGoITAM() {
		pokemones= new Pokemon[MAX];	
		ocupados=0;
	}

	public PokemonGoITAM(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public boolean altaPokemon(String nombre, char tipo, String especie, int valorAtaque, int valorDefensa,int numAtaques) {
		boolean res=false;
		
		if(ocupados<pokemones.length)
			pokemones[ocupados]= new Pokemon (nombre, tipo, especie, valorAtaque, valorDefensa, numAtaques);
			res=true;
			ocupados++;
			
		return res;
	}
	
	public int cuantosValMayA(int x) {
		int res=0;
		
		for(int i=0;i<ocupados;i++)
			if(pokemones[i].getValorAtaque()>x)
				res++;
			
		return res;
	}
	public int cuantosNumAtaProm() {
		int res;
		int suma=0;
		
		for(int i=0; i<ocupados; i++)
			suma+= pokemones[i].getNumAtaques();
		res=suma/ocupados;
		return res;
	}
	
	public boolean bajaPoke(int clave) {
		boolean res=false;
		int pos;
		
		pos=buscaUnPoke(clave);
		if(pos>=0) {
			corrimientoIzq(pos);
			pokemones[ocupados]=null;
	}
		res=true;
		ocupados--;
		return res;
	}
	private int buscaUnPoke(int clave) {
		Pokemon p= new Pokemon(clave);
		int i=0;
		
		while(i<ocupados && pokemones[i].compareTo(p)<0)
			i++;
		if(i==ocupados || pokemones[i].equals(p))
			i=i;
		return i;
	}
	private void corrimientoIzq(int pos) {
		for(int i=pos;i<ocupados;i++)
			pokemones[i]=pokemones[i+1];
	}
	public String toString() {
		StringBuilder res= new StringBuilder();
		
		for(int i=0;i<ocupados;i++) {
		res.append("\n"+pokemones[i]);
		}
		res.append("\nOcupados: "+ocupados);
		res.append("\nMax: "+MAX);
		return res.toString();
	}
	

}
