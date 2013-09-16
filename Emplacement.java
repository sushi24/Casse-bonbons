public class Emplacement {
	/**
	*	Objet Emplacement
	*		nom_plateau : plateau auquel appartient la case
	*		emp_x : coordonnée x de la case sur le plateau
	*		emp_y : coordonnée y de la case sur le plateau
	*		bonbon : bonbon a l'emplacement
	*		type_emplacement :
	*			- 0 : emplacement non utilisable 
	*			- 1 : emplacement normal
	*			- 2 : emplacement obstacle 1
	*			- .............
	*			- 5 : emplacement obstacle 4
	*		emplacement_haut : emplacement situé au dessus
	*		emplacement_bas : emplacement situé en dessous
	*		emplacement_gauche : emplacement situé a gauche
	*		emplacement_droite : emplacement situé a droite
	*/

	/*============
	== Attribut ==
	============*/

	Plateau nom_plateau;
	/**
	*	Plateau sur lequel l'emplacement se situe
	*	@see Emplacement#get_plateau()
	*	@see Emplacement#set_plateau(Plateau)
	*/
	int emp_x;
	/**
	*	Coordonnées x a laquel l'emplacement se situe
	*	@see Emplacement#get_emp_x()
	*	@see Emplacement#set_emp_x(int)
	*/
	int emp_y;
	/**
	*	Coordonnées y a laquel l'emplacement se situe
	*	@see Emplacement#get_emp_y()
	*	@see Emplacement#set_emp_y(int)
	*/
	Bonbon bonbon;
	/**
	*	Bonbon a l'emplacement
	*	@see Emplacement#get_bonbon()
	*	@see Emplacement#set_bonbon(Bonbon)
	*/
	int type_emplacement;
	/**
	*	Type d'emplacement
	*	@see Emplacement#get_emplacement()
	*	@see Emplacement#set_emplacement(Emplacement)
	*/
	Emplacement emp_haut;
	/**
	*	L'emplacement situé au dessus
	*	@see Emplacement#get_emp_haut()
	*	@see Emplacement#set_emp_haut(Emplacement)
	*/
	Emplacement emp_bas;
	/**
	*	L'emplacement situé au dessus
	*	@see Emplacement#get_emp_bas()
	*	@see Emplacement#set_emp_bas(Emplacement)
	*/
	Emplacement emp_gauche;
	/**
	*	L'emplacement situé au dessus
	*	@see Emplacement#get_emp_gauche()
	*	@see Emplacement#set_emp_gauche(Emplacement)
	*/
	Emplacement emp_droite;
	/**
	*	L'emplacement situé au dessus
	*	@see Emplacement#get_emp_droite()
	*	@see Emplacement#set_emp_droite(Emplacement)
	*/

	/*==============
	== Accesseurs ==
	==============*/

	int get_emp_x () {
		return this.emp_x;
	}

	int get_emp_y () {
		return this.emp_y;
	}

	Bonbon get_bonbon () {
		return this.bonbon;
	}

	int get_type_emplacement () {
		return this.type_emplacement;
	}

	Emplacement emp_haut () {
		return this.emp_haut;
	}

	Emplacement emp_bas () {
		return this.emp_bas;
	}

	Emplacement emp_gauche () {
		return this.emp_gauche;
	}

	Emplacement emp_droite () {
		return this.emp_droite;
	}

	/*================
	== Constructeur ==
	================*/

	Emplacement () {
		/**
		*	Constructeur vide	
		*/
		this.plateau = null;
		this.emp_x = null;
		this.emp_y = null;
		this.bonbon = null;
		this.emp_haut = null;
		this.emp_bas = null;
		this.emp_gauche = null;
		this.emp_droite = null;
	}

	Emplacement (Plateau plateau, int x, int y, Bonbon bonbon, int type_emplacement) {
		// A revoir
		this.plateau = plateau;
		this.emp_x = x;
		this.emp_y = y;
		this.bonbon = bonbon;
		this.type_emplacement = type_emplacement;
		if (this.emp_x < 0) {
			this.emp_haut = null;
		}
		else {
			this.emp_haut = null;
		}
		this.emp_haut = null;
		this.emp_bas = null;
		this.emp_gauche = null;
		this.emp_droite = null;
	}

	/*=============
	== Fonctions ==
	=============*/

	Bonbon generer_bonbon () {
		/**
		*	Generer un bonbon normal aleatoirement
		*/
		Bonbon bonbon = null;



		return bonbon;
	}


	/*==============
	== Modifieurs ==
	==============*/

	void set_emp_x (int x) {
		this.emp_x = x;
	}

	void set_emp_y (int y) {
		this.emp_y = y;
	}

	void set_bonbon (Bonbon bonbon) {
		this.bonbon = bonbon;
	}

	void set_type_emplacement (int type_emplacement) {
		this.type_emplacement = type_emplacement;
	}

	void set_emp_haut (Emplacement emp) {
		this.emp_haut = emp;
	}

	void set_emp_bas (Emplacement emp) {
		this.emp_bas = emp;
	}

	void set_emp_gauche (Emplacement emp) {
		this.emp_gauche = emp;
	}

	void set_emp_droite (Emplacement emp) {
		this.emp_droite = emp;
	}
}