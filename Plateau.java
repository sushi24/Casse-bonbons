public class Plateau {
	/**
	*	Objet Plateau
	*		nb_col : taille limite de x
	*		nb_ligne : taille limite de y
	*/

	/*============
	== Attribut ==
	============*/

	private int nb_col;
	/**
	*	Taille limite de x
	*		@see Plateau#get_nb_col()
	*		@see Plateau#set_nb_col(int)
	*/
	private int nb_ligne;
	/**
	*	Taille limite de y
	*		@see Plateau#get_nb_ligne()
	*		@see Plateau#set_nb_ligne(int)
	*/

	/*==============
	== Accesseurs ==
	==============*/

	int get_nb_col () {
		return this.nb_col;
	}

	int get_nb_ligne () {
		return this.nb_ligne;
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
}