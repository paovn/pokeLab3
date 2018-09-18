package model;

public class Gym {
	private Pokemon pokemon;

	private String[] pokemons = {"/" +1+".gif","/" +2+".gif","/" +3+".gif","/" +4+".gif","/" +5+".gif","/" +6+".gif","/" +7+".gif","/" +8+".gif" }; 
	
	public final static int POSBANNER = 119;
	
	public final static int POSPOKEBALL = 469;
	public Gym() {
		this.pokemon = new Pokemon(540, 300);
	}
	
	public Pokemon getPokemon() {		
		return this.pokemon;
	}
	
	public void saveFile(String nombrePokemon, String distancia) {
		
		//TO DO
		
	}
	public int generatePokemon() {
		
		int retorno = (int)(Math.random()*(pokemons.length+1));
		
		return retorno;
	}
	public String doString() {
		String retorno = "";
		retorno = pokemons[generatePokemon()];
		return retorno;
	}
	
	
}
