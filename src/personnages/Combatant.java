package personnages;

public interface Combatant {
    void frapper(Personnage p);
    void recevoirCoup(int forceCoup);
	void parler(String chaine);
}
