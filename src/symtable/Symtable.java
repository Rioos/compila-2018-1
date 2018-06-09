package symtable;

public class Symtable 
{
	//apontador para o topo da tabela
	
	public EntryTable top;
	
	public int scptr;
	
	public EntryClass levelup; //apontador para a entrada EntryClass de nivel superior
	
	public Symtable() // cria tabela vazia
	{
		top = null;
		scptr = 0;
		levelup = null;
	}
	
	 public Symtable(EntryClass up) 
	 { 
		 // cria tabela vazia apontando para nivel superior 
		 top = null; 
		 scptr = 0; 
		 levelup = up; 
	 }	
	 
	public void add(EntryTable x) 
	{
		// adiciona uma entrada d tabela 
		x.next = top; // inclui nova entrada no top* 
		top = x; 
		x.scope = scptr; // atribui para a entrada o numero do escopo 
		x.mytable = this;  // faz a entrada apontar para a pi-I:Trill tabela 
	} 
	
	public void beginScope() 
	{ 
		scptr++; 
	} 
	// inicia novo aninhamento de vari&veis 
	
	public void endScope() 
	{ 
		while (top != null && top.scope == scptr) 
		{
			top = top.next; // retira todas as vars do aninhamento corrente 
		} 
		scptr--; // finaliza aninhamento corrente 1 
	}

	 
}
