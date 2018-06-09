package symtable;

// corresponde a uma declaracao de metodos na tabela de simbolos
public class EntryMethod extends EntryTable 
{
	public EntryTable type; // tipo de RETORNO do metodo
	public int dim;
	public EntryRec param; //tipo dos parametros
	public int totallocals; // numero de variaveis locais
	public int totalstack; // tamanho da pilha necessaria
	public boolean fake; //true se eh um falso construtor
	public boolean hassuper; // true se metodo possui chamada super
	
	public EntryMethod(String n, EntryTable p, int d, EntryRec r)
	{
		name = n;
		type = p;
		dim = d;
		param = r;
		totallocals = 0;
		totalstack = 0;
		fake = false;
		hassuper = false;
	}
	
	public EntryMethod(String n, EntryTable p, boolean b) 
	{
		name = n;
		type = p;
		dim = 0;
		param = null;
		totallocals = 0;
		totalstack = 0;
		fake = b;
		hassuper = false;
	}
}
