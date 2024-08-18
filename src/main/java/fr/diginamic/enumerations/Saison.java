package fr.diginamic.enumerations;
/**
 * Représente une saison et fournit les 4 instances de saisons.
 * 
 * @author DIGINAMIC
 *
 */
public enum Saison {

	/** Les 4 instances de Saison */
	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	/** libelle */
	private String libelle;
	/** ordre */
	private int ordre;

	/**
	 * Constructeur
	 * 
	 * @param libelle libellé
	 * @param ordre   ordre
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/**
	 * Permet de rechercher une Saison à partir de son libellé
	 * 
	 * @param libelle libellé
	 * @return {@link Saison}
	 */
	public static Saison valueOfLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		Saison vide = Saison.PRINTEMPS;
		vide.setLibelle("");
		vide.setOrdre(0);
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				return saison;
			}
			else {
				return vide;
			}
		}
		return vide;
	}

	@Override
	public String toString() {
		if ( (libelle != null) && (ordre > 0) && (ordre < 5)) return ordre + ". " + libelle;
		else return "";
    }

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}

	/**
	 *  Setter
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		if (libelle.equals("Printemps") || libelle.equals("Eté") || libelle.equals("Hiver") || libelle.equals("Automne")) this.libelle = libelle;
		else this.libelle = "";
	}

	/**
	 *  Setter
	 * @param ordre
	 */
	public void setOrdre(int ordre) {
		if ((ordre > 0) && (ordre < 5)) this.ordre = ordre;
		else this.ordre = 0;
	}
}