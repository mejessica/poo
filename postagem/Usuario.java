


import java.util.ArrayList;

public class Usuario {
	
	 private String login;
	    private String nome;
	    private ArrayList<Postagem>postagens;

    public Usuario() {
	    this.postagens = new ArrayList<Postagem>();
	}
	public Usuario (String nome, String login) {
		this.login = login;
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setLogin(String login) {
		this.login=login;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	 public void posta(String conteudo){
		 Postagem pp = new Postagem (conteudo);
		 this.postagens.add(pp);
	 }
	 
	 public Postagem getPost(int pos) {
		 return this.postagens.get(pos);
	 }
	 
	 public boolean apaga(Postagem p) {
		 if(this.postagens.contains(p)) {
			 this.postagens.remove(p);
			 return true;
		 }
		 else return false;
	 }
	 
	 public int getTotalPosts() {
		return this.postagens.size();
	 }
	 
	 public Postagem buscaPost(String valor) {
		 for(int i=0; i<postagens.size(); i++) {
			 if(postagens.get(i).getConteudo().contains(valor))
				 return postagens.get(i);
		 }
		 return null;
	 } 
}

