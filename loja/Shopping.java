import java.util.ArrayList;

public class Shopping {
	
	private String nomeShopping;
	private String enderecoShopping;
	private ArrayList<Loja> lojas;

	public Shopping (String nome, String endereco) {
		this.nomeShopping = nome;
		this.enderecoShopping = endereco;
		this.lojas = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nomeShopping;
	}
	
	public String getEndereco() {
		return this.enderecoShopping;
	}
	
	public void setNome(String nome) {
		this.nomeShopping = nome;
	}
	
	public void setEndereco(String endereco) {
		this.enderecoShopping = endereco;
	}
	
	public void addLojaP (String nome, String proprietario, String lojaTipo, int numero) {
		Loja h = new Loja(nome, proprietario, lojaTipo, numero);
		this.lojas.add(h);
	}
	
	public void addLoja(Loja i) {
		this.lojas.add(i);
	}
	
	public String getTotalLojas() {
		return "Número de lojas: "+this.lojas.size();
	}
	
	public Loja removeLoja(int i) {
		return this.lojas.remove(i);
	}
	
	public boolean removeLojaD (Loja i) {
		return this.lojas.remove(i);
	}
	
	@Override
	public String toString() {
		return "Shopping "+this.nomeShopping+"\nEndereço "+this.enderecoShopping;
	}
}
