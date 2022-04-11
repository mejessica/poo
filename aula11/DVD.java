import java.util,ArrayList;


public class CD{

    private String titulo;
    private String artista;
    private int numeroFaixas;
    private int duracao;
    private ArrayList<CD> cds;

    public CD (String titulo, String artista, int numeroFaixas,int duracao ){
        this.titulo = titulo;
        this.artista = artista;
        this.numeroFaixas = numeroFaixas;
        this.duracao = duracao;
        this.cds = new ArrayList<>();
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }
        
    public void setArtista(String artista){
        this.artista=artista;
    }

    public String getArtista(){]
        return this.artista;
    }

    public void addDc(String titulo, String artista, int numeroFaixas,int duracao){
        CD h = new CD(titulo, artista, numeroFaixas, duracao);
        this.cds.add(h);
    }


}
