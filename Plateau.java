public class Plateau {
	/**
	*	Objet Plateau
	*		int taille_x
	*		int taille_y
	*		Emplacement[][] etat_plateau
	*/

	/*============
	== Attribut ==
	============*/

	private int taille_x;
	/**
	*	Taille limite de x
	*		@see Plateau#get_nb_col()
	*		@see Plateau#set_nb_col(int)
	*/
	private int taille_y;
	/**
	*	Taille limite de y
	*		@see Plateau#get_nb_ligne()
	*		@see Plateau#set_nb_ligne(int)
	*/
	private Emplacement[][] etat_plateau;
	/**
	*	Plateau de jeu dans son etat actuel	
	*		@see Plateau#get_etat_plateau;
	*		@see Plateau#set_etat_plateau(Plateau);
	*/

	/*=================
	== Constructeurs ==
	=================*/

	Plateau () {
		/** 
		*	Constructeur vide
		*/
		this.taille_x = 0;
		this.taille_y = 0;
		this.etat_plateau = null;
	}

	Plateau (int taille_x, int taille_y, Emplacement[][] etat_plateau) {
		/**
		*	Constructeur avec un plateau initialisé
		*/
		this.taille_x = taille_x;
		this.taille_y = taille_y;
		this.etat_plateau = etat_plateau;
	}

	/*==============
	== Accesseurs ==
	==============*/

	int get_nb_col () {
		return this.nb_col;
	}

	int get_nb_ligne () {
		return this.nb_ligne;
	}

	Emplacement[][] get_etat_plateau () {
		return this.etat_plateau;
	}

	/*==============
	== Modifieurs ==
	==============*/

	void set_nb_col (int nb_col) {
		this.nb_col = nb_col;
	}

	void set_nb_ligne (int nb_ligne) {
		this.nb_ligne = nb_ligne;
	}

	void set_etat_plateau (Emplacement[][] etat_plateau) {
		this.etat_plateau = etat_plateau;
	}
}