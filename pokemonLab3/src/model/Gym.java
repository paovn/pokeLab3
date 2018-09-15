package model;

public class Gym {
	private Pokemon pokemon;

	private String[] pokemons = {"/" +1+".png","/" +2+".png","/" +3+".png","/" +4+".png","/" +5+".png","/" +6+".png"}; 
	
	public Gym() {
		this.pokemon = new Pokemon(540, 300);
	}
	
	public Pokemon darPokemon() {		
		return this.pokemon;
	}
	
	public void guardarArchivo(String nombrePokemon, String distancia) {
		
		//TO DO
		
	}
	public int generatePokemon() {
		
		int retorno = (int)(Math.random())*(pokemons.length+1);
		
		return retorno;
	}
	public String doString() {
		String retorno = "";
		retorno = "/"+generatePokemon() +".png";
		return retorno;
	}
	
}
