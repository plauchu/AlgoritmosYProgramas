/*
 * Rodrigo Plauchú Rodríguez
 * Pokemon
 * Oct2018
 */
public class EjecutablePokemon {

	public static void main(String[] args) {
		PokemonGoITAM p= new PokemonGoITAM();
		
		p.altaPokemon("Plauchú", 'F', "Fuego", 1000, 1000,5);
		p.altaPokemon("Juan", 'P', "Planta", 10, 10000,4);
		p.altaPokemon("Pepe", 'A', "Agua", 2000, 10,3);
		p.altaPokemon("Rob", 'V', "Viento", 4000, 1000,2);
		
		System.out.println("Hay: "+p.cuantosValMayA(20)+" superiores de ataque a 20");
		System.out.println("Promedio de ataque: "+p.cuantosNumAtaProm());
		System.out.println(p.toString());
		
		if(p.bajaPoke(1))
			System.out.println("BAJA PROCESADA");
		else
			System.out.println("ERROR EN BAJA");
		
		System.out.println(p.toString());
	}

}
