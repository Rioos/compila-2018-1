class Uno extends Carro {

	int nRodas;
	int ano;
	String marca;
	String modelo;
	

	void Carro() {
	}

	boolean acelerar (int a) {
		if (a>0) {
 			return true;
 		}
 		else {
 			return false;
 		}
	}
	
	boolean freiar() {
		int f = 0;
		for (int i =0; i <= 10; i++) {
			f = i+i;
		}
		return false;
	}
}
	// nesse exemplo, o analisador N�O aceitar� que exista uma } a mais
}

		