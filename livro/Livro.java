public class Livro {

	//Atributos com encapsulamento
	private final String titulo;
	private final int pagTotal;
	private int pagLidas;
	private static int biblioteca=0;

	
	
	//construtores 
	
	public Livro(String titulo, int pagTotal, int pagLidas) {
		this.pagTotal = pagTotal;
		this.titulo = titulo;
		this.pagLidas = pagLidas = 0;
		Livro.biblioteca++;
	}
	
	
	//getters e setters
	public int getPagLidas() {
		return this.pagLidas;
	}
	
	public int setPagLidas(int pagLidas) {
			return this.pagLidas=pagLidas;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	
	public int getPagTotal() {
		return this.pagTotal;
	}
	
	
	//metodos
	
	public int recomecar(int pag) {
		
		
		int inicio = 0;
		if(pag > this.pagLidas) {
			inicio = this.pagLidas;
		} else {
			inicio = pag;
		}
		this.pagLidas -= inicio;
		return inicio;
	
		
	}
	
	public boolean ler(int pag) {
		if(this.pagLidas+pag>=pagTotal) { 
			this.pagLidas=pagTotal;
			
			return false;
		} else {
			this.pagLidas=pag;
			return true;
		}
		
	}
	
	@Override 
	public String toString() {
		return "Título: "+this.titulo+" - "+this.pagTotal+" páginas ";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!(o.getClass().isInstance(this))) return false;
		if(this==o)return true;
		
		Livro param = (Livro)o;
		return (this.pagTotal==param.pagTotal && this.titulo.equals(param.titulo));
	}
	public static int getBiblioteca() {
		return Livro.biblioteca;
	}
	
	
	
	
}
	
