package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Gym {
	private Pokemon pokemon;
	
	public final static int POSBANNER = 119;
	
	public final static int POSPOKEBALL = 469;
	public Gym() {
		this.pokemon = new Pokemon(POSPOKEBALL);
	}
	
	public Pokemon getPokemon() {		
		return this.pokemon;
	}
	
	public void saveFile(String name) {
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("saves.txt"),true));
			output.write(name + "   Distance: " + (POSPOKEBALL-pokemon.getPosX()));
			output.newLine();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
