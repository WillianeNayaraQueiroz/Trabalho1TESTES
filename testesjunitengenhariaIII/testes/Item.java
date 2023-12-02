import java.util.Calendar;
import java.util.Date;

public class Item {

    // Referência para o livro associado ao item
    Livro livro;

    // Data prevista para devolução do item
    Date dataDevolucao;

    // Construtor que recebe um livro como parâmetro
    public Item(Livro livro) {
        super();
        this.livro = livro;
    }

    // Getter para obter a data de devolução
    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }

    // Setter para definir a data de devolução
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // Getter para obter o livro associado ao item
    public Livro getLivro() {
        return this.livro;
    }

    // Setter para definir o livro associado ao item
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // Método para calcular a data de devolução com base no prazo do livro
    public Calendar calculaDataDevolucao() {
        // Obtém o prazo de devolução associado ao livro
        int prazo = this.livro.verPrazo();

        // Cria um objeto Calendar para representar a data de devolução
        Calendar devolucao = Calendar.getInstance();

        // Adiciona o prazo ao objeto Calendar para calcular a data de devolução
        devolucao.add(Calendar.DATE, prazo);

        // Retorna o objeto Calendar representando a data de devolução
        return devolucao;
    }
}
