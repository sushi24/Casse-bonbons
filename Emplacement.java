public class Emplacement {
	/**
	*	Objet Emplacement
	*		Bonbon bonbon
	*		int type_emplacement
	*/

	/*============
	== Attribut ==
	============*/

	private Bonbon bonbon;
	/**
	*	Bonbon a l'emplacement
	*	@see Emplacement#get_bonbon()
	*	@see Emplacement#set_bonbon(Bonbon)
	*/
	private int type_emplacement;
	/**
	*	Type d'emplacement
	*	@see Emplacement#get_type_emplacement()
	*	@see Emplacement#set_type_emplacement(Emplacement)
	*/


	/*================
	== Constructeur ==
	================*/

	Emplacement () {
		this.bonbon = null;
		this.type_emplacement = 1;
	}

	Emplacement (Bonbon bonbon, int type_emplacement) {
		this.bonbon = bonbon;
		this.type_emplacement = type_emplacement;
	}

	/*==============
	== Accesseurs ==
	==============*/

	Bonbon get_bonbon () {
		return this.bonbon;
	}

	int get_type_emplacement () {
		return this.type_emplacement;
	}

	/*==============
	== Modifieurs ==
	==============*/

	void set_bonbon (Bonbon bonbon) {
		this.bonbon = bonbon;
	}

	void set_type_emplacement (int type_emplacement) {
		this.type_emplacement = type_emplacement;
	}

	/*================
	== Zone de test ==
	================*/
	public static void main (String[] args) {
		Emplacement test_emp = new Emplacement(new Bonbon(), 1);
		System.out.println(test_emp.bonbon.get_couleur());
	}
}