import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

	Date dataPrevista = new Date();
	Date dataEmprestimo = new Date();

	public Date getDataEmprestimo() {
		return this.dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}


	List<Item> itens_emprestimo = new ArrayList<Item>();
	public Calendar calculaDataDevolucao() {   
		Calendar data_aux = Calendar.getInstance();

		for (int i = 0; i < itens_emprestimo.size(); i++) {
			Calendar data_item = itens_emprestimo.get(i).calculaDataDevolucao();
			if (data_item.compareTo(data_aux) == 1) {
				data_aux = data_item; // verificar possivel erro
			}
		}
		
		int qtd_itens = itens_emprestimo.size();
		if (qtd_itens < 3) {
			return data_aux;
		}
		int adicao = 2 * (qtd_itens - 2);
		data_aux.add(Calendar.DATE, adicao);
		return data_aux;

	}
	
}