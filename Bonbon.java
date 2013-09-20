import java.lang.Math;

public class Bonbon {
	/**
	*	Objet Bonbon
	*		Type_bonbon :
	*			(0) classique
	*			(1) rayé vertical
	*			(2)	rayé horizontal
	*			(3)	sac de bonbon
	*			(4) boule a facette
	*	
	*		Couleur :
	*
	*			(0) unicolore (uniquement boule a facette)
	*			(1) bleu
	*			(2) vert
	*			(3) rouge
	*			(4) jaune
	*			(5) orange
	*			(6) violet
	*
	*		Condition d'apparition des bonbons :
	*			(0) Par défaut
	*			(1) Combo de 4 bonbons par un mouvement vertical
	*			(2)	Combo de 4 bonbons par un mouvement horizontal
	*/

	/*=============
	== Attributs ==
	=============*/

	private int type_bonbon;
	/**
	*	Type de bonbon
	*		@see Bonbon#get_bonbon()
	*		@see Bonbon#set_bonbon(int)
	*/

	/*=================
	== Constructeurs ==
	=================*/

	Bonbon () {
		/**
		*	Constructeur vide
		*/
		this.type_bonbon = null;
	}

	/*=============
	== Fonctions ==
	=============*/

	int set_rand_type_bonbon () {
		/**
		*	Generer aleatoirement un type de bonbon
		*/
		int nb_type_bonbon = 5;
		int type_bonbon;

		type_bonbon = (int) (Math.rand() * nb_type_bonbon);

		return type_bonbon;
	}
}