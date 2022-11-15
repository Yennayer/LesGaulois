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
	
	public void frapper(Romain romain) {
		System.out.println(name + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}
	
	public void boirePotion (int forcePotion) {
		effetPotion = forcePotion;
		if ( effetPotion == 3 ) {
			System.out.println(" Merci Druide, je sens que ma force est 3 fois décuplée. ");
		}
	}
	
@Override
	public String toString() {
		return "Gaulois [name=" + name + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus",6);
		//System.out.println(asterix.name);
		//System.out.println(asterix);
		
		asterix.parler("Bonjour !!");
		asterix.frapper(minus);
		
		asterix.boirePotion(3);
		
	}
	
	
}
