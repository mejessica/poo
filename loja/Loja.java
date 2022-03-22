public class Loja {

    private final String nome;
    private String proprietario;
    private String lojaTipo;
    private int numero;

    public Loja(String nome, String proprietario, String lojaTipo, int numero) {
        this.nome=nome;
        this.proprietario=proprietario;
        this.lojaTipo=lojaTipo;
        this.numero=numero;
    }
    public String getNome() {
        return this.nome;
    }
    public String getProprietario() {
        return this.proprietario;
    }
    public String getLojaTipo() {
        return this.lojaTipo;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setProprietario(String proprietario) {
        this.proprietario=proprietario;
    }
    public void setLojaTipo(String lojaTipo) {
        this.lojaTipo=lojaTipo;
    }
    public void setNumero(int numero) {
        this.numero=numero;
    }
    
    @Override
    public String toString() {
        return "Loja "+this.nome+"\nProprietário: "+this.proprietario+"\nVende "+this.lojaTipo
        		+"\nNúmero "+this.numero;
    }
}
