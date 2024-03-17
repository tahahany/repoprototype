package Prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		PrototypeRegistry registry = new PrototypeRegistry();
		
		Button redButtonPrototype=new Button (10,40,"red");
		
		registry.addItem("Landingbutton", redButtonPrototype );
		
		Button clonedButton = (Button) registry.getByColor("red");
		
		System.out.println("Cloned Button x="+clonedButton.getX()+",Y="+clonedButton.getY()+"Color="+clonedButton.getColor());
	}
	
	
}
