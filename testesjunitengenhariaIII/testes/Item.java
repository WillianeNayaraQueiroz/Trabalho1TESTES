import java.util.Calendar;
import java.util.Date;

public class Item {

	Livro livro;
    Date dataDevolucao;

    public Item(Livro livro) {
		super();
		this.livro = livro;
	}
    
    // Getters e Setters
	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Livro getLivro() {
		return this.livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Calendar calculaDataDevolucao() {
		// pega o prazo
		int prazo = this.livro.verPrazo();
		
		Calendar devolucao = Calendar.getInstance();
		devolucao.add(Calendar.DATE, prazo);
		
		return devolucao;
	}
}
