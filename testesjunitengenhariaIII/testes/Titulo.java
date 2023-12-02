public class Titulo {
	int prazo;
	public Titulo(int codigo)
	{
		//Dá o prazo de devolução como sendo o codigo do livro mais 1
	 	this.setPrazo(codigo+1);
	}
	public int getPrazo() {
		return prazo;
	}
	
	public void setPrazo(int prazo) {
		if (prazo > 0) {
			this.prazo = prazo;
		} else {
			this.prazo = 7;
		}
	}
}