package Prototype;

public class Button implements Prototype {
	private int y;
	private int x;
	private String color;
	
	
	public Button(int x, int y, String color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public Button(Button prototype) {
		this.x=prototype.x;
		this.y=prototype.y;
		this.color=prototype.color;	
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String getColor() {
		return color;
	}
	@Override
	public Button Clone() {
		return new Button(this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	



}
