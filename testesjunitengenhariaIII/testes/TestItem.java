import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

class TestItem {

	@Test
	void test() {
		Livro l1 = new Livro(1); // 2 dias de prazo
		Item i1 = new Item(l1);
		Calendar data_obtida = i1.calculaDataDevolucao();
		
		Calendar data_esperada = Calendar.getInstance();
		data_esperada.add(Calendar.DATE, 2);
		
		assertEquals(data_esperada.get(5), data_obtida.get(5));
		assertEquals(data_esperada.get(6), data_obtida.get(6));
		assertEquals(data_esperada.get(7), data_obtida.get(7));
	}

}
