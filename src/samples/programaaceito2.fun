class Carro extends Carro {
// nesse exemplo, o analisador aceitar� uma classe extender ela mesma
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
		return a;
		}
		// nesse exemplo, o analisador aceitar� que o metodo do tipo int nao retorne nada
	}
}
	
	