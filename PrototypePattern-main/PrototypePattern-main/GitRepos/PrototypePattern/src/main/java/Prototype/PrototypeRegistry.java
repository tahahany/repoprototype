package Prototype;
import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
	
	private Map<String,Prototype>items = new HashMap<>();

	public void addItem(String id, Prototype p) {
		items.put(id, p);
	}
	public Prototype getById(String id) {
		return items.get(id).Clone();
	}
	public Prototype getByColor(String color) {
		for(Prototype item:items.values()) {
			if(item.getColor().equals(color)) {
				return item.Clone();
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
