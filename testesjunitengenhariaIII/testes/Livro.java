public class Livro {
	Titulo titulo;
	
	public Livro(int codigo) {
		//gera automaticamente um título vinculado
		this.titulo = new Titulo(codigo);
	}
	public int verPrazo() {
		return titulo.getPrazo();
	}

}