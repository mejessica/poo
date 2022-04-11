import java.util.ArrayList;


public class DVD{

    private String titulo;
    private String diretor;
    private int numeroFaixas;
    private int duracao;
    private ArrayList<DVD> dvds;

    public DVD (String titulo, String diretor, int numeroFaixas, int duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.numeroFaixas = numeroFaixas;
        this.duracao = duracao;
        this.dvds = new ArrayList<>();
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

    public void addDvd (String titulo, String diretor, int numeroFaixas, int duracao){
        DVD h = new DVD(titulo, diretor, numeroFaixas, duracao);
        this.dvds.add(h);
    }

}
