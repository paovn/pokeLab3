package model;

public class Pokemon {
	
	private String type;
	private boolean stopped;
	private boolean isCaught;
	private int posX;

	public Pokemon(int posX) {
		this.type = "/" +"1";
		this.stopped = true;
		this.isCaught = true;
		this.posX = posX;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(int type) {
		this.type = "/" +type;
	}

	public boolean isStoped() {
		return stopped;
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void changePosX() {
		
		posX = posX -10;
	}

	public boolean isCaught() {
		return isCaught;
	}

	public void setCaught(boolean isCaught) {
		this.isCaught = isCaught;
	}
	
}
