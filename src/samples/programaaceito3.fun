class pEssOa {
	int anoNasc;
	String nome;
	int cpf;
	
	public int metodo() {
		if (3 != 4) {
			String s = "a";
			return s;
			/* nesse exemplo, o analisador sintatico aceita que um metodo do tipo int retorne um String, pois isso seria um erro semantico */
		}
	}
	
}
	
	