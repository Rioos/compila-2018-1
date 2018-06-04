class Uno extends Carro {

	int nRodas;
	int ano;
	String marca;
	String modelo;
	

	int Carro() {
	;
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
		for (int i = 0; i < 10; i = i + 1) {
			f = i+i;
		}
		return false;
	}
}
	// nesse exemplo, o analisador NÃO aceitará que exista uma } a mais
}

		