import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

    // Data prevista para a devolução do empréstimo
    Date dataPrevista = new Date();
    
    // Data em que o empréstimo foi realizado
    Date dataEmprestimo = new Date();

    // Getter para obter a data de empréstimo
    public Date getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    // Setter para definir a data de empréstimo
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    // Lista de itens presentes no empréstimo
    List<Item> itens_emprestimo = new ArrayList<Item>();

    // Método para calcular a data de devolução com base nos itens do empréstimo
    public Calendar calculaDataDevolucao() {
        // Inicializa um objeto Calendar com a data atual
        Calendar data_aux = Calendar.getInstance();

        // Itera sobre os itens do empréstimo para calcular as datas de devolução individuais
        for (int i = 0; i < itens_emprestimo.size(); i++) {
            Calendar data_item = itens_emprestimo.get(i).calculaDataDevolucao();
            
            // Compara a data do item com a data auxiliar e atualiza se for maior
            if (data_item.compareTo(data_aux) == 1) {
                data_aux = data_item; 
            }
        }

        // Obtém a quantidade de itens no empréstimo
        int qtd_itens = itens_emprestimo.size();

        // Se a quantidade de itens for menor que 3, retorna a data mais recente encontrada
        if (qtd_itens < 3) {
            return data_aux;
        }

        // Calcula a quantidade de dias a serem adicionados com base na quantidade de itens
        int adicao = 2 * (qtd_itens - 2);
        
        // Adiciona os dias calculados à data auxiliar
        data_aux.add(Calendar.DATE, adicao);
        
        // Retorna a data de devolução final
        return data_aux;
    }
}
