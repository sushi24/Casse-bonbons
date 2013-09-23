import java.lang.Math;

public class Bonbon {
	/**
	*	Objet Bonbon
	*		int type_bonbon
	*		String couleur
	*
	*		String set_rand_couleur()
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

	private String couleur;
	/**
	*	Couleur du bonbon
	*	@see Bonbon#get_couleur()
	*	@see Bonbon#set_couleur(String)
	*/

	/*=================
	== Constructeurs ==
	=================*/

	Bonbon () {
		this.type_bonbon = 0;
		this.couleur = set_rand_couleur();

	}

	/*==============
	== Accesseurs ==
	==============*/

	int get_type_bonbon () {
		return this.type_bonbon;
	}

	String get_couleur () {
		return this.couleur;
	}

	/*==============
	== Modifieurs ==
	==============*/

	void set_type_bonbon (int type_bonbon) {
		this.type_bonbon = type_bonbon;
	}

	void set_couleur (String couleur) {
		this.couleur = couleur;
	}

	/*=============
	== Fonctions ==
	=============*/

	String set_rand_couleur () {
		/**
		*	Generer aleatoirement un type de bonbon
		*/
		int nb_couleur = 6;
		String couleur = null;
		int random_couleur;

		random_couleur = (int) ((Math.random() * nb_couleur) + 1);
		switch(random_couleur) {
			case 1 : couleur = "Rouge"; break;
			case 2 : couleur = "Bleu"; break;
			case 3 : couleur = "Violet"; break;
			case 4 : couleur = "Orange"; break;
			case 5 : couleur = "Jaune"; break;
			case 6 : couleur = "Vert"; break;
			default : couleur = "Unicolore"; break;
		}

		return couleur;
	}

	/*
	public static void main (String[] args) {
		Bonbon test_rand_color;

		for (int i = 0; i < 20; i++) {
			test_rand_color = new Bonbon();
			System.out.println(test_rand_color.couleur);
		}
	}
	*/
}