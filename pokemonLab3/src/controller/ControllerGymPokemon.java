package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
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
		
		pokeball.setLayoutX(i);
		//gym.getPokemon().setPosX((int)pokeball.getLayoutX());
	}
	
	public ImageView getPokeball() {
		return pokeball;
		
	}
	
	public void selected(ActionEvent e) {
		Node pokes =  ((Node) e.getSource()).getParent();
		RadioButton p1 = (RadioButton) pokes.lookup("#p1");
		RadioButton p2 = (RadioButton) pokes.lookup("#p2");
		RadioButton p3 = (RadioButton) pokes.lookup("#p3");
		RadioButton p4 = (RadioButton) pokes.lookup("#p4");
		RadioButton p5 = (RadioButton) pokes.lookup("#p5");
		RadioButton p6 = (RadioButton) pokes.lookup("#p6");
		RadioButton p7 = (RadioButton) pokes.lookup("#p7");
		RadioButton p8 = (RadioButton) pokes.lookup("#p8");
		ImageView poke = (ImageView) ((Node) e.getSource()).getParent().lookup("#poke");
		int p = 0;
		if (p1.isSelected()) {
			p = 1;
		} else if (p2.isSelected()) {
			p = 2;
		} else if (p3.isSelected()) {
			p = 3;
		} else if (p4.isSelected()) {
			p = 4;
		} else if (p5.isSelected()) {
			p = 5;
		} else if (p6.isSelected()) {
			p = 6;
		} else if (p7.isSelected()) {
			p = 7;
		} else if (p8.isSelected()) {
			p = 8;
		}
		poke.setImage(new Image(getClass().getResourceAsStream("/"+p+".png")));
	}
		
	
}
