package syntaticTree;

public class ListNode extends GeneralNode {
	public GeneralNode node;
	public ListNode next;
	
	public ListNode(GeneralNode t2) {
		super(t2.position); //passa token de referencia para contrutor da superclasse
		node  = t2;
		next = null;
	}
	
	public ListNode(GeneralNode t2, ListNode l) {
		super(t2.position); //passa token de referencia para contrutor da superclasse
		node  = t2;
		next = l;
	}
	
	public void add(GeneralNode t2) {
		if (next == null) next = new ListNode(t2); //verifica se é o ultimo da lista e insere no final
		else next.add(t2); //insere apos o proximo
	}
}
