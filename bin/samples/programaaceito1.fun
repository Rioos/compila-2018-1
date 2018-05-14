class Uno extends Carro {

	int nRodas;
	int ano;
	String marca;
	String modelo;

	boolean acelerar (int a) {
		if (a>0) {
 			return true;
 		}
 		else {
 			return false;
 		}
	}
	
	void Carro() {
	
	}
	
	boolean freiar() {
		float f;
		int i;
		f = 0;
		for (i = 0; i <= 10; i = i + 1) {
			f = i+1;
			
		/*nesse exemplo, o analisador sintatico aceita atribuir um int ao float, 
		pois isso seria um erro semantico
		E tambem aceita o construtor entre a declaração de dois metodos */
		
		}
		return f<1;
	}
}