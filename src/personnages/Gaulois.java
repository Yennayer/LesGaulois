package personnages;

public class Gaulois {
	private String name;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String name, int force) {
		this.name = name;
		this.force = force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le gaulois " + name + " : ";
	}
	
	
	

	@Override
	public String toString() {
		return "Gaulois [name=" + name + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
}
