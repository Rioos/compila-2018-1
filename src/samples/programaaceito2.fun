class Carro extends Carro {
// nesse exemplo, o analisador aceitar� uma classe extender ela mesma
	char a;	
	
	constructor (String s) {
		a = s;
	}
	
	int estacionar() {
		int a,b;
		a  = 123 + 22;
		b = 10;
		if ( a>10 and b>10 ) {
		return a;
		}
		// nesse exemplo, o analisador aceitar� que o metodo do tipo int nao retorne nada
	}
}