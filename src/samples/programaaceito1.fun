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
		float f = 0;
		for (int i =0; i <= 10; i++) {
			f = i+1;
// nesse exemplo, o compilador aceitar� atribuir um int ao float
		}
		return f<1;
	}
}
		