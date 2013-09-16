import java.lang.Math;

public class Bonbon {
	/**
	*	Objet Bonbon
	*		type_bonbon :
	*			- 0 : vide
	*			- 1 : couleur 1
	*			- .............
	*			- 5 : couleur 5
	*			- 6 : super bonbon 1
	*			- .............
	*			- 10 : super bonbon 5
	*/

	/*=============
	== Attributs ==
	=============*/

	int type_bonbon;
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