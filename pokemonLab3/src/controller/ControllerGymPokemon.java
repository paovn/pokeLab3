package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Gym;
import thread.PokeThread;

public class ControllerGymPokemon implements Initializable{
	
	private Gym gym;
	private Node node;
	private ImageView pokeball;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gym = new Gym();
		
	}
	@FXML
	public void pokeRandom(MouseEvent action) {
		
		gym.generatePokemon();
//		node = ((Node) action.getSource()).getParent().getParent();
//		pokeball = (ImageView) node.lookup("pokeball");
		pokeball = (ImageView) action.getSource();
		
		Image image = new Image(getClass().getResourceAsStream(gym.doString()));
		pokeball.setImage(image);
		gym.getPokemon().setPosX((int)pokeball.getLayoutX());
		PokeThread thread = new PokeThread(this, gym);
		thread.start();
		
	}
	public void move(int i){
		
		pokeball.setLayoutX(pokeball.getLayoutX() - i);
		gym.getPokemon().setPosX((int)pokeball.getLayoutX());
	}
	
	public ImageView getPokeball() {
		return pokeball;
		
	}
		
	
}
