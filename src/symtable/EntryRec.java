package symtable;

// lista de ENtryclass usada pra representar os tipos de uma de lista parametros
public class EntryRec extends EntryTable {

	public EntryTable type;
	public int dim;
	public EntryRec next; // apontador para o resto da lista
	public int cont; // numero de elementos a partir daquele elemento

	// cria elemento
	public EntryRec(EntryTable p, int d, int c)
	{
		type = p;
		cont = c;
		dim = d;
		next = null;
	}
	
	// cria elemento e poe no inicio da lista
	public EntryRec(EntryTable p, int d, int c, EntryRec t)
	{
		type = p;
		cont = c;
		dim = d;
		next = t;
	}
}
