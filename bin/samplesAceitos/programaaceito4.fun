class expressoes {
	int a;
	int b;
	int c;
	
	
	boolean d() {
		a = 2;
		b = 3;
		c = 4;
		if (a!= b) {
			a = c + a + 3 +4 -2 +3 + 5 - 20*a;
			return true;
		}
		else {
			a = a*a;
			b = b+10;
			c = a + b + c*3/4;
			return 13;
			// nesse exemplo, o analisador sintatico aceita que o metodo retorne true ou 13, pois isso seria um erro semantico
		}
	}
}