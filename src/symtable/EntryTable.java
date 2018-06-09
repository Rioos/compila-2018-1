package symtable;

abstract public class EntryTable {

	public String name; // nome do simbolo (var, metodo, classe...)
	public EntryTable next; //pointer p o proximo dentro da tabela
	public int scope; //numero do aninhamento corrente
	public Symtable mytable; // aponta para a tabela da qual ela eh parte
	
}
