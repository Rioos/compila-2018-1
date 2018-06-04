class expressoes {
	int a;
	int b;
	int c;
	
	
	boolean d() {
		a = 2;
		b = 3;
		c = 4;
		if (a!= b or c%2 and c+b>a xor a+a==a and b>=c)
			return true;
		else {
			a = a*a;
			b = b*10;
			return 13;
			// nesse exemplo, o analisador sintatico aceita que o metodo retorne true ou 13, pois isso seria um erro semantico
		}
	}
}