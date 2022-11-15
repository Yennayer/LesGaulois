package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public void recevoirCoup(int forcecoup) {
		force -= forcecoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abondonne...");

		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("Bonjour � tous");
		minus.recevoirCoup(6);
	}
}
