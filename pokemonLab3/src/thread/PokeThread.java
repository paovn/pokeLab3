package thread;

import javax.swing.JOptionPane;

import controller.ControllerGymPokemon;
import model.Gym;

public class PokeThread extends Thread {
	
	private ControllerGymPokemon control;
	
	private Gym gym;
	
	private boolean end;
	
	public PokeThread(ControllerGymPokemon control, Gym gym) {
		
		this.control = control;
		this.gym = gym;
		end = true;
	}
	
	public void run() {
		
		while(end) {
			if(gym.getPokemon().getPosX() > gym.POSBANNER) {
				gym.getPokemon().changePosX();
				control.move(gym.getPokemon().getPosX());
				
			}else {
				
				JOptionPane.showMessageDialog(null, gym.POSPOKEBALL - gym.POSBANNER , "La distancia recorrida por el pokemon es:", JOptionPane.ERROR_MESSAGE);
				end = false;
			}
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
