import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
public class Postagem {
	
	private String conteudo;
	private LocalDateTime dataHora;
	
	public Postagem (String conteudo) {
		this.conteudo = conteudo;
		this.dataHora=LocalDateTime.now();
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	
	public LocalDateTime getDataHora() {
		return this.dataHora;
		
   }
	
}
