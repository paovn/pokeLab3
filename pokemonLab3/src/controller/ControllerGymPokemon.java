package controller;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Gym;

public class ControllerGymPokemon implements Initializable{
	
	private Gym gym;
	private Node node;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gym = new Gym();
		
	}
	public void pokeRandom(ActionEvent action) {
		
		gym.generatePokemon();
		node.getClass().getResource("pokeball");
		Image image = new Image(getClass().getResourceAsStream(gym.doString()));
		
		
		//poke.setGraphic(new ImageView(image));
	}
	
	
	
}
