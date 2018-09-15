package model;

public class Pokemon {
	
	private String nombre;
	private String ruta;
	private boolean detenido;
	private int posX;
	private int posY;
	private int posInicial;

	public Pokemon(int posX, int posY) {
		this.ruta = "./data/pikachu.gif";
		this.detenido = false;
		this.posX = posX;
		this.posY = posY;
		this.posInicial = posX;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String darRuta() {
		return this.ruta;
	}

	public boolean isDetenido() {
		return detenido;
	}

	public void setDetenido(boolean detenido) {
		this.detenido = detenido;
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public int getPosInicial() {
		return posInicial;
	}
	
}
