package symtable;

// classe que abriga uma declaracao de variavel na tabela de simbolos
public class EntryVar extends EntryTable	{
	public EntryTable type; // pointer para o tipo de variavel
	public int dim; //numero de dimensoes da variavel
	public int localcount; // numeracao sequencial para as vars. locais

	//cria uma entrada para a var. de calsse
	
	public EntryVar(String n, EntryTable p, int d) 
	{
		name = n;
		type = p;
		dim = d;
		localcount = -1; 
	}
	
	//cria uma entrada para var. local
	public EntryVar(String n, EntryTable p, int d, int k)
	{
		name = n;
		type = p;
		dim = d;
		localcount = k;
	}
}
