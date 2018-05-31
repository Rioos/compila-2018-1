class pEssOa {
	int anoNasc;
	String nome;
	int cpf;
	
	int metodo() {
		if (3 != 4) {
			String s;
			s = "a";
			return s;
			/* nesse exemplo, o analisador aceitar� que um metodo do tipo int retorne um String */
		}
	}
}