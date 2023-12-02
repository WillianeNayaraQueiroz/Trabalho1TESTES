import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class TestEmprestimo {

	@Test
	void test() {
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(0); // 1 dias de prazo
		Livro l2 = new Livro(2); // 3 dias de prazo
		Livro l3 = new Livro(3); // 4 dias de prazo		
		Livro l4 = new Livro(9); // 10 dias de prazo
		
		Item i1 = new Item(l1);
		Item i2 = new Item(l2);
		Item i3 = new Item(l3);
		Item i4 = new Item(l4);
		
		e.itens_emprestimo.add(i1);
		e.itens_emprestimo.add(i2);
		e.itens_emprestimo.add(i3);
		e.itens_emprestimo.add(i4);

		Calendar data_obtida = e.calculaDataDevolucao();
		
		Calendar data_esperada = Calendar.getInstance();
		data_esperada.add(Calendar.DATE, 14);
		
		assertEquals(data_esperada.getTime(), data_obtida.getTime());
	
	}

}
