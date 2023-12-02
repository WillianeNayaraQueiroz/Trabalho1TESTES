public class Main {

	public static void main(String[] args) {
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(1); // 2
		
		Livro l2 = new Livro(2); // 3
		
		Livro l3 = new Livro(3); // 4
		
		Livro l4 = new Livro(1); // 2
		
		Item i1 = new Item(l1);
		Item i2 = new Item(l2);
		Item i3 = new Item(l3);
		Item i4 = new Item(l4);
		
		e.itens_emprestimo.add(i1);
		e.itens_emprestimo.add(i2);
		e.itens_emprestimo.add(i3);
		e.itens_emprestimo.add(i4);
		
		System.out.println(e.itens_emprestimo);

		System.out.print("Data de Empréstimo: " + e.getDataEmprestimo());
		System.out.print("\nData de Devolução: " + e.calculaDataDevolucao().getTime());

	}

}