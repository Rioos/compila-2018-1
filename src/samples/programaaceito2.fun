class Carro extends Carro {
// nesse exemplo, o analisador aceitará uma classe extender ela mesma
	char a = 'a';
	float versao = 12.321;
	String abc = "abc";
	
	constructor void Carro(String s) {
		abc = s;
	}
	
	int estacionar() {
		int a = 123 + 22;
		int b = 10;
		if (a>10 and b>10) {
		return versao;
		}
		// nesse exemplo, o analisador sintatico aceita que o metodo do tipo int retorne um float, pois isso seria um erro semantico
	}
}
	
	