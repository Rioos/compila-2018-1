package symtable;

// classe correspondente a uma declaracao de classe na tab de simbolos
public class EntryClass extends EntryTable {
	public Symtable nested;
	public EntryClass parent; // entrada correspondente a superclasse
	
	public EntryClass(String n, Symtable t)
	{
		name = n;
		nested = new Symtable(this);
		parent = null;
	}
	
}
