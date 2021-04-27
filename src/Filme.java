
public class Filme {

	public Filme() {

	}

	private String Titulo;
	private String Sinopse;
	private String Genero;
	private String OndeAssistir;
	private boolean Assistido;
	
	
	public String getOndeAssistir() {
		return OndeAssistir;
	}
	public void setOndeAssistir(String ondeAssistir) {
		OndeAssistir = ondeAssistir;
	}
	public boolean isAssistido() {
		return Assistido;
	}
	public void setAssistido(boolean assistido) {
		Assistido = assistido;
	}

	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getSinopse() {
		return Sinopse;
	}
	public void setSinopse(String sinopse) {
		Sinopse = sinopse;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}


}
